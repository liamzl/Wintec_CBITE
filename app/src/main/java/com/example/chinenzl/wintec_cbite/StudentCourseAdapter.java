package com.example.chinenzl.wintec_cbite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.chinenzl.model.Course;

import java.util.List;

public class StudentCourseAdapter extends ArrayAdapter<Course> {

    public StudentCourseAdapter(@NonNull Context context, List<Course> arrCourse) {
        super(context, R.layout.activity_student_course_adapter, arrCourse);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View courseView = buckysInflater.inflate(R.layout.activity_student_course_adapter, parent, false);
        Course coursePackage = getItem(position);
        TextView courseCode = (TextView) courseView.findViewById(R.id.checkBox);
        TextView courseName = (TextView) courseView.findViewById(R.id.textViewName);

        // dynamically update the text from the array
        courseCode.setText(coursePackage.code);
        courseName.setText(coursePackage.name);
        return courseView;
    }
}
