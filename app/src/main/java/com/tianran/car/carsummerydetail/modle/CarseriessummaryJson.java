package com.tianran.car.carsummerydetail.modle;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CarseriessummaryJson {
    private String message;
    private ResultBean result;
    private int returncode;

    public static class ResultBean {
        private int attentionspecid;
        private String bottombtnsubtitle;
        private String bottombtntitle;
        private String bottombtnurl;
        private int brandid;
        private String brandname;
        private int canaskprice;
        private String carmalltext;
        private String carmalltitle;
        private String carmallurl;
        private int clubid;
        private int dealercount;
        private List<EnginelistBean> enginelist;
        private int explaincount;
        private String fctprice;
        private String fctpricename;
        private int hascarmall;
        private int koubeicount;
        private KoubeiinfoBean koubeiinfo;
        private String koubeiscore;
        private String levelid;
        private String levelname;
        private String logo;
        private String lowprice;
        private String name;
        private int newscount;
        private int ownerpricecount;
        private List<ParamlistBean> paramlist;
        private int piccount;
        private int seriesid;
        private ShareinfoBean shareinfo;
        private String specids;
        private List<SpectypeBean> spectype;
        private int stopsellcarnum;
        private List<TabinfosBean> tabinfos;
        private TeambuyinginfoBean teambuyinginfo;
        private String topbtntitle;
        private String topbtnurl;
        private int topiccount;
        private int type;
        @SerializedName("2sccount")
        private int value2sccount;
        private int videocount;

        public static class EnginelistBean {
            private String name;
            private List<SpeclistBean> speclist;
            private String type;

            public static class SpeclistBean {
                private int attention;
                private int canaskprice;
                private String carmailurl;
                private String description;
                private String electriccarname;
                private String electriccarval;
                private String icon;
                private int id;
                private int labletype;
                private String minprice;
                private String name;
                private String paramisshow;
                private String price;
                private String pricename;
                private int saletype;
                private String specbottomtitle;
                private String specbottomurl;
                private int state;
                private String structure;

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

                public String getDescription() {
                    return this.description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getStructure() {
                    return this.structure;
                }

                public void setStructure(String structure) {
                    this.structure = structure;
                }

                public String getParamisshow() {
                    return this.paramisshow;
                }

                public void setParamisshow(String paramisshow) {
                    this.paramisshow = paramisshow;
                }

                public int getState() {
                    return this.state;
                }

                public void setState(int state) {
                    this.state = state;
                }

                public int getAttention() {
                    return this.attention;
                }

                public void setAttention(int attention) {
                    this.attention = attention;
                }

                public String getElectriccarname() {
                    return this.electriccarname;
                }

                public void setElectriccarname(String electriccarname) {
                    this.electriccarname = electriccarname;
                }

                public String getElectriccarval() {
                    return this.electriccarval;
                }

                public void setElectriccarval(String electriccarval) {
                    this.electriccarval = electriccarval;
                }

                public String getMinprice() {
                    return this.minprice;
                }

                public void setMinprice(String minprice) {
                    this.minprice = minprice;
                }

                public int getCanaskprice() {
                    return this.canaskprice;
                }

                public void setCanaskprice(int canaskprice) {
                    this.canaskprice = canaskprice;
                }

                public String getSpecbottomtitle() {
                    return this.specbottomtitle;
                }

                public void setSpecbottomtitle(String specbottomtitle) {
                    this.specbottomtitle = specbottomtitle;
                }

                public String getSpecbottomurl() {
                    return this.specbottomurl;
                }

                public void setSpecbottomurl(String specbottomurl) {
                    this.specbottomurl = specbottomurl;
                }

                public int getSaletype() {
                    return this.saletype;
                }

                public void setSaletype(int saletype) {
                    this.saletype = saletype;
                }

                public String getIcon() {
                    return this.icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getCarmailurl() {
                    return this.carmailurl;
                }

                public void setCarmailurl(String carmailurl) {
                    this.carmailurl = carmailurl;
                }

                public String getPricename() {
                    return this.pricename;
                }

                public void setPricename(String pricename) {
                    this.pricename = pricename;
                }

                public int getLabletype() {
                    return this.labletype;
                }

                public void setLabletype(int labletype) {
                    this.labletype = labletype;
                }
            }

            public String getType() {
                return this.type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<SpeclistBean> getSpeclist() {
                return this.speclist;
            }

            public void setSpeclist(List<SpeclistBean> speclist) {
                this.speclist = speclist;
            }
        }

        public static class KoubeiinfoBean {
            private List<LabellistBean> labellist;
            private String title;

            public static class LabellistBean {
                private String labeltitle;
                private String labeltype;

                public String getLabeltitle() {
                    return this.labeltitle;
                }

                public void setLabeltitle(String labeltitle) {
                    this.labeltitle = labeltitle;
                }

                public String getLabeltype() {
                    return this.labeltype;
                }

                public void setLabeltype(String labeltype) {
                    this.labeltype = labeltype;
                }
            }

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<LabellistBean> getLabellist() {
                return this.labellist;
            }

            public void setLabellist(List<LabellistBean> labellist) {
                this.labellist = labellist;
            }
        }

        public static class ParamlistBean {
            private String name;
            private String value;

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return this.value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class ShareinfoBean {
            private String logo;
            private String title;
            private String url;

            public String getUrl() {
                return this.url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLogo() {
                return this.logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }
        }

        public static class SpectypeBean {
            private String name;
            private String value;

            public String getName() {
                return this.name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return this.value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class TabinfosBean {
            private String tabicon;
            private String tabsubtitle;
            private String tabtitle;
            private int tabtype;

            public String getTabtitle() {
                return this.tabtitle;
            }

            public void setTabtitle(String tabtitle) {
                this.tabtitle = tabtitle;
            }

            public String getTabsubtitle() {
                return this.tabsubtitle;
            }

            public void setTabsubtitle(String tabsubtitle) {
                this.tabsubtitle = tabsubtitle;
            }

            public int getTabtype() {
                return this.tabtype;
            }

            public void setTabtype(int tabtype) {
                this.tabtype = tabtype;
            }

            public String getTabicon() {
                return this.tabicon;
            }

            public void setTabicon(String tabicon) {
                this.tabicon = tabicon;
            }
        }

        public static class TeambuyinginfoBean {
            private String label;
            private String labelurl;
            private String title;
            private String url;

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return this.url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getLabel() {
                return this.label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getLabelurl() {
                return this.labelurl;
            }

            public void setLabelurl(String labelurl) {
                this.labelurl = labelurl;
            }
        }

        public String getLogo() {
            return this.logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public int getPiccount() {
            return this.piccount;
        }

        public void setPiccount(int piccount) {
            this.piccount = piccount;
        }

        public int getClubid() {
            return this.clubid;
        }

        public void setClubid(int clubid) {
            this.clubid = clubid;
        }

        public String getLevelname() {
            return this.levelname;
        }

        public void setLevelname(String levelname) {
            this.levelname = levelname;
        }

        public String getFctprice() {
            return this.fctprice;
        }

        public void setFctprice(String fctprice) {
            this.fctprice = fctprice;
        }

        public int getStopsellcarnum() {
            return this.stopsellcarnum;
        }

        public void setStopsellcarnum(int stopsellcarnum) {
            this.stopsellcarnum = stopsellcarnum;
        }

        public int getSeriesid() {
            return this.seriesid;
        }

        public void setSeriesid(int seriesid) {
            this.seriesid = seriesid;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getKoubeiscore() {
            return this.koubeiscore;
        }

        public void setKoubeiscore(String koubeiscore) {
            this.koubeiscore = koubeiscore;
        }

        public String getBottombtnsubtitle() {
            return this.bottombtnsubtitle;
        }

        public void setBottombtnsubtitle(String bottombtnsubtitle) {
            this.bottombtnsubtitle = bottombtnsubtitle;
        }

        public String getBottombtntitle() {
            return this.bottombtntitle;
        }

        public void setBottombtntitle(String bottombtntitle) {
            this.bottombtntitle = bottombtntitle;
        }

        public String getTopbtntitle() {
            return this.topbtntitle;
        }

        public void setTopbtntitle(String topbtntitle) {
            this.topbtntitle = topbtntitle;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTopbtnurl() {
            return this.topbtnurl;
        }

        public void setTopbtnurl(String topbtnurl) {
            this.topbtnurl = topbtnurl;
        }

        public String getBottombtnurl() {
            return this.bottombtnurl;
        }

        public void setBottombtnurl(String bottombtnurl) {
            this.bottombtnurl = bottombtnurl;
        }

        public int getDealercount() {
            return this.dealercount;
        }

        public void setDealercount(int dealercount) {
            this.dealercount = dealercount;
        }

        public int getHascarmall() {
            return this.hascarmall;
        }

        public void setHascarmall(int hascarmall) {
            this.hascarmall = hascarmall;
        }

        public String getCarmallurl() {
            return this.carmallurl;
        }

        public void setCarmallurl(String carmallurl) {
            this.carmallurl = carmallurl;
        }

        public String getCarmalltitle() {
            return this.carmalltitle;
        }

        public void setCarmalltitle(String carmalltitle) {
            this.carmalltitle = carmalltitle;
        }

        public String getCarmalltext() {
            return this.carmalltext;
        }

        public void setCarmalltext(String carmalltext) {
            this.carmalltext = carmalltext;
        }

        public String getLowprice() {
            return this.lowprice;
        }

        public void setLowprice(String lowprice) {
            this.lowprice = lowprice;
        }

        public int getValue2sccount() {
            return this.value2sccount;
        }

        public void setValue2sccount(int value2sccount) {
            this.value2sccount = value2sccount;
        }

        public int getBrandid() {
            return this.brandid;
        }

        public void setBrandid(int brandid) {
            this.brandid = brandid;
        }

        public String getBrandname() {
            return this.brandname;
        }

        public void setBrandname(String brandname) {
            this.brandname = brandname;
        }

        public int getKoubeicount() {
            return this.koubeicount;
        }

        public void setKoubeicount(int koubeicount) {
            this.koubeicount = koubeicount;
        }

        public int getNewscount() {
            return this.newscount;
        }

        public void setNewscount(int newscount) {
            this.newscount = newscount;
        }

        public int getVideocount() {
            return this.videocount;
        }

        public void setVideocount(int videocount) {
            this.videocount = videocount;
        }

        public int getTopiccount() {
            return this.topiccount;
        }

        public void setTopiccount(int topiccount) {
            this.topiccount = topiccount;
        }

        public int getExplaincount() {
            return this.explaincount;
        }

        public void setExplaincount(int explaincount) {
            this.explaincount = explaincount;
        }

        public int getAttentionspecid() {
            return this.attentionspecid;
        }

        public void setAttentionspecid(int attentionspecid) {
            this.attentionspecid = attentionspecid;
        }

        public int getCanaskprice() {
            return this.canaskprice;
        }

        public void setCanaskprice(int canaskprice) {
            this.canaskprice = canaskprice;
        }

        public ShareinfoBean getShareinfo() {
            return this.shareinfo;
        }

        public void setShareinfo(ShareinfoBean shareinfo) {
            this.shareinfo = shareinfo;
        }

        public int getOwnerpricecount() {
            return this.ownerpricecount;
        }

        public void setOwnerpricecount(int ownerpricecount) {
            this.ownerpricecount = ownerpricecount;
        }

        public String getSpecids() {
            return this.specids;
        }

        public void setSpecids(String specids) {
            this.specids = specids;
        }

        public KoubeiinfoBean getKoubeiinfo() {
            return this.koubeiinfo;
        }

        public void setKoubeiinfo(KoubeiinfoBean koubeiinfo) {
            this.koubeiinfo = koubeiinfo;
        }

        public TeambuyinginfoBean getTeambuyinginfo() {
            return this.teambuyinginfo;
        }

        public void setTeambuyinginfo(TeambuyinginfoBean teambuyinginfo) {
            this.teambuyinginfo = teambuyinginfo;
        }

        public String getLevelid() {
            return this.levelid;
        }

        public void setLevelid(String levelid) {
            this.levelid = levelid;
        }

        public String getFctpricename() {
            return this.fctpricename;
        }

        public void setFctpricename(String fctpricename) {
            this.fctpricename = fctpricename;
        }

        public List<ParamlistBean> getParamlist() {
            return this.paramlist;
        }

        public void setParamlist(List<ParamlistBean> paramlist) {
            this.paramlist = paramlist;
        }

        public List<SpectypeBean> getSpectype() {
            return this.spectype;
        }

        public void setSpectype(List<SpectypeBean> spectype) {
            this.spectype = spectype;
        }

        public List<EnginelistBean> getEnginelist() {
            return this.enginelist;
        }

        public void setEnginelist(List<EnginelistBean> enginelist) {
            this.enginelist = enginelist;
        }

        public List<TabinfosBean> getTabinfos() {
            return this.tabinfos;
        }

        public void setTabinfos(List<TabinfosBean> tabinfos) {
            this.tabinfos = tabinfos;
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
