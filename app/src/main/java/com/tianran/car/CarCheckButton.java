package com.tianran.car;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CarCheckButton extends android.support.v7.widget.AppCompatButton implements OnClickListener {
    OnClickListener _wrappedOnClickListener;
    private boolean ischecked = false;
    private Context mContext;

    public CarCheckButton(Context context) {
        super(context);
        this.mContext = context;
        super.setOnClickListener(this);
    }

    public CarCheckButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        super.setOnClickListener(this);
    }

    public CarCheckButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        super.setOnClickListener(this);
    }

    public boolean ischecked() {
        return this.ischecked;
    }

    public void setOnClickListener(OnClickListener l) {
        this._wrappedOnClickListener = l;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = !ischecked;
        onClick(this);
    }

    public void onClick(View v) {
        if (this._wrappedOnClickListener != null) {
            this._wrappedOnClickListener.onClick(v);
        }
        this.ischecked = !this.ischecked;
        if (this.ischecked) {
            getResources();
            setBackground(ContextCompat.getDrawable(this.mContext, R.drawable.filter_checked_button_bg));
            setTextColor(ContextCompat.getColor(this.mContext, R.color.filter_brand));
            return;
        }
        setBackground(ContextCompat.getDrawable(this.mContext, R.drawable.filter_car_type_button_bg));
        setTextColor(ContextCompat.getColor(this.mContext, R.color.black));
    }
}
