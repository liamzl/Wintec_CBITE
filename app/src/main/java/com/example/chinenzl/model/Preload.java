package nz.ac.wintec.comp709.course_android.model;

import android.util.SparseArray;

public class Preload {

    public SparseArray<String[]> listProgramme;
    public SparseArray<String[]> listSemester;
    public SparseArray<String[]> listCourse;
    public SparseArray<Integer[]> p_s;
    public SparseArray<Integer[]> s_c;



    public Preload() {
        initData();
    }

    private void initData() {

        // all pathway
        listProgramme = new SparseArray<>();
        listProgramme.put(1, new String[]{"BI1601", "Network Engineering", "Bachelor of Applied IT"});
        listProgramme.put(2, new String[]{"BI1601", "Software Engineering", "Bachelor of Applied IT"});
        listProgramme.put(3, new String[]{"BI1601", "Database Architecture", "Bachelor of Applied IT"});
        listProgramme.put(4, new String[]{"BI1601", "Multimedia and Web Development", "Bachelor of Applied IT"});
        listProgramme.put(5, new String[]{"BI1607", "Diploma of IT", "Diploma of IT"});

        // relation of pathway and semester
        p_s = new SparseArray<>();
        p_s.put(1, new Integer[]{1, 2, 3, 4, 5, 6});
        p_s.put(2, new Integer[]{1, 2, 3, 7, 8, 9});
        p_s.put(3, new Integer[]{1, 2, 3, 10, 11, 12});
        p_s.put(4, new Integer[]{1, 2, 3, 13, 14});
        p_s.put(5, new Integer[]{1, 2});

        // all semester
        listSemester = new SparseArray<>();
        listSemester.put(1, new String[]{"S1", "Compulsory First Semester"});
        listSemester.put(2, new String[]{"S2", "Compulsory Second Semester"});
        listSemester.put(3, new String[]{"S3", "Compulsory Third Semester"});
        listSemester.put(4, new String[]{"S4", "Network Engineering Fouth Semester"});
        listSemester.put(5, new String[]{"S5", "Network Engineering Fifth Semester"});
        listSemester.put(6, new String[]{"S6", "Network Engineering Sixth Semester"});
        listSemester.put(7, new String[]{"S4", "Software Engineering Fouth Semester"});
        listSemester.put(8, new String[]{"S5", "Software Engineering Fifth Semester"});
        listSemester.put(9, new String[]{"S6", "Software Engineering Sixth Semester"});
        listSemester.put(10, new String[]{"S4", "Database Architecture Fouth Semester"});
        listSemester.put(11, new String[]{"S5", "Database Architecture Fifth Semester"});
        listSemester.put(12, new String[]{"S6", "Database Architecture Sixth Semester"});
        listSemester.put(13, new String[]{"S4", "Multimedia and Web Development Fouth Semester"});
        listSemester.put(14, new String[]{"S5", "Multimedia and Web Development Fifth Semester"});
        listSemester.put(15, new String[]{"S6", "Multimedia and Web Development Sixth Semester"});

        // relation of semester and course
        s_c = new SparseArray<>();
        s_c.put(1, new Integer[]{1, 2, 3, 4});
        s_c.put(2, new Integer[]{1, 2, 3, 4});
        s_c.put(3, new Integer[]{1, 2, 3, 4});
        s_c.put(4, new Integer[]{1, 2, 3, 4});
        s_c.put(5, new Integer[]{1, 2, 3, 4});
        s_c.put(6, new Integer[]{1, 2, 3, 4});
        s_c.put(7, new Integer[]{1, 2, 3, 4});
        s_c.put(8, new Integer[]{1, 2, 3, 4});
        s_c.put(9, new Integer[]{1, 2, 3, 4});
        s_c.put(10, new Integer[]{1, 2, 3, 4});
        s_c.put(11, new Integer[]{1, 2, 3, 4});
        s_c.put(12, new Integer[]{1, 2, 3, 4});
        s_c.put(13, new Integer[]{1, 2, 3, 4});
        s_c.put(14, new Integer[]{1, 2, 3, 4});
        s_c.put(15, new Integer[]{1, 2, 3, 4});

        // all course
        listCourse = new SparseArray<>();
        listCourse.put(1, new String[]{"COMP501", "IT Operations", "15"});
        listCourse.put(2, new String[]{"COMP502", "Fundamentals of Programming and Problem Solving", "15"});
        listCourse.put(3, new String[]{"INFO501", "Professional Practice", "15"});
        listCourse.put(4, new String[]{"INFO502", "Business Systems Analysis & Design", "15"});
        listCourse.put(5, new String[]{"COMP503", "Introduction to Networks", "15"});
        listCourse.put(6, new String[]{"COMP504", "Operating Systems & Systems Support", "15"});
        listCourse.put(7, new String[]{"INFO503", "Database Principles", "15"});
        listCourse.put(8, new String[]{"INFO504", "Technical Support", "15"});
        listCourse.put(9, new String[]{"COMP601", "Object Oriented Programming", "15"});
        listCourse.put(10, new String[]{"INFO601", "Data-modelling and SQL", "15"});
        listCourse.put(11, new String[]{"MATH601", "Mathematics for IT", "15"});
        listCourse.put(12, new String[]{"COMP602", "Web Development", "15"});
        listCourse.put(13, new String[]{"INFO602", "Business, Interpersonal Communications & Technical Writing", "15"});
        listCourse.put(14, new String[]{"COMP615", "Data Centre Infrastructure", "15"});
        listCourse.put(15, new String[]{"COMP605", "Data Structures & Algorithms", "15"});
        listCourse.put(16, new String[]{"COMP603", "The Web Environment", "15"});
        listCourse.put(17, new String[]{"INFO603", "Systems Administration", "15"});
        listCourse.put(18, new String[]{"COMP609", "Applications Development", "15"});
        listCourse.put(19, new String[]{"COMP606", "Web Programming", "15"});
        listCourse.put(20, new String[]{"COMP604", "Routing & Switching Essentials", "15"});
        listCourse.put(21, new String[]{"MATH602", "Mathematics for Programming", "15"});
        listCourse.put(22, new String[]{"INFO604", "Database Systems", "15"});
        listCourse.put(23, new String[]{"COMP607", "Visual Effects and Animation", "15"});
        listCourse.put(24, new String[]{"COMP701", "Advanced Networking", "15"});
        listCourse.put(25, new String[]{"INFO704", "Data-Warehousing and Business Intelligence", "15"});
        listCourse.put(26, new String[]{"INFO709", "Human Computer Interaction", "15"});
        listCourse.put(27, new String[]{"INFO702", "Cyber-Security", "15"});
        listCourse.put(28, new String[]{"COMP707", "Principles of software Testing", "15"});
        listCourse.put(29, new String[]{"INFO706", "Database Front-End Applications", "15"});
        listCourse.put(30, new String[]{"COMP704", "Network Security", "15"});
        listCourse.put(31, new String[]{"COMP709", "Mobile Applications Development", "15"});
        listCourse.put(32, new String[]{"COMP702", "Scaling Networks", "15"});
        listCourse.put(33, new String[]{"COMP706", "Game Development", "15"});
        listCourse.put(34, new String[]{"INFO707", "Cloud Server Databases", "15"});
        listCourse.put(35, new String[]{"COMP710", "Web Applications Development", "15"});
        listCourse.put(36, new String[]{"BIZM701", "Business Essentials for IT Professionals", "15"});
        listCourse.put(37, new String[]{"COMP705", "Connecting Networks", "15"});
        listCourse.put(38, new String[]{"INFO703", "Big Data and Analytics", "15"});
        listCourse.put(39, new String[]{"INFO708", "Data Visualisation", "15"});
        listCourse.put(40, new String[]{"DFNZ701", "Network Engineering Project", "30"});
        listCourse.put(41, new String[]{"COMP715", "Software Engineering Project", "30"});
        listCourse.put(42, new String[]{"INFO712", "Database Architecture Project", "30"});
        listCourse.put(43, new String[]{"COMP713", "Web Development Project", "30"});
        listCourse.put(44, new String[]{"INFO710", "Internship", "15"});
        listCourse.put(45, new String[]{"DFNZ701", "Design Factory", "15"});

    }

}
