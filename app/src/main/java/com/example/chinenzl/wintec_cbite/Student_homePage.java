package com.example.chinenzl.wintec_cbite;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Student_homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.teacher:
                Intent i = new Intent(this, Teacher_Login.class);
                startActivity(i);
                return true;
            case R.id.aboutUs :
                Intent x = new Intent(this, AboutUs.class);
                startActivity(x);
                return true;
            case R.id.Disclaimer:
                Intent z = new Intent(this, Disclaimer.class);
                startActivity(z);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
