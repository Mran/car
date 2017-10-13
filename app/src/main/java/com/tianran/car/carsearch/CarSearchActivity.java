package com.tianran.car.carsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tianran.car.CarCheckButton;
import com.tianran.car.CheckButton;
import com.tianran.car.R;
import io.apptik.widget.MultiSlider;
import io.apptik.widget.MultiSlider.OnThumbValueChangeListener;
import io.apptik.widget.MultiSlider.Thumb;
import java.util.ArrayList;
import java.util.List;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class CarSearchActivity extends AppCompatActivity implements OnClickListener {
    private CheckButton _1_0;
    private CheckButton _1_1_1_6;
    private CheckButton _1_7_2_0;
    private CheckButton _2_1_2_5l;
    private CheckButton _2_6_3_0l;
    private CheckButton _3_1_4_0l;
    private CheckButton _4_0;
    private String attribute = "0";
    private String bids = "";
    private List<Button> buttons;
    private TextView choosed;
    private String cids = "";
    private String configs = "";
    private String drives = "";
    private String dsc = "";
    private Button enter;
    private String fids = "";
    private String flowmode = "";
    private String gs = "";
    private String id;
    private String levels = "";
    private CheckButton mAmerica;
    private CheckButton mChadianshihundong;
    private CheckButton mChaiyou;
    private CheckButton mCheshenesp;
    private CheckButton mChina;
    private CheckButton mChundiandong;
    private CarCheckButton mDaSUV;
    private CheckButton mDaocheleida;
    private CheckButton mDaocheyingxiang;
    private CarCheckButton mDaxingche;
    private CheckButton mDiandongtianchuang;
    private CheckButton mDiandongtiaojiezuoyi;
    private CheckButton mDingsuxunhang;
    private CheckButton mDuogongnengfangxiangpan;
    private CheckButton mEnglish;
    private CheckButton mFivesite;
    private CheckButton mFoursite;
    private CheckButton mFrench;
    private CheckButton mGermany;
    private CheckButton mGpsdaohang;
    private CheckButton mHezi;
    private CheckButton mHouqu;
    private CheckButton mHuoche;
    private CheckButton mJanpanese;
    private CarCheckButton mJincouSUV;
    private CarCheckButton mJincouxing;
    private CheckButton mJinkou;
    private CheckButton mJixiezengya;
    private CheckButton mKeche;
    private CheckButton mKorea;
    private CheckButton mLanyachezaidianhua;
    private CheckButton mLeddadeng;
    private CheckButton mLiangxiang;
    private CheckButton mLvxingban;
    private CarCheckButton mMpv;
    private CheckButton mOtherCountry;
    private CarCheckButton mPaoche;
    private CarCheckButton mPikache;
    private CheckButton mQianqu;
    private CarCheckButton mQingka;
    private CheckButton mQiyou;
    private CheckButton mQuanjingtianchuang;
    private CheckButton mQuanzidongkongtiao;
    private CheckButton mRijianxingchedeng;
    private CheckButton mRuandingchangpengche;
    private CheckButton mSanxiang;
    private CheckButton mSevensite;
    private CheckButton mSevensiteup;
    private CheckButton mShanqidadeng;
    private CheckButton mShouZiYiTi;
    private CheckButton mShoudong;
    private CheckButton mShouziyiti;
    private CheckButton mShuanglihe;
    private CheckButton mSiqu;
    private CheckButton mSixsite;
    private CheckButton mTwosite;
    private CarCheckButton mWeika;
    private CarCheckButton mWeimian;
    private CarCheckButton mWeixingche;
    private CheckButton mWolunzengya;
    private CheckButton mWujibiansu;
    private CheckButton mWuyaoshiqidong;
    private CheckButton mXianbei;
    private CarCheckButton mXiaoSUV;
    private CarCheckButton mXiaoxingche;
    private Button mXuanzepinpai;
    private CheckButton mYingdingchangpengche;
    private CheckButton mYingdingpaoche;
    private CheckButton mYoudianhunhe;
    private CheckButton mZengchengshi;
    private CheckButton mZhenpizuoyi;
    private CarCheckButton mZhongSUV;
    private CarCheckButton mZhongdaSUV;
    private CarCheckButton mZhongdaxing;
    private CarCheckButton mZhongxingche;
    private CheckButton mZidongpoche;
    private CheckButton mZiranxiqi;
    private CheckButton mZizhu;
    private CheckButton mZuoyijiare;
    String max = "0";
    private String maxp = "0";
    String min = "0";
    private String minp = "0";
    private String order = "2";
    private String params;
    private String pindex = "1";
    private String pm = "2";
    private TextView price;
    private String psize = "20";
    private MultiSlider range_slider;
    private TextView remake;
    private String seats = "";
    private String sts = "";
    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_filter_detail);
        bindView();
        initView();
        initData();
    }

    void initData() {
        this.buttons = new ArrayList();
        this.buttons.add(this.mWeixingche);
        this.buttons.add(this.mXiaoxingche);
        this.buttons.add(this.mJincouxing);
        this.buttons.add(this.mZhongxingche);
        this.buttons.add(this.mZhongdaxing);
        this.buttons.add(this.mXiaoSUV);
        this.buttons.add(this.mDaxingche);
        this.buttons.add(this.mMpv);
        this.buttons.add(this.mPaoche);
        this.buttons.add(this.mJincouSUV);
        this.buttons.add(this.mZhongdaSUV);
        this.buttons.add(this.mZhongSUV);
        this.buttons.add(this.mDaSUV);
        this.buttons.add(this.mPikache);
        this.buttons.add(this.mWeimian);
        this.buttons.add(this.mWeika);
        this.buttons.add(this.mQingka);
        this.buttons.add(this.mChina);
        this.buttons.add(this.mGermany);
        this.buttons.add(this.mAmerica);
        this.buttons.add(this.mJanpanese);
        this.buttons.add(this.mFrench);
        this.buttons.add(this.mKorea);
        this.buttons.add(this.mEnglish);
        this.buttons.add(this.mOtherCountry);
        this.buttons.add(this.mShoudong);
        this.buttons.add(this.mShouZiYiTi);
        this.buttons.add(this.mQiyou);
        this.buttons.add(this.mChaiyou);
        this.buttons.add(this.mYoudianhunhe);
        this.buttons.add(this.mChundiandong);
        this.buttons.add(this.mChadianshihundong);
        this.buttons.add(this.mZengchengshi);
        this.buttons.add(this.mTwosite);
        this.buttons.add(this.mFivesite);
        this.buttons.add(this.mSixsite);
        this.buttons.add(this.mSevensite);
        this.buttons.add(this.mSevensiteup);
        this.buttons.add(this.mLiangxiang);
        this.buttons.add(this.mSanxiang);
        this.buttons.add(this.mXianbei);
        this.buttons.add(this.mLvxingban);
        this.buttons.add(this.mYingdingchangpengche);
        this.buttons.add(this.mRuandingchangpengche);
        this.buttons.add(this.mYingdingpaoche);
        this.buttons.add(this.mKeche);
        this.buttons.add(this.mHuoche);
        this.buttons.add(this.mZizhu);
        this.buttons.add(this.mHezi);
        this.buttons.add(this.mJinkou);
        this.buttons.add(this.mZiranxiqi);
        this.buttons.add(this.mWolunzengya);
        this.buttons.add(this.mJixiezengya);
        this.buttons.add(this.mQianqu);
        this.buttons.add(this.mHouqu);
        this.buttons.add(this.mSiqu);
        this.buttons.add(this.mQuanjingtianchuang);
        this.buttons.add(this.mDiandongtianchuang);
        this.buttons.add(this.mDiandongtiaojiezuoyi);
        this.buttons.add(this.mCheshenesp);
        this.buttons.add(this.mShanqidadeng);
        this.buttons.add(this.mGpsdaohang);
        this.buttons.add(this.mDingsuxunhang);
        this.buttons.add(this.mZhenpizuoyi);
        this.buttons.add(this.mDaocheleida);
        this.buttons.add(this.mQuanzidongkongtiao);
        this.buttons.add(this.mDuogongnengfangxiangpan);
        this.buttons.add(this.mLeddadeng);
        this.buttons.add(this.mDaocheyingxiang);
        this.buttons.add(this.mWuyaoshiqidong);
        this.buttons.add(this.mZuoyijiare);
        this.buttons.add(this.mRijianxingchedeng);
        this.buttons.add(this.mZidongpoche);
        this.buttons.add(this.mLanyachezaidianhua);
        this.buttons.add(this.mShouziyiti);
        this.buttons.add(this.mWujibiansu);
        this.buttons.add(this.mShuanglihe);
        this.buttons.add(this.mFoursite);
        this.buttons.add(this._1_0);
        this.buttons.add(this._1_1_1_6);
        this.buttons.add(this._1_7_2_0);
        this.buttons.add(this._2_1_2_5l);
        this.buttons.add(this._2_6_3_0l);
        this.buttons.add(this._3_1_4_0l);
        this.buttons.add(this._4_0);
    }

    void bindView() {
        this.toolbar = (Toolbar) findViewById(R.id.activity_car_filter_toolbar);
    }

    void initView() {
        setSupportActionBar(this.toolbar);
        setTitle("条件选车");
        this.toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));
        this.toolbar.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.ic_71_interface_label_close));
        this.toolbar.setNavigationOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CarSearchActivity.this.finish();
            }
        });
        this.mXuanzepinpai = (Button) findViewById(R.id.xuanzepinpai);
        this.mXuanzepinpai.setOnClickListener(this);
        this.mWeixingche = (CarCheckButton) findViewById(R.id.weixingche);
        this.mWeixingche.setOnClickListener(this);
        this.mXiaoxingche = (CarCheckButton) findViewById(R.id.xiaoxingche);
        this.mXiaoxingche.setOnClickListener(this);
        this.mJincouxing = (CarCheckButton) findViewById(R.id.jincouxing);
        this.mJincouxing.setOnClickListener(this);
        this.mZhongxingche = (CarCheckButton) findViewById(R.id.zhongxingche);
        this.mZhongxingche.setOnClickListener(this);
        this.mZhongdaxing = (CarCheckButton) findViewById(R.id.zhongdaxing);
        this.mZhongdaxing.setOnClickListener(this);
        this.mXiaoSUV = (CarCheckButton) findViewById(R.id.xiaoSUV);
        this.mXiaoSUV.setOnClickListener(this);
        this.mDaxingche = (CarCheckButton) findViewById(R.id.daxingche);
        this.mDaxingche.setOnClickListener(this);
        this.mMpv = (CarCheckButton) findViewById(R.id.mpv);
        this.mMpv.setOnClickListener(this);
        this.mPaoche = (CarCheckButton) findViewById(R.id.paoche);
        this.mPaoche.setOnClickListener(this);
        this.mPikache = (CarCheckButton) findViewById(R.id.pikache);
        this.mPikache.setOnClickListener(this);
        this.mWeimian = (CarCheckButton) findViewById(R.id.weimian);
        this.mWeimian.setOnClickListener(this);
        this.mWeika = (CarCheckButton) findViewById(R.id.weika);
        this.mWeika.setOnClickListener(this);
        this.mQingka = (CarCheckButton) findViewById(R.id.qingka);
        this.mQingka.setOnClickListener(this);
        this.mChina = (CheckButton) findViewById(R.id.china);
        this.mChina.setOnClickListener(this);
        this.mGermany = (CheckButton) findViewById(R.id.germany);
        this.mGermany.setOnClickListener(this);
        this.mAmerica = (CheckButton) findViewById(R.id.america);
        this.mAmerica.setOnClickListener(this);
        this.mJanpanese = (CheckButton) findViewById(R.id.janpanese);
        this.mJanpanese.setOnClickListener(this);
        this.mFrench = (CheckButton) findViewById(R.id.french);
        this.mFrench.setOnClickListener(this);
        this.mKorea = (CheckButton) findViewById(R.id.Korea);
        this.mKorea.setOnClickListener(this);
        this.mEnglish = (CheckButton) findViewById(R.id.english);
        this.mEnglish.setOnClickListener(this);
        this.mOtherCountry = (CheckButton) findViewById(R.id.other_country);
        this.mOtherCountry.setOnClickListener(this);
        this.mShoudong = (CheckButton) findViewById(R.id.shoudong);
        this.mShoudong.setOnClickListener(this);
        this.mShouZiYiTi = (CheckButton) findViewById(R.id.shouziyiti);
        this.mShouZiYiTi.setOnClickListener(this);
        this.mQiyou = (CheckButton) findViewById(R.id.qiyou);
        this.mQiyou.setOnClickListener(this);
        this.mChaiyou = (CheckButton) findViewById(R.id.chaiyou);
        this.mChaiyou.setOnClickListener(this);
        this.mYoudianhunhe = (CheckButton) findViewById(R.id.youdianhunhe);
        this.mYoudianhunhe.setOnClickListener(this);
        this.mChundiandong = (CheckButton) findViewById(R.id.chundiandong);
        this.mChundiandong.setOnClickListener(this);
        this.mChadianshihundong = (CheckButton) findViewById(R.id.chadianshihundong);
        this.mChadianshihundong.setOnClickListener(this);
        this.mZengchengshi = (CheckButton) findViewById(R.id.zengchengshi);
        this.mZengchengshi.setOnClickListener(this);
        this.mTwosite = (CheckButton) findViewById(R.id.twosite);
        this.mTwosite.setOnClickListener(this);
        this.mFivesite = (CheckButton) findViewById(R.id.fivesite);
        this.mFivesite.setOnClickListener(this);
        this.mSixsite = (CheckButton) findViewById(R.id.sixsite);
        this.mSixsite.setOnClickListener(this);
        this.mSevensite = (CheckButton) findViewById(R.id.sevensite);
        this.mSevensite.setOnClickListener(this);
        this.mSevensiteup = (CheckButton) findViewById(R.id.sevensiteup);
        this.mSevensiteup.setOnClickListener(this);
        this.mLiangxiang = (CheckButton) findViewById(R.id.liangxiang);
        this.mLiangxiang.setOnClickListener(this);
        this.mSanxiang = (CheckButton) findViewById(R.id.sanxiang);
        this.mSanxiang.setOnClickListener(this);
        this.mXianbei = (CheckButton) findViewById(R.id.xianbei);
        this.mXianbei.setOnClickListener(this);
        this.mLvxingban = (CheckButton) findViewById(R.id.lvxingban);
        this.mLvxingban.setOnClickListener(this);
        this.mYingdingchangpengche = (CheckButton) findViewById(R.id.yingdingchangpengche);
        this.mYingdingchangpengche.setOnClickListener(this);
        this.mRuandingchangpengche = (CheckButton) findViewById(R.id.ruandingchangpengche);
        this.mRuandingchangpengche.setOnClickListener(this);
        this.mYingdingpaoche = (CheckButton) findViewById(R.id.yingdingpaoche);
        this.mYingdingpaoche.setOnClickListener(this);
        this.mKeche = (CheckButton) findViewById(R.id.keche);
        this.mKeche.setOnClickListener(this);
        this.mHuoche = (CheckButton) findViewById(R.id.huoche);
        this.mHuoche.setOnClickListener(this);
        this.mZizhu = (CheckButton) findViewById(R.id.zizhu);
        this.mZizhu.setOnClickListener(this);
        this.mHezi = (CheckButton) findViewById(R.id.hezi);
        this.mHezi.setOnClickListener(this);
        this.mJinkou = (CheckButton) findViewById(R.id.jinkou);
        this.mJinkou.setOnClickListener(this);
        this.mZiranxiqi = (CheckButton) findViewById(R.id.ziranxiqi);
        this.mZiranxiqi.setOnClickListener(this);
        this.mWolunzengya = (CheckButton) findViewById(R.id.wolunzengya);
        this.mWolunzengya.setOnClickListener(this);
        this.mJixiezengya = (CheckButton) findViewById(R.id.jixiezengya);
        this.mJixiezengya.setOnClickListener(this);
        this.mQianqu = (CheckButton) findViewById(R.id.qianqu);
        this.mQianqu.setOnClickListener(this);
        this.mHouqu = (CheckButton) findViewById(R.id.houqu);
        this.mHouqu.setOnClickListener(this);
        this.mSiqu = (CheckButton) findViewById(R.id.siqu);
        this.mSiqu.setOnClickListener(this);
        this.mQuanjingtianchuang = (CheckButton) findViewById(R.id.quanjingtianchuang);
        this.mQuanjingtianchuang.setOnClickListener(this);
        this.mDiandongtianchuang = (CheckButton) findViewById(R.id.diandongtianchuang);
        this.mDiandongtianchuang.setOnClickListener(this);
        this.mDiandongtiaojiezuoyi = (CheckButton) findViewById(R.id.diandongtiaojiezuoyi);
        this.mDiandongtiaojiezuoyi.setOnClickListener(this);
        this.mCheshenesp = (CheckButton) findViewById(R.id.cheshenesp);
        this.mCheshenesp.setOnClickListener(this);
        this.mShanqidadeng = (CheckButton) findViewById(R.id.shanqidadeng);
        this.mShanqidadeng.setOnClickListener(this);
        this.mGpsdaohang = (CheckButton) findViewById(R.id.gpsdaohang);
        this.mGpsdaohang.setOnClickListener(this);
        this.mDingsuxunhang = (CheckButton) findViewById(R.id.dingsuxunhang);
        this.mDingsuxunhang.setOnClickListener(this);
        this.mZhenpizuoyi = (CheckButton) findViewById(R.id.zhenpizuoyi);
        this.mZhenpizuoyi.setOnClickListener(this);
        this.mDaocheleida = (CheckButton) findViewById(R.id.daocheleida);
        this.mDaocheleida.setOnClickListener(this);
        this.mQuanzidongkongtiao = (CheckButton) findViewById(R.id.quanzidongkongtiao);
        this.mQuanzidongkongtiao.setOnClickListener(this);
        this.mDuogongnengfangxiangpan = (CheckButton) findViewById(R.id.duogongnengfangxiangpan);
        this.mDuogongnengfangxiangpan.setOnClickListener(this);
        this.mLeddadeng = (CheckButton) findViewById(R.id.leddadeng);
        this.mLeddadeng.setOnClickListener(this);
        this.mDaocheyingxiang = (CheckButton) findViewById(R.id.daocheyingxiang);
        this.mDaocheyingxiang.setOnClickListener(this);
        this.mWuyaoshiqidong = (CheckButton) findViewById(R.id.wuyaoshiqidong);
        this.mWuyaoshiqidong.setOnClickListener(this);
        this.mZuoyijiare = (CheckButton) findViewById(R.id.zuoyijiare);
        this.mZuoyijiare.setOnClickListener(this);
        this.mRijianxingchedeng = (CheckButton) findViewById(R.id.rijianxingchedeng);
        this.mRijianxingchedeng.setOnClickListener(this);
        this.mZidongpoche = (CheckButton) findViewById(R.id.zidongpoche);
        this.mZidongpoche.setOnClickListener(this);
        this.mLanyachezaidianhua = (CheckButton) findViewById(R.id.lanyachezaidianhua);
        this.mLanyachezaidianhua.setOnClickListener(this);
        this.mJincouSUV = (CarCheckButton) findViewById(R.id.jincouSUV);
        this.mJincouSUV.setOnClickListener(this);
        this.mZhongdaSUV = (CarCheckButton) findViewById(R.id.zhongdaSUV);
        this.mZhongdaSUV.setOnClickListener(this);
        this.mZhongSUV = (CarCheckButton) findViewById(R.id.zhongSUV);
        this.mZhongSUV.setOnClickListener(this);
        this.mDaSUV = (CarCheckButton) findViewById(R.id.daSUV);
        this.mDaSUV.setOnClickListener(this);
        this.mShouziyiti = (CheckButton) findViewById(R.id.shouziyiti);
        this.mShouziyiti.setOnClickListener(this);
        this.mWujibiansu = (CheckButton) findViewById(R.id.wujibiansu);
        this.mWujibiansu.setOnClickListener(this);
        this.mShuanglihe = (CheckButton) findViewById(R.id.shuanglihe);
        this.mShuanglihe.setOnClickListener(this);
        this.mFoursite = (CheckButton) findViewById(R.id.foursite);
        this.mFoursite.setOnClickListener(this);
        this._1_0 = (CheckButton) findViewById(R.id._1_0);
        this._1_0.setOnClickListener(this);
        this._1_1_1_6 = (CheckButton) findViewById(R.id._1_1_1_6);
        this._1_1_1_6.setOnClickListener(this);
        this._1_7_2_0 = (CheckButton) findViewById(R.id._1_7_2_0);
        this._1_7_2_0.setOnClickListener(this);
        this._2_1_2_5l = (CheckButton) findViewById(R.id._2_1_2_5l);
        this._2_1_2_5l.setOnClickListener(this);
        this._2_6_3_0l = (CheckButton) findViewById(R.id._2_6_3_0l);
        this._2_6_3_0l.setOnClickListener(this);
        this._3_1_4_0l = (CheckButton) findViewById(R.id._3_1_4_0l);
        this._3_1_4_0l.setOnClickListener(this);
        this._4_0 = (CheckButton) findViewById(R.id._4_0);
        this._4_0.setOnClickListener(this);
        this.enter = (Button) findViewById(R.id.enter);
        this.enter.setOnClickListener(this);
        this.choosed = (TextView) findViewById(R.id.choosed);
        this.choosed.setOnClickListener(this);
        this.remake = (TextView) findViewById(R.id.remake);
        this.remake.setOnClickListener(this);
        this.range_slider = (MultiSlider) findViewById(R.id.range_slider5);
        this.range_slider.setMax(100);
        this.range_slider.setMin(0);
        this.price = (TextView) findViewById(R.id.price);
        this.range_slider.setOnThumbValueChangeListener(new OnThumbValueChangeListener() {
            public void onValueChanged(MultiSlider multiSlider, Thumb thumb, int thumbIndex, int value) {
                if (thumbIndex == 0) {
                    CarSearchActivity.this.minp = String.valueOf(value * 10000);
                    CarSearchActivity.this.min = String.valueOf(value);
                    if (CarSearchActivity.this.maxp.equals("0")) {
                        CarSearchActivity.this.price.setText("价格 " + CarSearchActivity.this.min + "万元以上");
                    } else {
                        CarSearchActivity.this.price.setText("价格 " + CarSearchActivity.this.min + "~" + CarSearchActivity.this.max + "万元");
                    }
                } else if (value == 100) {
                    CarSearchActivity.this.maxp = "0";
                    CarSearchActivity.this.price.setText("价格 " + CarSearchActivity.this.min + "万元以上");
                } else {
                    CarSearchActivity.this.maxp = String.valueOf(value * 10000);
                    CarSearchActivity.this.max = String.valueOf(value);
                    if (CarSearchActivity.this.maxp.equals("0")) {
                        CarSearchActivity.this.price.setText("价格 " + CarSearchActivity.this.min + "万元以上");
                    } else {
                        CarSearchActivity.this.price.setText("价格 " + CarSearchActivity.this.min + "~" + CarSearchActivity.this.max + "万元");
                    }
                }
            }
        });
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 100 && !TextUtils.isEmpty(data.getStringExtra("bids"))) {
            this.bids = data.getStringExtra("bids");
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enter:
                getResult();
                break;
            case R.id.remake:
                remakeParams();
                remakeButton();
                break;
            case R.id.xuanzepinpai:
                startActivityForResult(new Intent(this, CarSelectActivity.class), 1);
                break;
        }
        Observable.just(Integer.valueOf(1)).map(new Func1<Integer, String>() {
            public String call(Integer integer) {
                return CarSearchActivity.this.setParamsString();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<String>() {
            public void call(String s) {
                CarSearchActivity.this.choosed.setText(s);
            }
        });
    }

    String setParamsString() {
        int i;
        StringBuilder stringBuilde = new StringBuilder("");
        for (i = 0; i < 17; i++) {
            CarCheckButton c = (CarCheckButton) this.buttons.get(i);
            if (c.ischecked()) {
                stringBuilde.append(c.getText()).append("/");
            }
        }
        for (i = 17; i < this.buttons.size(); i++) {
            CheckButton c2 = (CheckButton) this.buttons.get(i);
            if (c2.ischecked()) {
                stringBuilde.append(c2.getText()).append("/");
            }
        }
        if (stringBuilde.toString().equals("")) {
            return "已选条件";
        }
        stringBuilde.deleteCharAt(stringBuilde.length() - 1);
        this.params = stringBuilde.toString();
        return this.params;
    }

    void setParams() {
        if (this.mWeixingche.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "1";
            } else {
                this.levels += ",1";
            }
        }
        if (this.mXiaoxingche.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "2";
            } else {
                this.levels += ",2";
            }
        }
        if (this.mJincouxing.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "3";
            } else {
                this.levels += ",3";
            }
        }
        if (this.mZhongxingche.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "4";
            } else {
                this.levels += ",4";
            }
        }
        if (this.mZhongdaxing.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "5";
            } else {
                this.levels += ",5";
            }
        }
        if (this.mXiaoSUV.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "16";
            } else {
                this.levels += ",1";
            }
        }
        if (this.mJincouSUV.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "17";
            } else {
                this.levels += ",17";
            }
        }
        if (this.mZhongSUV.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "18";
            } else {
                this.levels += ",18";
            }
        }
        if (this.mZhongdaSUV.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "19";
            } else {
                this.levels += ",19";
            }
        }
        if (this.mDaSUV.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "20";
            } else {
                this.levels += ",20";
            }
        }
        if (this.mDaxingche.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "6";
            } else {
                this.levels += ",6";
            }
        }
        if (this.mMpv.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "8";
            } else {
                this.levels += ",8";
            }
        }
        if (this.mPaoche.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "7";
            } else {
                this.levels += ",7";
            }
        }
        if (this.mPikache.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "14";
            } else {
                this.levels += ",14";
            }
        }
        if (this.mWeimian.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "11";
            } else {
                this.levels += ",11";
            }
        }
        if (this.mWeika.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "12";
            } else {
                this.levels += ",12";
            }
        }
        if (this.mQingka.ischecked()) {
            if (this.levels.equals("")) {
                this.levels = "13";
            } else {
                this.levels += ",13";
            }
        }
        if (this.mChina.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "1";
            } else {
                this.cids += ",1";
            }
        }
        if (this.mGermany.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "2";
            } else {
                this.cids += ",2";
            }
        }
        if (this.mJanpanese.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "3";
            } else {
                this.cids += ",3";
            }
        }
        if (this.mAmerica.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "4";
            } else {
                this.cids += ",4";
            }
        }
        if (this.mKorea.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "5";
            } else {
                this.cids += ",5";
            }
        }
        if (this.mFrench.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "6";
            } else {
                this.cids += ",6";
            }
        }
        if (this.mEnglish.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "7";
            } else {
                this.cids += ",7";
            }
        }
        if (this.mOtherCountry.ischecked()) {
            if (this.cids.equals("")) {
                this.cids = "13";
            } else {
                this.cids += ",13";
            }
        }
        if (this.mShoudong.ischecked()) {
            if (this.gs.equals("")) {
                this.gs = "1";
            } else {
                this.gs += ",1";
            }
        }
        if (this.mShouZiYiTi.ischecked()) {
            if (this.gs.equals("")) {
                this.gs = "9";
            } else {
                this.gs += ",9";
            }
        }
        if (this.mShuanglihe.ischecked()) {
            if (this.gs.equals("")) {
                this.gs = "5";
            } else {
                this.gs += ",5";
            }
        }
        if (this.mWujibiansu.ischecked()) {
            if (this.gs.equals("")) {
                this.gs = "4";
            } else {
                this.gs += ",4";
            }
        }
        if (this.mQiyou.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "1";
            } else {
                this.fids += ",1";
            }
        }
        if (this.mChaiyou.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "2";
            } else {
                this.fids += ",2";
            }
        }
        if (this.mYoudianhunhe.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "3";
            } else {
                this.fids += ",3";
            }
        }
        if (this.mChundiandong.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "4";
            } else {
                this.fids += ",4";
            }
        }
        if (this.mChadianshihundong.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "5";
            } else {
                this.fids += ",5";
            }
        }
        if (this.mZengchengshi.ischecked()) {
            if (this.fids.equals("")) {
                this.fids = "6";
            } else {
                this.fids += ",6";
            }
        }
        if (this.mTwosite.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "2";
            } else {
                this.seats += ",2";
            }
        }
        if (this.mFoursite.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "4";
            } else {
                this.seats += ",4";
            }
        }
        if (this.mFivesite.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "5";
            } else {
                this.seats += ",5";
            }
        }
        if (this.mSixsite.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "6";
            } else {
                this.seats += ",6";
            }
        }
        if (this.mSevensite.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "7";
            } else {
                this.seats += ",7";
            }
        }
        if (this.mSevensiteup.ischecked()) {
            if (this.seats.equals("")) {
                this.seats = "8";
            } else {
                this.seats += ",8";
            }
        }
        if (this.mLiangxiang.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "1";
            } else {
                this.sts += ",1";
            }
        }
        if (this.mSanxiang.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "2";
            } else {
                this.sts += ",2";
            }
        }
        if (this.mXianbei.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "3";
            } else {
                this.sts += ",3";
            }
        }
        if (this.mLvxingban.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "4";
            } else {
                this.sts += ",4";
            }
        }
        if (this.mYingdingchangpengche.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "5";
            } else {
                this.sts += ",5";
            }
        }
        if (this.mRuandingchangpengche.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "6";
            } else {
                this.sts += ",6";
            }
        }
        if (this.mYingdingpaoche.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "7";
            } else {
                this.sts += ",7";
            }
        }
        if (this.mKeche.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "8";
            } else {
                this.sts += ",8";
            }
        }
        if (this.mHuoche.ischecked()) {
            if (this.sts.equals("")) {
                this.sts = "9";
            } else {
                this.sts += ",9";
            }
        }
        if (this.mZizhu.ischecked()) {
            if (this.attribute.equals("")) {
                this.attribute = "1";
            } else {
                this.attribute += ",1";
            }
        }
        if (this.mHezi.ischecked()) {
            if (this.attribute.equals("")) {
                this.attribute = "1";
            } else {
                this.attribute += ",2";
            }
        }
        if (this.mJinkou.ischecked()) {
            if (this.attribute.equals("")) {
                this.attribute = "1";
            } else {
                this.attribute += ",3";
            }
        }
        if (this.mZiranxiqi.ischecked()) {
            if (this.flowmode.equals("")) {
                this.flowmode = "1";
            } else {
                this.flowmode += ",1";
            }
        }
        if (this.mWolunzengya.ischecked()) {
            if (this.flowmode.equals("")) {
                this.flowmode = "2";
            } else {
                this.flowmode += ",2";
            }
        }
        if (this.mJixiezengya.ischecked()) {
            if (this.flowmode.equals("")) {
                this.flowmode = "3";
            } else {
                this.flowmode += ",3";
            }
        }
        if (this.mQianqu.ischecked()) {
            if (this.drives.equals("")) {
                this.drives = "1";
            } else {
                this.drives += ",1";
            }
        }
        if (this.mHouqu.ischecked()) {
            if (this.drives.equals("")) {
                this.drives = "2";
            } else {
                this.drives += ",2";
            }
        }
        if (this.mSiqu.ischecked()) {
            if (this.drives.equals("")) {
                this.drives = "3";
            } else {
                this.drives += ",3";
            }
        }
        if (this._1_0.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "1~10";
            } else {
                this.dsc += "1~10";
            }
        }
        if (this._1_1_1_6.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "11~16";
            } else {
                this.dsc += ",11~16";
            }
        }
        if (this._1_7_2_0.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "17~20";
            } else {
                this.dsc += ",17~20";
            }
        }
        if (this._2_1_2_5l.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "21~25";
            } else {
                this.dsc += ",21~25";
            }
        }
        if (this._2_6_3_0l.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "26~30";
            } else {
                this.dsc += ",26~30";
            }
        }
        if (this._3_1_4_0l.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "31~40";
            } else {
                this.dsc += ",31~40";
            }
        }
        if (this._4_0.ischecked()) {
            if (this.dsc.equals("")) {
                this.dsc = "40~100";
            } else {
                this.dsc += ",40~100";
            }
        }
        if (this.mQuanjingtianchuang.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "21";
            } else {
                this.configs += ",21";
            }
        }
        if (this.mDiandongtianchuang.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "20";
            } else {
                this.configs += ",20";
            }
        }
        if (this.mDiandongtiaojiezuoyi.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "2";
            } else {
                this.configs += ",2";
            }
        }
        if (this.mCheshenesp.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "3";
            } else {
                this.configs += ",3";
            }
        }
        if (this.mShanqidadeng.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "4";
            } else {
                this.configs += ",4";
            }
        }
        if (this.mGpsdaohang.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "5";
            } else {
                this.configs += ",5";
            }
        }
        if (this.mDingsuxunhang.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "6";
            } else {
                this.configs += ",6";
            }
        }
        if (this.mZhenpizuoyi.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "7";
            } else {
                this.configs += ",7";
            }
        }
        if (this.mDaocheleida.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "8";
            } else {
                this.configs += ",8";
            }
        }
        if (this.mQuanzidongkongtiao.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "9";
            } else {
                this.configs += ",9";
            }
        }
        if (this.mDuogongnengfangxiangpan.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "10";
            } else {
                this.configs += ",10";
            }
        }
        if (this.mLeddadeng.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "13";
            } else {
                this.configs += ",13";
            }
        }
        if (this.mDaocheyingxiang.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "14";
            } else {
                this.configs += ",14";
            }
        }
        if (this.mWuyaoshiqidong.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "15";
            } else {
                this.configs += ",15";
            }
        }
        if (this.mZuoyijiare.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "16";
            } else {
                this.configs += ",16";
            }
        }
        if (this.mRijianxingchedeng.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "17";
            } else {
                this.configs += ",17";
            }
        }
        if (this.mZidongpoche.ischecked()) {
            if (this.configs.equals("")) {
                this.configs = "18";
            } else {
                this.configs += ",18";
            }
        }
        if (!this.mLanyachezaidianhua.ischecked()) {
            return;
        }
        if (this.configs.equals("")) {
            this.configs = "19";
        } else {
            this.configs += ",19";
        }
    }

    void remakeButton() {
        int i;
        for (i = 0; i < 17; i++) {
            ((CarCheckButton) this.buttons.get(i)).setIschecked(false);
        }
        for (i = 17; i < this.buttons.size(); i++) {
            ((CheckButton) this.buttons.get(i)).setIschecked(false);
        }
    }

    void remakeParams() {
        this.pm = "2";
        this.minp = "0";
        this.maxp = "0";
        this.levels = "";
        this.cids = "";
        this.gs = "";
        this.sts = "";
        this.dsc = "";
        this.configs = "";
        this.order = "2";
        this.pindex = "1";
        this.psize = "20";
        this.bids = "";
        this.fids = "";
        this.drives = "";
        this.seats = "";
        this.attribute = "0";
        this.flowmode = "";
    }

    private void getResult() {
        setParams();
        Intent intent = new Intent(this, CarSearchResultActivity.class);
        intent.putExtra("pm", this.pm);
        intent.putExtra("minp", this.minp);
        intent.putExtra("maxp", this.maxp);
        intent.putExtra("levels", this.levels);
        intent.putExtra("cids", this.cids);
        intent.putExtra("gs", this.gs);
        intent.putExtra("sts", this.sts);
        intent.putExtra("dsc", this.dsc);
        intent.putExtra("configs", this.configs);
        intent.putExtra("order", this.order);
        intent.putExtra("pindex", this.pindex);
        intent.putExtra("psize", this.psize);
        intent.putExtra("bids", this.bids);
        intent.putExtra("fids", this.fids);
        intent.putExtra("drives", this.drives);
        intent.putExtra("seats", this.seats);
        intent.putExtra("attribute", this.attribute);
        intent.putExtra("flowmode", this.flowmode);
        intent.putExtra("params", this.params);
        startActivity(intent);
        remakeParams();
    }
}
