package com.tianran.car.carbranddetail.modle;

import java.util.List;

public class CarBrandDetailJson {
    private String message;
    private ResultBean result;
    private int returncode;

    public static class ResultBean {
        private String brandicon;
        private String brandname;
        private List<FctlistBean> fctlist;
        private List<OtherfctlistBean> otherfctlist;

        public static class FctlistBean {
            private String name;
            private List<SerieslistBean> serieslist;

            public static class SerieslistBean {
                private String id;
                private String imgurl;
                private int isar;
                private int levelid;
                private String levelname;
                private String name;
                private String price;

                public String getId() {
                    return this.id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImgurl() {
                    return this.imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public int getLevelid() {
                    return this.levelid;
                }

                public void setLevelid(int levelid) {
                    this.levelid = levelid;
                }

                public String getLevelname() {
                    return this.levelname;
                }

                public void setLevelname(String levelname) {
                    this.levelname = levelname;
                }

                public String getPrice() {
                    return this.price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getIsar() {
                    return this.isar;
                }

                public void setIsar(int isar) {
                    this.isar = isar;
                }
            }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<SerieslistBean> getSerieslist() {
                return this.serieslist;
            }

            public void setSerieslist(List<SerieslistBean> serieslist) {
                this.serieslist = serieslist;
            }
        }

        public static class OtherfctlistBean {
            private String name;
            private List<SerieslistBean> serieslist;

            public static class SerieslistBean {
                private int id;
                private String imgurl;
                private int isar;
                private int levelid;
                private String levelname;
                private String name;
                private String price;

                public int getId() {
                    return this.id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImgurl() {
                    return this.imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public int getLevelid() {
                    return this.levelid;
                }

                public void setLevelid(int levelid) {
                    this.levelid = levelid;
                }

                public String getLevelname() {
                    return this.levelname;
                }

                public void setLevelname(String levelname) {
                    this.levelname = levelname;
                }

                public String getPrice() {
                    return this.price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getIsar() {
                    return this.isar;
                }

                public void setIsar(int isar) {
                    this.isar = isar;
                }
            }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<SerieslistBean> getSerieslist() {
                return this.serieslist;
            }

            public void setSerieslist(List<SerieslistBean> serieslist) {
                this.serieslist = serieslist;
            }
        }

        public String getBrandicon() {
            return this.brandicon;
        }

        public void setBrandicon(String brandicon) {
            this.brandicon = brandicon;
        }

        public String getBrandname() {
            return this.brandname;
        }

        public void setBrandname(String brandname) {
            this.brandname = brandname;
        }

        public List<FctlistBean> getFctlist() {
            return this.fctlist;
        }

        public void setFctlist(List<FctlistBean> fctlist) {
            this.fctlist = fctlist;
        }

        public List<OtherfctlistBean> getOtherfctlist() {
            return this.otherfctlist;
        }

        public void setOtherfctlist(List<OtherfctlistBean> otherfctlist) {
            this.otherfctlist = otherfctlist;
        }
    }

    public int getReturncode() {
        return this.returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return this.result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }
}
