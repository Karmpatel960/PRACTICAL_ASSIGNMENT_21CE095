package Practical1;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated= new Date();

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account() {
        this.id = id;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }



    {
        annualInterestRate = 7;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance*(annualInterestRate/1200);
    }

    public double withdraw(double w)
    {
        if(w<=balance)
            balance-=w;
        else
            System.out.println("Your Account Balance is Insufficient");
        return balance;
    }

    public double deposit(double d)
    {
        balance+=d;
        System.out.println("Your Amount is Added to your Account");
        return balance;
    }
}
