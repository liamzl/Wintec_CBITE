package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Teacher_successful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_successful);

        TextView message = (TextView) findViewById(R.id.textView);
        message.setText("Student information has inputed");

    }

    public void clickEmail(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }

    public void clickBack(View view){
        Intent i = new Intent(this, Teacher_homePage.class);
        startActivity(i);
    }
}
