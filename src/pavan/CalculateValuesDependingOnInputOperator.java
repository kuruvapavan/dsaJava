package pavan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculateValuesDependingOnInputOperator {
    public static void main(String[] args) {
//        float num1;
//        float num2;
//        System.out.println("Enter first number: ");
//        Scanner input = new Scanner(System.in);
//        num1 = input.nextFloat();
//        System.out.println("Enter second number:");
//        num2 = input.nextFloat();
//        System.out.println("Enter an operator (+,-,*,/,%)");
//        String operator = input.next();
//
//        double result=0;
//
//        if(operator.equals("+")){
//            result=num1+num2;
//        }
//        else if (operator.equals("-")){
//            result=num1-num2;
//        }
//        else if (operator.equals("*")){
//            result=num1*num2;
//        }
//        else if (operator.equals("/")){
//            result=num1/num2;
//        }
//        else if (operator.equals("%")){
//            result=num1%num2;
//        }
//        else {
//            System.out.println("Invalid Operator");
//            return;
//        }
//        System.out.println(result);
        int num1;
        int num2;
        System.out.println("enter two numbers: ");
        Scanner in = new Scanner(System.in);
        num1=in.nextInt();
        num2=in.nextInt();
        System.out.println("choose the operator (+,-,*,/,%)");
        String op=in.next();

        double result=0;
        if (op.equals("+")){
            result=num1+num2;
        } else if (op.equals("-")) {
            result=num1-num2;
        } else if (op.equals("*")) {
            result=num1*num2;
        } else if (op.equals("/") ) {
            result=num1/num2;
        } else if (op.equals("%")) {
            result=num1%num2;
        }else {
            System.out.println("Enter valid input");
            return;
        }

        System.out.println(result);
    }

}
