package main;

import data.User;
import exception.InvalidAgeException;
import utility.AgeVerification;

public class Main
{
    public static void main(String[] args)
    {

        User user=new User("Abhishek",14);


        AgeVerification ageVerification=new AgeVerification();

        try
        {
            ageVerification.isValidAge(user,user.MINIMUM_AGE);
            System.out.println("NAme = " +user.getName());
            System.out.println("Age = " +user.getAge());


        }
        catch (InvalidAgeException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
