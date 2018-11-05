package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chinenzl.utils.DataHelper;

public class Teacher_courseList extends AppCompatActivity {

   // private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_course_list);

        //mTextMessage = (TextView) findViewById(R.id.message);
        DataHelper db = DataHelper.getInstance();
        ListAdapter buckysAdapter = new TeacherCourseAdapter(this, db.dataStudy.arrCourse);
        ListView buckysListView = (ListView) findViewById(R.id.liamListView);
        buckysListView.setAdapter(buckysAdapter);

    }

    public void clickSave(View view){
        Intent i = new Intent(this, Teacher_inputStudent.class);
        startActivity(i);
    }
}
