package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Teacher_courseList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_course_list);

    }

    public void clickSave(View view){
        Intent i = new Intent(this, Teacher_inputStudent.class);
        startActivity(i);
    }
}
