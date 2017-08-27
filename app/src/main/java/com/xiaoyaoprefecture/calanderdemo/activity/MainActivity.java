package com.xiaoyaoprefecture.calanderdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.xiaoyaoprefecture.calanderdemo.R;
import com.xiaoyaoprefecture.calanderdemo.view.NewCanlander;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 玩一下自定义日历
 */

public class MainActivity extends AppCompatActivity implements NewCanlander.NewCalendarListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewCanlander canlander= (NewCanlander) findViewById(R.id.newCalender);
        canlander.listener=this;
    }

    @Override
    public void onItemLongPress(Date day) {
        DateFormat df= SimpleDateFormat.getDateInstance();
        Toast.makeText(this,df.format(day),Toast.LENGTH_SHORT).show();
    }
}
