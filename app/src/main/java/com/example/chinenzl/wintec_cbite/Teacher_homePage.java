package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teacher_homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home_page);
    }

    public void clickProgramme(View view){
        Intent i = new Intent(this, Teacher_pathCourseList.class);
        startActivity(i);
    }

    public void clickSemester(View view){
        Intent i = new Intent(this, Teacher_semester.class);
        startActivity(i);
    }

    public void clickCourse(View view){
        Intent i = new Intent(this, Teacher_courseList.class);
        startActivity(i);
    }
}
