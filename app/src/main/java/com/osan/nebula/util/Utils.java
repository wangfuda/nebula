package com.osan.nebula.util;

import android.content.res.Resources;
import android.util.TypedValue;

import com.osan.nebula.App;

/**
 * Created by osan on 2017/7/5.
 */

public class Utils {

    /**
     * dp2px
     */
    public static int dip2px(float dpValue) {
        final float scale = App.context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px2dp
     */
    public static int px2dip(float pxValue) {
        final float scale = App.context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
    /**
     *根据设备信息获取当前分辨率下指定单位对应的像素大小；
     * px,dip,sp -> px
     */
    public float getRawSize(int unit, float size) {
        Resources r;
        if (App.context == null){
            r = Resources.getSystem();
        }else{
            r = App.context.getResources();
        }
        return TypedValue.applyDimension(unit, size, r.getDisplayMetrics());
    }
}
