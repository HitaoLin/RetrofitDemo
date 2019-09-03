package com.example.retrofitdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("banner/json")
    Call<Banner> getBanner();

    //https://www.wanandroid.com/project/list/1/json?cid=294   ?cid=294 用@Query   /1/  @Path
    //项目列表数据
    @GET("project/list/{page}/json")
    Call<ProjectList> getProjectList(@Path("page") int page,@Query("cid") String cid);

    //首页文章列表
    @GET("article/list/{page}/json")
    Call<HomeArticle> getHomeArticle(@Path("page") int page);

    //表单
    //搜索
    @FormUrlEncoded
    @POST("article/query/0/json")
    Call<Search> getSearch(@Field("k") String key);



}
