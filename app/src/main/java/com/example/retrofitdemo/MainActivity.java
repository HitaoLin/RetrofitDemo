package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_get;
    TextView tv_show;
    Retrofit retrofit;
    Api api;
    List<Banner.DataBean> mDataBeans;
    String title;
    List<String> titleList = new ArrayList<>();
    List<HomeArticle.DataBean.DatasBean> mHomeArticleDatasBeanList;
    String chapterName;
    List<String> chapterNameList = new ArrayList<>();
    List<ProjectList.DataBean.DatasBean> mProjectListDatas;
    String superChapterName;
    List<String> superChapterNameList = new ArrayList<>();
    List<Search.DataBean.DatasBean> msearchDataBeans;
    String searchTitle;
    List<String> searchTitleList = new ArrayList<>();

    Button bt_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        api = retrofit.create(Api.class);


    }

    private void initView() {

        btn_get = findViewById(R.id.get);
        btn_get.setOnClickListener(this);

        tv_show = findViewById(R.id.tv_show);

        bt_login = findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get:
                Call<Banner> call = api.getBanner();
                call.enqueue(new Callback<Banner>() {
                    @Override
                    public void onResponse(Call<Banner> call, Response<Banner> response) {//主线程运行

//                        String result = response.body().toString();
//                        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

                        String errorCode = String.valueOf(response.body().getErrorCode());
                        String errorMsg = response.body().getErrorMsg();


                        mDataBeans = response.body().getData();
                        for (int i = 0; i < mDataBeans.size(); i++) {
                            title = mDataBeans.get(i).getTitle();
                            titleList.add(title);
                        }

                        Toast.makeText(MainActivity.this, "errorCode:" + errorCode + ",errorMsg:" + errorMsg + ",title0:" + titleList.get(0), Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<Banner> call, Throwable t) {

                    }
                });

                Call<HomeArticle> homeArticleCall = api.getHomeArticle(0);
                homeArticleCall.enqueue(new Callback<HomeArticle>() {
                    @Override
                    public void onResponse(Call<HomeArticle> call, Response<HomeArticle> response) {
                        mHomeArticleDatasBeanList = response.body().getData().getDatas();
                        for (int i = 0; i < mHomeArticleDatasBeanList.size(); i++) {
                            chapterName = mHomeArticleDatasBeanList.get(i).getChapterName();
                            chapterNameList.add(chapterName);
                        }

                    }

                    @Override
                    public void onFailure(Call<HomeArticle> call, Throwable t) {

                    }
                });

                Call<ProjectList> projectListCall = api.getProjectList(0, "294");
                projectListCall.enqueue(new Callback<ProjectList>() {
                    @Override
                    public void onResponse(Call<ProjectList> call, Response<ProjectList> response) {
                        mProjectListDatas = response.body().getData().getDatas();
                        for (int i = 0; i < mProjectListDatas.size(); i++) {
                            superChapterName = mProjectListDatas.get(i).getSuperChapterName();
                            superChapterNameList.add(superChapterName);
                        }
                        tv_show.setText("superChapterName:" + superChapterNameList.get(0));
                    }

                    @Override
                    public void onFailure(Call<ProjectList> call, Throwable t) {

                    }
                });

                api.getSearch("面试").enqueue(new Callback<Search>() {
                    @Override
                    public void onResponse(Call<Search> call, Response<Search> response) {
                        msearchDataBeans = response.body().getData().getDatas();
                        for (int i = 0; i < msearchDataBeans.size(); i++) {
                            searchTitle = msearchDataBeans.get(i).getTitle();
                            searchTitleList.add(searchTitle);
                        }

                        tv_show.setText("searchTitle:" + searchTitleList.get(0));

                    }

                    @Override
                    public void onFailure(Call<Search> call, Throwable t) {

                    }
                });

                break;

            case R.id.bt_login:

                break;


        }
    }

}
