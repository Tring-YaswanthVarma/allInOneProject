package com.yaswanth.basicpoint;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class BasicPointMain {
    public void basicPointMain() throws CloneNotSupportedException {
        double x = 0;
        double y = 0;
        String check;
        Scanner sc = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        boolean flag = true;
        while(flag){
            try {
                l.info("Enter coordinates for first point.");
                l.info("Enter x : ");
                x = sc.nextDouble();
                l.info("Enter y : ");
                y = sc.nextDouble();
                flag = false;
            }catch (InputMismatchException e){
                l.info("Your input type is mismatched, try again.");
                sc.nextLine();
            }
        }

        BasicPoint bp1 = new BasicPoint(x, y);
        flag = true;
        while(flag){
            try {
                l.info("Enter coordinates for second point");
                l.info("Enter x : ");
                x = sc.nextDouble();
                l.info("Enter y : ");
                y = sc.nextDouble();
                flag = false;
            } catch (InputMismatchException e){
                l.info("Your input type is mismatched, try again.");
                sc.nextLine();
            }
        }

        BasicPoint bp2 = new BasicPoint(x, y);
        l.info("Before cloning");
        check = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(check);
        l.info("After cloning");
        bp2 = (BasicPoint) bp1.clone();
        String s = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(s);
    }
}

