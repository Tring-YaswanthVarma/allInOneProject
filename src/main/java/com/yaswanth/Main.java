package com.yaswanth;

import com.yaswanth.bankAccount.BankAccountMain;
import com.yaswanth.basicPoint.BasicPointMain;
import com.yaswanth.creditCard.CreditCardMain;
import com.yaswanth.frequencyOfWords.FrequencyMain;
import com.yaswanth.shape.ShapeMain;
import com.yaswanth.simpleCalculator.SimpleCalculatorMain;
import com.yaswanth.simpleDatabase.SimpleDatabaseMain;
import com.yaswanth.student.StudentMain;
import com.yaswanth.studentDS.StudentTest;
import com.yaswanth.ticTacToe.TicTacToeMain;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("1.Bank Account \n2. Basic Point \n3. Credit Card \n4.Frequency Of Words \n5.Shape \n6. Simple Calculator \n7. Simple Database \n8. Student Assignment \n9. Student Data Structure Assignment \n10. TicTacToe game \n11. Exit");
            System.out.println("Choose one option: ");
            int choice = sc.nextInt();
            switch (choice){


                case 1 : {
                    BankAccountMain bank = new BankAccountMain();
                    bank.bankAccountMain();
                    break;
                }
                case 2: BasicPointMain point = new BasicPointMain();
                        point.basicPointMain();
                        break;
                case 3: CreditCardMain card = new CreditCardMain();
                        card.creditCardMain();
                        break;
                case 4: FrequencyMain freq = new FrequencyMain();
                        freq.frequencyMain();
                        break;
                case 5: ShapeMain shape = new ShapeMain();
                        shape.shapeMain();
                        break;
                case 6: SimpleCalculatorMain calc = new SimpleCalculatorMain();
                        calc.simpleCalculatorMain();
                        break;
                case 7: SimpleDatabaseMain db = new SimpleDatabaseMain();
                        db.simpleDatabaseMain();
                        break;
                case 8: StudentMain stu = new StudentMain();
                        stu.studentMain();
                        break;
                case 9: StudentTest stuTest = new StudentTest();
                        stuTest.studentTestMain();
                        break;
                case 10: TicTacToeMain tic = new TicTacToeMain();
                        tic.ticTacToeMain();
                        break;
                default:
                    flag = false;
            }
            sc.nextLine();
        }
    }
}