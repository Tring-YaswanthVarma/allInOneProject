package com.yaswanth.studentDS;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentTest {
    public void studentTestMain() {
        Logger logger = Logger.getLogger("com.api.jar");
        List<StudentDS> studentList = new ArrayList<>();
        StudentDS s1 = new StudentDS("abc", 1, 34.5);
        StudentDS s2 = new StudentDS("def", 2, 34.9);
        StudentDS s3 = new StudentDS("ghi", 3, 96);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        logger.info("Students before sorting : ");
        for (StudentDS s : studentList) {
            logger.info(s.getName() + ", " + s.getAge() + ", " + s.getGpa());
        }
        studentList.sort(new SortByGpa());
        logger.info("After Sorting");
        for (StudentDS s : studentList) {
            logger.info(s.getName() + ", " + s.getAge() + ", " + s.getGpa());
        }
    }
}

