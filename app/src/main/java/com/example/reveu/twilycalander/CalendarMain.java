package com.example.reveu.twilycalander;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class CalendarMain extends AppCompatActivity
{
    private LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.activity_main);

        CalendarDay temp = new CalendarDay(getApplicationContext());

        container.addView(temp);
    }
}
