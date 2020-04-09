package com.example.application;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.baidu.xiaXian");
                //发送
                sendBroadcast(intent);
            }
        });
    }
}
/*
    private GuangBo guangBo;
    private LocalBroadcastManager localBroadcastManger;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guangBo=new GuangBo();
        intentFilter=new IntentFilter();
        intentFilter.addAction("cctv_1");
        localBroadcastManger= LocalBroadcastManager.getInstance(this);
        localBroadcastManger.registerReceiver(guangBo,intentFilter);
        registerReceiver(guangBo,intentFilter);

        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //发送
                Intent intent=new Intent("cctv_1");
                localBroadcastManger.sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManger.unregisterReceiver(guangBo);
    }

    class GuangBo extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(
                    context,"已接收",Toast.LENGTH_SHORT
            ).show();
        }
    }
 */
