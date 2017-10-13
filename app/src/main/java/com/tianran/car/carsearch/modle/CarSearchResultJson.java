package com.tianran.car.carsearch.modle;

import java.util.List;

public class CarSearchResultJson {
    private String message;
    private ResultBean result;
    private int returncode;

    public static class ResultBean {
        private int pagecount;
        private int pageindex;
        private int rowcount;
        private List<SeriesitemsBean> seriesitems;
        private int totalspeccount;

        public static class SeriesitemsBean {
            private String brandname;
            private int count;
            private int id;
            private String img;
            private String level;
            private String name;
            private String price;
            private String seriesname;
            private List<SpecitemgroupsBean> specitemgroups;

            public static class SpecitemgroupsBean {
                private String groupname;
                private List<SpecitemsBean> specitems;

                public static class SpecitemsBean {
                    private String description;
                    private int id;
                    private String name;
                    private int paramisshow;
                    private String price;
                    private int state;

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

                    public String getPrice() {
                        return this.price;
                    }

                    public void setPrice(String price) {
                        this.price = price;
                    }

                    public int getState() {
                        return this.state;
                    }

                    public void setState(int state) {
                        this.state = state;
                    }

                    public String getDescription() {
                        return this.description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public int getParamisshow() {
                        return this.paramisshow;
                    }

                    public void setParamisshow(int paramisshow) {
                        this.paramisshow = paramisshow;
                    }
                }

                public String getGroupname() {
                    return this.groupname;
                }

                public void setGroupname(String groupname) {
                    this.groupname = groupname;
                }

                public List<SpecitemsBean> getSpecitems() {
                    return this.specitems;
                }

                public void setSpecitems(List<SpecitemsBean> specitems) {
                    this.specitems = specitems;
                }
            }

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

            public String getSeriesname() {
                return this.seriesname;
            }

            public void setSeriesname(String seriesname) {
                this.seriesname = seriesname;
            }

            public String getImg() {
                return this.img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getLevel() {
                return this.level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getPrice() {
                return this.price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getCount() {
                return this.count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getBrandname() {
                return this.brandname;
            }

            public void setBrandname(String brandname) {
                this.brandname = brandname;
            }

            public List<SpecitemgroupsBean> getSpecitemgroups() {
                return this.specitemgroups;
            }

            public void setSpecitemgroups(List<SpecitemgroupsBean> specitemgroups) {
                this.specitemgroups = specitemgroups;
            }
        }

        public int getPageindex() {
            return this.pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public int getPagecount() {
            return this.pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getRowcount() {
            return this.rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public int getTotalspeccount() {
            return this.totalspeccount;
        }

        public void setTotalspeccount(int totalspeccount) {
            this.totalspeccount = totalspeccount;
        }

        public List<SeriesitemsBean> getSeriesitems() {
            return this.seriesitems;
        }

        public void setSeriesitems(List<SeriesitemsBean> seriesitems) {
            this.seriesitems = seriesitems;
        }
    }

    public ResultBean getResult() {
        return this.result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
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
}
