package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chinenzl.model.DataStudy;
import com.example.chinenzl.utils.DataHelper;

public class Teacher_semester extends AppCompatActivity {

    private TextView mTextMessage;

    //private ListView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_semester);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        DataHelper db = DataHelper.getInstance();
        ListAdapter buckysAdapter = new TeacherCourseAdapter(this, db.dataStudy.arrCourse);
        ListView buckysListView = (ListView) findViewById(R.id.liamListView);
        buckysListView.setAdapter(buckysAdapter);
    }

    public void clickSave(View view){
        Intent i = new Intent(this, Teacher_inputStudent.class);
        startActivity(i);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    // mTextMessage.setText(R.string.title_dashboard);
                    return true;

            }
            return false;
        }
    };
}
