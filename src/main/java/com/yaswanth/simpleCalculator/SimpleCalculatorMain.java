package com.yaswanth.simpleCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class SimpleCalculatorMain {
    public void simpleCalculatorMain() {
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        int choice;
        String s;
        double num1 = 0;
        double num2 = 0;
        boolean checker = true;
        while(checker){
            try{
                logger.info("Enter 1st number : ");
                num1 = sc.nextDouble();
                logger.info("Enter 2nd number : ");
                num2 = sc.nextDouble();
                checker = false;
            } catch (InputMismatchException e){
                logger.info("Your input type is mismatched, try again.");
                sc.nextLine();
            }
        }
        boolean flag = true;
        while (flag) {
            logger.info("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Enter new values\n 6. Exit");
            logger.info("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Addition add = new Addition(num1, num2);
                    s = "Addition : " + add.calculate();
                    logger.info(s);
                    break;
                case 2:
                    Subtraction sub = new Subtraction(num1, num2);
                    s = "Subtraction : " + sub.calculate();
                    logger.info(s);
                    break;
                case 3:
                    Multiplication mul = new Multiplication(num1, num2);
                    s = "Multiplication : " + mul.calculate();
                    logger.info(s);
                    break;
                case 4:
                    Division div = new Division(num1, num2);
                    s = "Division : " + div.calculate();
                    logger.info(s);
                    break;
                case 5:
                    checker = true;
                    while(checker){
                        try{
                            logger.info("Enter num1 : ");
                            num1 = sc.nextDouble();
                            logger.info("Enter num2 : ");
                            num2 = sc.nextDouble();
                            checker = false;
                        } catch (InputMismatchException e){
                            logger.info("Your input type is mismatched, try again.");
                            sc.nextLine();
                        }
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}
