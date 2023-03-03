package com.yaswanth.shape;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import static com.yaswanth.shape.Shape.CIRCLE;
import static com.yaswanth.shape.Shape.RECTANGLE;
import static com.yaswanth.shape.Shape.TRIANGLE;

public class ShapeMain {
    private boolean checker;
    private double triangleL2 = 0;
    private double triangleL3 = 0;
    private double triangleL1 = 0;
    private double triangleHeight = 0;
    private double triangleBase = 0;
    private double rectLength = 0;
    private double rectWidth = 0;
    private double radius = 0;
    Logger logger = Logger.getLogger("com.api.jar");
    Scanner sc = new Scanner(System.in);
    private final String ER = "Your input type is mismatched, try again.";
    public void circleInput(){
        checker = true;
        while (checker){
            try{
                logger.info("Enter radius of the CIRCLE : ");
                radius = sc.nextDouble();
                checker = false;
            }catch (InputMismatchException e){
                logger.info(ER);
                sc.nextLine();
            }
        }
    }

    public void rectangleInput(){
        checker = true;
        while (checker){
            try{
                logger.info("Enter length of the RECTANGLE : ");
                rectLength = sc.nextDouble();
                logger.info("Enter width of the RECTANGLE : ");
                rectWidth = sc.nextDouble();
                checker = false;
            } catch (InputMismatchException e){
                logger.info(ER);
                sc.nextLine();
            }
        }
    }

    public void triangleInput(){
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
                logger.info(ER);
                sc.nextLine();
            }
        }
    }

    public void shapeMain() {
        String check;
        String type;

        Shape s = null;

        char choice = 'y';

        while (choice == 'y'){

            logger.info("Enter Shape type (rectangle, circle, triangle): ");
            type = sc.next().toLowerCase();
            if (type.equals(CIRCLE)) {
                circleInput();
                s = new Shape(type, radius);
            } else if (type.equals(RECTANGLE)) {
                rectangleInput();
                s = new Shape(type, rectLength, rectWidth);
            } else if (type.equals(TRIANGLE)) {
                triangleInput();
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

