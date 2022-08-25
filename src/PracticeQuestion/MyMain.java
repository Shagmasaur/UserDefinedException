package PracticeQuestion;

import java.util.Scanner;

public class MyMain {
    public int a;
    public int b;


    public void add(int a, int b) throws MyFirstException
    {
        int sum=a+b;
        if(sum<150)
        {
            throw new MyFirstException("Custom exception occurred");
        }
        System.out.println("Sum of two numbers is : " +sum);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a= scanner.nextInt();
        System.out.println("Enter second number : ");
        int b= scanner.nextInt();

        MyMain random = new MyMain();
        try {
            random.add(a,b);
        }
        catch (MyFirstException e)
        {
            System.out.println(e);
        }
    }

}