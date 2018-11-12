package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chinenzl.utils.DataHelper;

public class Teacher_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__login);


        DataHelper dh = DataHelper.getInstance();


    }

    public void clickLogin(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }

    public void clickSoftware(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }

    public void clickDatabase(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }

    public void clickWeb(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }

}
