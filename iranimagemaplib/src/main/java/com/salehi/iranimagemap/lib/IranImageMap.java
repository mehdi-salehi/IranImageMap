package com.salehi.iranimagemap.lib;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

public class IranImageMap extends RelativeLayout {
    private ImageView mapItem;

    public IranImageMap(Context context) {
        super(context);
        initializeViews(context);
    }

    public IranImageMap(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeViews(context);
    }

    public IranImageMap(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeViews(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IranImageMap(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initializeViews(context);
    }

    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.iran_image_map, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mapItem = (ImageView) this.findViewById(R.id.mapItem);
    }

    public void setActiveProvince(ProvinceList province) {
        mapItem.setImageResource(ProvinceList.getImage(province.id).name);
    }

    public void clearAllProvince() {
        mapItem.setImageResource(0);
    }
}
