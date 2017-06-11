package com.example.reveu.twilycalander;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by reveu on 2017-06-12.
 */

public class CalendarDay extends LinearLayout
{
    private TextView tvDayNumber;
    private TextView tvDayPoint;
    private CalendarDayData data;

    private boolean isVisible = true;

    public CalendarDay(Context context)
    {
        super(context);
        init(context);
    }

    public CalendarDay(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    private void init(Context context)
    {
        View v = View.inflate(context, R.layout.layout_day, this);

        tvDayNumber = (TextView) v.findViewById(R.id.day_number);
        tvDayPoint = (TextView) v.findViewById(R.id.day_point);
        data = new CalendarDayData();
    }
}
