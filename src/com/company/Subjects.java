package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subjects {
    private String subjectName;
    private List<Integer> grades = new ArrayList<>();

    Subjects(String subjectName) {
        this.subjectName = subjectName;
    }

    public void addGrades(int[] newGrades) {
        for (int i = 0; i < newGrades.length; i++) {
            grades.add(newGrades[i]);
        }
    }

    public void getAverageGrade() {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        average = (double) sum / (double) grades.size();
        System.out.println("Avg: " + average);
    }

}
