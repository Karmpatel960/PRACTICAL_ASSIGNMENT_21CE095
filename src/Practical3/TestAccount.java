package Practical3;

import Practical1.Account;
import java.util.ArrayList;
import java.util.Scanner;


public class TestAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        ArrayList<Account> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            Account account = new Account();
            arr.add(account);
            arr.get(i).setId(i);
            arr.get(i).setBalance(100);
        }
        do{
            System.out.print("Enter the Account ID: \n");
            a = in.nextInt();
            for (Account account : arr) {
                if (account.getId() == a) {

                    int b;
                    do {
                        System.out.print("Enter Below Numbers for Further Procedure\n1 for Balance Inquiry\n2 for Withdraw money\n3 for Deposit money\n4 for exit\nEnter the number: ");
                        b = in.nextInt();
                        switch (b) {
                            case 1 -> System.out.println("Current Balance is " + account.getBalance());
                            case 2 -> {
                                System.out.print("Enter the amount of money you want to withdraw ");
                                double wdb = in.nextDouble();
                                System.out.println("After withdrawal the balance is " + account.withdraw(wdb));
                            }
                            case 3 -> {
                                System.out.print("Enter the amount of money you want to deposit ");
                                double dpb = in.nextDouble();
                                System.out.println("After deposit the balance is " + account.deposit(dpb));
                            }
                        }
                    } while (b != 4);
                }
            }

        }while(a!=99);
    }
}
