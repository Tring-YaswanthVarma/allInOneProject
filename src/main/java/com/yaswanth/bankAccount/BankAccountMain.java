package com.yaswanth.bankAccount;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class BankAccountMain {
    public void bankAccountMain() {
        Logger logger = Logger.getLogger("com.api.jar");
        String name = null;
        boolean flag = true;
        int accNum = 0;
        double balance = 0;
        String s;
        int choice;
        Scanner sc = new Scanner(System.in);
        boolean input = true;
        while(input){
            try {
                logger.info("Enter Customer name : ");
                name = sc.nextLine();
                logger.info("Enter Account number : ");
                accNum = sc.nextInt();
                logger.info("Enter initial Balance : ");
                balance = sc.nextDouble();
                input = false;
            }catch (InputMismatchException e){
                logger.info("Your input type is mismatched, try again.");
                sc.nextLine();
            }
        }
        
        BankAccount bb = new BankAccount(name, accNum, balance);
        s = "Welcome " + bb.getName() + ".";
        logger.info(s);
        s = "Your Account balance when your account is created : " + bb.balance() + ".";
        logger.info(s);
        while (flag) {
            double money;
            s = "1. Deposit" + "\n2. Withdraw" + "\n3. Balance" + "\n4. Exit" + "\nEnter your choice : ";
            logger.info(s);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    logger.info("Enter money to deposit in your account : ");
                    money = sc.nextDouble();
                    bb.deposit(money);
                    break;
                case 2:
                    logger.info("Enter money to withdraw from your account : ");
                    money = sc.nextDouble();
                    bb.withdraw(money);
                    break;
                case 3:
                    s = "Your Balance is : " + bb.balance() + ".";
                    logger.info(s);
                    break;
                default:
                    flag = false;
                    sc.nextLine();
                    break;
            }
        }
    }
}

