package utility;

import data.User;
import exception.InvalidAgeException;

public class AgeVerification
{
    public boolean isValidAge(User user,int minimumAge) throws InvalidAgeException
    {
        if(user.getAge()<user.MINIMUM_AGE)
        {
            throw new InvalidAgeException("Your age is less to use this service");
        }
        else
        {
            return true;
        }

    }
}
