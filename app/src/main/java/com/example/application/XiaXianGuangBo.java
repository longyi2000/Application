package com.example.application;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

public class XiaXianGuangBo extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setTitle("注意！！！");
        builder.setMessage("你的账号已在其他地方登录，你被强制下线！");
        //不允许back键退掉这个对话框
        builder.setCancelable(false);
        builder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCollector.finishAll();
                        Intent intent=new Intent(context,LoginActivity.class);
                        //运行一个新的程序
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    }
                });
        AlertDialog alertDialog=builder.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        //显示对话框
        alertDialog.show();
    }
}
