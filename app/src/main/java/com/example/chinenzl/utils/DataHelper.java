package com.example.chinenzl.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.chinenzl.model.Course;
import com.example.chinenzl.model.Preload;
import com.example.chinenzl.model.Programme;
import com.example.chinenzl.model.DataStudy;
import com.example.chinenzl.model.Semester;

public class DataHelper {

    public DataStudy dataStudy;


    private static DataHelper instance;

    public static DataHelper getInstance() {
        if (instance == null) {                         //Single Checked
            synchronized (Preload.class) {
                if (instance == null) {                 //Double Checked
                    instance = new DataHelper();
                }
            }
        }
        return instance;
    }

    public DataHelper() {
        this.readData();
    }

    // init data from preload
    private void readData() {

        Preload preload = new Preload();

        List<Programme> arrProgramme = new ArrayList<>();
        List<Semester> arrSemester = new ArrayList<>();
        List<Course> arrCourse = new ArrayList<>();

        for (int i = 0; i < preload.listProgramme.size(); i++) {
            int key = preload.listProgramme.keyAt(i);
            String[] arr = preload.listProgramme.get(key);
            Programme obj = new Programme();
            obj.id = key;
            obj.code = arr[0];
            obj.name = arr[1];
            obj.description = arr[2];
            arrProgramme.add(obj);
        }

        for (int i = 0; i < preload.listSemester.size(); i++) {
            int key = preload.listSemester.keyAt(i);
            String[] arr = preload.listSemester.get(key);
            Semester obj = new Semester();
            obj.id = key;
            obj.name = arr[0];
            obj.description = arr[1];
            arrSemester.add(obj);
        }

        for (int i = 0; i < preload.listCourse.size(); i++) {
            int key = preload.listCourse.keyAt(i);
            String[] arr = preload.listCourse.get(key);
            Course obj = new Course();
            obj.id = key;
            obj.code = arr[0];
            obj.name = arr[1];
            obj.credits = Integer.parseInt(arr[2]);
            arrCourse.add(obj);
        }


        for (int j = 0; j < arrProgramme.size(); j++) {
            Programme p = arrProgramme.get(j);
            ArrayList<Semester> array = new ArrayList<>();
            for (int k = 0; k < preload.p_s.get(p.id).length; k++) {
                int sid = preload.p_s.get(p.id)[k];
                array.add(arrSemester.get(sid));
            }
            p.listSemester = array;
        }

        for (int j = 0; j < arrSemester.size(); j++) {
            Semester s = arrSemester.get(j);
            ArrayList<Course> array = new ArrayList<>();
            for (int k = 0; k < preload.s_c.get(s.id).length; k++) {
                int sid = preload.s_c.get(s.id)[k];
                array.add(arrCourse.get(sid));
            }
            s.listCourse = array;
        }

        this.dataStudy = new DataStudy();
        this.dataStudy.arrProgramme = arrProgramme;
        this.dataStudy.arrCourse = arrCourse;
    }


}
