package com.yaswanth.studentds;

import java.util.Comparator;

public class SortByGpa implements Comparator<StudentDS> {
    public int compare(StudentDS a, StudentDS b) {

        if(b.getGpa() > a.getGpa() || b.getGpa() == a.getGpa()){
            return 1;
        }else{
            return -1;
        }
    }
}

