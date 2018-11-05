package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher_inputStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_input_student);
    }

    public void clickSave(View view){
        Intent i = new Intent(this, Teacher_successful.class);
        startActivity(i);
    }

    public void clickBack(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }
}
