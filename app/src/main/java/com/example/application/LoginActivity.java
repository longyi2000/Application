package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LoginActivity extends BaseActivity{

    private EditText account;
    private EditText password;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        account=findViewById(R.id.account);
        password=findViewById(R.id.password);

        Button login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //得到账号和密码的值
                String account_str=account.getText().toString();
                String password_str=password.getText().toString();
                //如果账号密码都相同
                if (account_str.equals("admin") && password_str.equals("123456")){
                    //进入业务界面
                    Intent intent=new Intent(
                            LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                    //否则提示错误
                }else {
                    Toast.makeText(
                            LoginActivity.this,
                            "账号或密码错误",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
