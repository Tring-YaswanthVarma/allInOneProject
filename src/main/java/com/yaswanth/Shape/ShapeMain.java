package com.yaswanth.Shape;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import static com.yaswanth.Shape.Shape.CIRCLE;
import static com.yaswanth.Shape.Shape.RECTANGLE;
import static com.yaswanth.Shape.Shape.TRIANGLE;

public class ShapeMain {

    public void shapeMain() {
        Logger logger = Logger.getLogger("com.api.jar");
        String check;
        String type;
        double triangleL1 = 0;
        double triangleL2 = 0;
        double triangleL3 = 0;
        double triangleHeight = 0;
        double triangleBase = 0;
        double rectLength = 0;
        double rectWidth = 0;
        double radius = 0;
        Shape s = null;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        char choice = 'y';

        while (choice == 'y'){
            boolean checker = true;
            logger.info("Enter Shape type (rectangle, circle, triangle): ");
            type = sc.next().toLowerCase();
            if (type.equals(CIRCLE)) {
                while (checker){
                    try{
                        logger.info("Enter radius of the CIRCLE : ");
                        radius = sc.nextDouble();
                        checker = false;
                    }catch (InputMismatchException e){
                        logger.info("Your input type is mismatched, try again.");
                        sc.nextLine();
                    }
                }
                s = new Shape(type, radius);
            } else if (type.equals(RECTANGLE)) {
                checker = true;
                while (checker){
                    try{
                        logger.info("Enter length of the RECTANGLE : ");
                        rectLength = sc.nextDouble();
                        logger.info("Enter width of the RECTANGLE : ");
                        rectWidth = sc.nextDouble();
                        checker = false;
                    } catch (InputMismatchException e){
                        logger.info("Your input type is mismatched, try again.");
                        sc.nextLine();
                    }
                }
                s = new Shape(type, rectLength, rectWidth);
            } else if (type.equals(TRIANGLE)) {
                checker = true;
                while(checker){
                    try{
                        logger.info("Enter 1st side of the triangle : ");
                        triangleL1 = sc.nextDouble();
                        logger.info("Enter 2nd side of the triangle : ");
                        triangleL2 = sc.nextDouble();
                        logger.info("Enter 3rd side of the triangle : ");
                        triangleL3 = sc.nextDouble();
                        logger.info("Enter height of the triangle : ");
                        triangleHeight = sc.nextDouble();
                        logger.info("Enter base of the triangle : ");
                        triangleBase = sc.nextDouble();
                        checker = false;
                    } catch (InputMismatchException e){
                        logger.info("Your input type is mismatched, try again.");
                        sc.nextLine();
                    }
                }


                s = new Shape(type, triangleL1, triangleL2, triangleL3, triangleHeight,
                        triangleBase);
            } else {
                logger.info("Currently we are unable to process your shape. Try existing shapes.");
                continue;
            }
            check = "Perimeter for the Shape : " + s.perimeter();
            logger.info(check);
            check = "Area of the shape : " + s.area();
            logger.info(check);
            logger.info("Dou you wish to continue (y/n) : ");
            choice = sc.next().charAt(0);
        }



    }
}

