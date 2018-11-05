package com.example.chinenzl.wintec_cbite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chinenzl.model.Course;

import java.util.List;

public class TeacherCourseAdapter extends ArrayAdapter<Course> {

    public TeacherCourseAdapter(@NonNull Context context, List<Course> arrCourse) {
        super(context, R.layout.activity_teacher_course_adapter,arrCourse);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customerView = buckysInflater.inflate(R.layout.activity_teacher_course_adapter, parent, false);
        Course singleFoodItem = getItem(position);
        TextView buckysText = (TextView) customerView.findViewById(R.id.checkBox);

        //ImageView buckysImage = (ImageView) customerView.findViewById(R.id.imageView);

        // dynamically update the text from the array
        buckysText.setText(singleFoodItem.name);
        // using the same image every time
        return customerView;
    }
}