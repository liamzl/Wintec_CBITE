package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher_pathCourseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_path_course_list);
    }

    public void clickNetwork(View view){
        Intent i = new Intent(this, Teacher_programmeDetail.class);
        startActivity(i);
    }

    public void clickSoftware(View view){
        Intent i = new Intent(this, Teacher_programmeDetail.class);
        startActivity(i);
    }

    public void clickDatabase(View view){
        Intent i = new Intent(this, Teacher_programmeDetail.class);
        startActivity(i);
    }

    public void clickWeb(View view){
        Intent i = new Intent(this, Teacher_programmeDetail.class);
        startActivity(i);
    }
}
