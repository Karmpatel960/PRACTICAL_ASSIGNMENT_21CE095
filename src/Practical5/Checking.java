package Practical5;

import Practical1.Account;

public class Checking extends Account {

    private double overdraft = getBalance()/10;

    Checking() {}

    Checking(int id, double balance)
    {
        super(id, balance);
    }

    @Override
    public double withdraw(double a)
    {
        if(a< overdraft)
        {
            overdraft -=a;
            return overdraft;
        }
        else
        {
            a-= overdraft;
            super.withdraw(a);
        }
        return getBalance();
    }
}
