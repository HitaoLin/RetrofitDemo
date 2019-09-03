package com.example.retrofitdemo;

public class IncomeStatement {

    /**
     * code : 1
     * msg : 请求成功
     * data : {"gonggao":"【重要公告】下单勿用\u201c拼多多红包\u201d，会影响订单跟踪，造成没有佣金！二、因拼多多数据延迟，实时订单约2分钟之后更新。下单后不会立即显示。如有更多疑问，请查看⇗[帮助]","gonggao2":"  【温馨提示】实时订单需2分钟左右延迟更新。下单后不会立即显示，请稍安勿躁。订单技术服务费是由拼多多官方收取，WEMALL不收取任何费用。如有更多疑问，请点击右上角查看[帮助]文档~","ketixian_jifen":null,"last_month_jifen":"0.00","this_month_jifen":"0.00","today":{"dianji":"0","fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"},"yesterday":{"dianji":"0","fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"},"day7":{"dianji":0,"fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"},"day30":{"dianji":0,"fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"}}
     */

    private String code;
    private String msg;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * gonggao : 【重要公告】下单勿用“拼多多红包”，会影响订单跟踪，造成没有佣金！二、因拼多多数据延迟，实时订单约2分钟之后更新。下单后不会立即显示。如有更多疑问，请查看⇗[帮助]
         * gonggao2 :   【温馨提示】实时订单需2分钟左右延迟更新。下单后不会立即显示，请稍安勿躁。订单技术服务费是由拼多多官方收取，WEMALL不收取任何费用。如有更多疑问，请点击右上角查看[帮助]文档~
         * ketixian_jifen : null
         * last_month_jifen : 0.00
         * this_month_jifen : 0.00
         * today : {"dianji":"0","fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"}
         * yesterday : {"dianji":"0","fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"}
         * day7 : {"dianji":0,"fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"}
         * day30 : {"dianji":0,"fukuan":"0","yugu_jifen":"0.00","jiesuan_jifen":"0.00"}
         */

        private String gonggao;
        private String gonggao2;
        private Object ketixian_jifen;
        private String last_month_jifen;
        private String this_month_jifen;
        private TodayBean today;
        private YesterdayBean yesterday;
        private Day7Bean day7;
        private Day30Bean day30;

        public String getGonggao() {
            return gonggao;
        }

        public void setGonggao(String gonggao) {
            this.gonggao = gonggao;
        }

        public String getGonggao2() {
            return gonggao2;
        }

        public void setGonggao2(String gonggao2) {
            this.gonggao2 = gonggao2;
        }

        public Object getKetixian_jifen() {
            return ketixian_jifen;
        }

        public void setKetixian_jifen(Object ketixian_jifen) {
            this.ketixian_jifen = ketixian_jifen;
        }

        public String getLast_month_jifen() {
            return last_month_jifen;
        }

        public void setLast_month_jifen(String last_month_jifen) {
            this.last_month_jifen = last_month_jifen;
        }

        public String getThis_month_jifen() {
            return this_month_jifen;
        }

        public void setThis_month_jifen(String this_month_jifen) {
            this.this_month_jifen = this_month_jifen;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public Day7Bean getDay7() {
            return day7;
        }

        public void setDay7(Day7Bean day7) {
            this.day7 = day7;
        }

        public Day30Bean getDay30() {
            return day30;
        }

        public void setDay30(Day30Bean day30) {
            this.day30 = day30;
        }

        public static class TodayBean {
            /**
             * dianji : 0
             * fukuan : 0
             * yugu_jifen : 0.00
             * jiesuan_jifen : 0.00
             */

            private String dianji;
            private String fukuan;
            private String yugu_jifen;
            private String jiesuan_jifen;

            public String getDianji() {
                return dianji;
            }

            public void setDianji(String dianji) {
                this.dianji = dianji;
            }

            public String getFukuan() {
                return fukuan;
            }

            public void setFukuan(String fukuan) {
                this.fukuan = fukuan;
            }

            public String getYugu_jifen() {
                return yugu_jifen;
            }

            public void setYugu_jifen(String yugu_jifen) {
                this.yugu_jifen = yugu_jifen;
            }

            public String getJiesuan_jifen() {
                return jiesuan_jifen;
            }

            public void setJiesuan_jifen(String jiesuan_jifen) {
                this.jiesuan_jifen = jiesuan_jifen;
            }
        }

        public static class YesterdayBean {
            /**
             * dianji : 0
             * fukuan : 0
             * yugu_jifen : 0.00
             * jiesuan_jifen : 0.00
             */

            private String dianji;
            private String fukuan;
            private String yugu_jifen;
            private String jiesuan_jifen;

            public String getDianji() {
                return dianji;
            }

            public void setDianji(String dianji) {
                this.dianji = dianji;
            }

            public String getFukuan() {
                return fukuan;
            }

            public void setFukuan(String fukuan) {
                this.fukuan = fukuan;
            }

            public String getYugu_jifen() {
                return yugu_jifen;
            }

            public void setYugu_jifen(String yugu_jifen) {
                this.yugu_jifen = yugu_jifen;
            }

            public String getJiesuan_jifen() {
                return jiesuan_jifen;
            }

            public void setJiesuan_jifen(String jiesuan_jifen) {
                this.jiesuan_jifen = jiesuan_jifen;
            }
        }

        public static class Day7Bean {
            /**
             * dianji : 0
             * fukuan : 0
             * yugu_jifen : 0.00
             * jiesuan_jifen : 0.00
             */

            private int dianji;
            private String fukuan;
            private String yugu_jifen;
            private String jiesuan_jifen;

            public int getDianji() {
                return dianji;
            }

            public void setDianji(int dianji) {
                this.dianji = dianji;
            }

            public String getFukuan() {
                return fukuan;
            }

            public void setFukuan(String fukuan) {
                this.fukuan = fukuan;
            }

            public String getYugu_jifen() {
                return yugu_jifen;
            }

            public void setYugu_jifen(String yugu_jifen) {
                this.yugu_jifen = yugu_jifen;
            }

            public String getJiesuan_jifen() {
                return jiesuan_jifen;
            }

            public void setJiesuan_jifen(String jiesuan_jifen) {
                this.jiesuan_jifen = jiesuan_jifen;
            }
        }

        public static class Day30Bean {
            /**
             * dianji : 0
             * fukuan : 0
             * yugu_jifen : 0.00
             * jiesuan_jifen : 0.00
             */

            private int dianji;
            private String fukuan;
            private String yugu_jifen;
            private String jiesuan_jifen;

            public int getDianji() {
                return dianji;
            }

            public void setDianji(int dianji) {
                this.dianji = dianji;
            }

            public String getFukuan() {
                return fukuan;
            }

            public void setFukuan(String fukuan) {
                this.fukuan = fukuan;
            }

            public String getYugu_jifen() {
                return yugu_jifen;
            }

            public void setYugu_jifen(String yugu_jifen) {
                this.yugu_jifen = yugu_jifen;
            }

            public String getJiesuan_jifen() {
                return jiesuan_jifen;
            }

            public void setJiesuan_jifen(String jiesuan_jifen) {
                this.jiesuan_jifen = jiesuan_jifen;
            }
        }
    }
}
