package com.tianran.car.main.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import com.tianran.car.R;

public class RecycleviewItemDecoration extends ItemDecoration {
    private Drawable mDivider;
    private double padleftRate;

    public RecycleviewItemDecoration(Context context, double padleftRate) {
        this.mDivider = ContextCompat.getDrawable(context, R.drawable.decoration);
        this.padleftRate = padleftRate;
    }

    public void onDrawOver(Canvas c, RecyclerView parent, State state) {
        int left = (int) (((double) parent.getPaddingLeft()) + (((double) parent.getWidth()) * this.padleftRate));
        int right = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);
            int top = child.getBottom() + ((LayoutParams) child.getLayoutParams()).bottomMargin;
            this.mDivider.setBounds(left, top, right, top + this.mDivider.getIntrinsicHeight());
            this.mDivider.draw(c);
        }
    }
}
