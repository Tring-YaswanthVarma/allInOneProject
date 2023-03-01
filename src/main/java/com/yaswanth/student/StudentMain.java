package com.yaswanth.student;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class StudentMain {
    public void studentMain() {
        String str;
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        String name;
        char gradeLevel;
        double gpa = 0;
        boolean checker = true;
        logger.info("Enter name of the student : ");
        name = sc.nextLine();
        logger.info("Enter the grade level in a characater : ");
        gradeLevel = sc.next().charAt(0);
        while (checker){
            try{
                logger.info("Enter GPA : ");
                gpa = sc.nextDouble();
                checker = false;
            } catch (InputMismatchException e){
                logger.info("Your input type is mismatched, try again.");
                sc.nextLine();
            }
        }

        Student s = new Student(name, gradeLevel, gpa);
        boolean flag = true;
        while(flag) {
            logger.info("1. Show Gpa \n2. Update Gpa \n3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    str = s.studentGrade();
                    logger.info(str);
                    break;
                case 2:
                    checker = true;
                    while(checker){
                        try{
                            logger.info("Enter gpa : ");
                            gpa = sc.nextDouble();
                            checker = false;
                        } catch (InputMismatchException e){
                            logger.info("Your input type is mismatched, try again.");
                            sc.nextLine();
                        }
                    }
                    s.updateGPA(gpa);
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}

