package com.example.meau;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.Window;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_login);
    }
    public void AcLogin_2(View view){
        startActivity(new Intent(Login.this,Login2.class));
    }
    public void AcCadastro(View view){
        startActivity(new Intent(Login.this,Cadastro.class));
    }
}
