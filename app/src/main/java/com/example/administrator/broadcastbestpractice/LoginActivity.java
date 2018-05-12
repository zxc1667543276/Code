package com.example.administrator.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/5/12.
 */

public class LoginActivity extends MainActivity{
    private EditText accountEdit;

    private EditText passwordexttext;

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accountEdit=(EditText)findViewById(R.id.account);
        passwordexttext=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String account=accountEdit.getText().toString();
             String password=passwordexttext.getText().toString();
             if(account.equals("admin")&&password.equals("123456")){
                    Intent intent=new Intent(LoginActivity.this,FirstActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                 Toast.makeText(LoginActivity.this,"Account or password is invaild",Toast.LENGTH_SHORT).show();
             }
            }
        });

    }
}
