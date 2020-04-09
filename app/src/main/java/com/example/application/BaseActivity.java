package com.example.application;

import android.app.Activity;
import android.os.Bundle;


import androidx.annotation.Nullable;

public class BaseActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将子类添加进集合
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
