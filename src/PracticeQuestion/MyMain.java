package PracticeQuestion;

import java.util.Scanner;

public class MyMain {

    public void add(int firstNumber, int secondNumber) throws MyFirstException
    {
        int sum=firstNumber+secondNumber;
        if(sum<150)
        {
            throw new MyFirstException("Custom Exception Occurred");
        }
        System.out.println("Sum of two numbers is : " +sum);

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNumber= scanner.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber= scanner.nextInt();

        MyMain random = new MyMain();
        try {
            random.add(firstNumber,secondNumber);
        }
        catch (MyFirstException e)
        {
            System.out.println(e);
        }
    }
}