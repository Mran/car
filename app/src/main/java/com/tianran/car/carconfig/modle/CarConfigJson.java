package com.tianran.car.carconfig.modle;

import java.util.List;

public class CarConfigJson {
    private String message;
    private ResultBean result;
    private int returncode;

    public static class ResultBean {
        private String bigpicprefix;
        private List<ConfigitemsBean> configitems;
        private List<ParamitemsBean> paramitems;
        private String smallpicprefix;
        private SpecinfoBean specinfo;

        public static class ConfigitemsBean {
            private List<ItemsBean> items;
            private String itemtype;

            public static class ItemsBean {
                private List<ModelexcessidsBean> modelexcessids;
                private String name;

                public static class ModelexcessidsBean {
                    private int id;
                    private String value;

                    public int getId() {
                        return this.id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getValue() {
                        return this.value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ModelexcessidsBean> getModelexcessids() {
                    return this.modelexcessids;
                }

                public void setModelexcessids(List<ModelexcessidsBean> modelexcessids) {
                    this.modelexcessids = modelexcessids;
                }
            }

            public String getItemtype() {
                return this.itemtype;
            }

            public void setItemtype(String itemtype) {
                this.itemtype = itemtype;
            }

            public List<ItemsBean> getItems() {
                return this.items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }
        }

        public static class ParamitemsBean {
            private List<ItemsBean> items;
            private String itemtype;

            public static class ItemsBean {
                private List<ModelexcessidsBean> modelexcessids;
                private String name;

                public static class ModelexcessidsBean {
                    private int id;
                    private String value;

                    public int getId() {
                        return this.id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getValue() {
                        return this.value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<ModelexcessidsBean> getModelexcessids() {
                    return this.modelexcessids;
                }

                public void setModelexcessids(List<ModelexcessidsBean> modelexcessids) {
                    this.modelexcessids = modelexcessids;
                }
            }

            public String getItemtype() {
                return this.itemtype;
            }

            public void setItemtype(String itemtype) {
                this.itemtype = itemtype;
            }

            public List<ItemsBean> getItems() {
                return this.items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }
        }

        public static class SpecinfoBean {
            private List<SpecitemsBean> specitems;

            public static class SpecitemsBean {
                private AskpriceinfoBean askpriceinfo;
                private int canaskprice;
                private int count;
                private int paramisshow;
                private List<?> picitems;
                private int seriesid;
                private String seriesname;
                private int specid;

                public static class AskpriceinfoBean {
                    private String askpricesubtitle;
                    private String askpricetitle;
                    private String askpriceurl;
                    private int canaskprice;
                    private int type;

                    public int getCanaskprice() {
                        return this.canaskprice;
                    }

                    public void setCanaskprice(int canaskprice) {
                        this.canaskprice = canaskprice;
                    }

                    public int getType() {
                        return this.type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getAskpricetitle() {
                        return this.askpricetitle;
                    }

                    public void setAskpricetitle(String askpricetitle) {
                        this.askpricetitle = askpricetitle;
                    }

                    public String getAskpricesubtitle() {
                        return this.askpricesubtitle;
                    }

                    public void setAskpricesubtitle(String askpricesubtitle) {
                        this.askpricesubtitle = askpricesubtitle;
                    }

                    public String getAskpriceurl() {
                        return this.askpriceurl;
                    }

                    public void setAskpriceurl(String askpriceurl) {
                        this.askpriceurl = askpriceurl;
                    }
                }

                public int getSpecid() {
                    return this.specid;
                }

                public void setSpecid(int specid) {
                    this.specid = specid;
                }

                public int getCount() {
                    return this.count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getParamisshow() {
                    return this.paramisshow;
                }

                public void setParamisshow(int paramisshow) {
                    this.paramisshow = paramisshow;
                }

                public int getSeriesid() {
                    return this.seriesid;
                }

                public void setSeriesid(int seriesid) {
                    this.seriesid = seriesid;
                }

                public String getSeriesname() {
                    return this.seriesname;
                }

                public void setSeriesname(String seriesname) {
                    this.seriesname = seriesname;
                }

                public int getCanaskprice() {
                    return this.canaskprice;
                }

                public void setCanaskprice(int canaskprice) {
                    this.canaskprice = canaskprice;
                }

                public AskpriceinfoBean getAskpriceinfo() {
                    return this.askpriceinfo;
                }

                public void setAskpriceinfo(AskpriceinfoBean askpriceinfo) {
                    this.askpriceinfo = askpriceinfo;
                }

                public List<?> getPicitems() {
                    return this.picitems;
                }

                public void setPicitems(List<?> picitems) {
                    this.picitems = picitems;
                }
            }

            public List<SpecitemsBean> getSpecitems() {
                return this.specitems;
            }

            public void setSpecitems(List<SpecitemsBean> specitems) {
                this.specitems = specitems;
            }
        }

        public String getBigpicprefix() {
            return this.bigpicprefix;
        }

        public void setBigpicprefix(String bigpicprefix) {
            this.bigpicprefix = bigpicprefix;
        }

        public String getSmallpicprefix() {
            return this.smallpicprefix;
        }

        public void setSmallpicprefix(String smallpicprefix) {
            this.smallpicprefix = smallpicprefix;
        }

        public SpecinfoBean getSpecinfo() {
            return this.specinfo;
        }

        public void setSpecinfo(SpecinfoBean specinfo) {
            this.specinfo = specinfo;
        }

        public List<ParamitemsBean> getParamitems() {
            return this.paramitems;
        }

        public void setParamitems(List<ParamitemsBean> paramitems) {
            this.paramitems = paramitems;
        }

        public List<ConfigitemsBean> getConfigitems() {
            return this.configitems;
        }

        public void setConfigitems(List<ConfigitemsBean> configitems) {
            this.configitems = configitems;
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
