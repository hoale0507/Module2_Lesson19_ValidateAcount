package com.company;

public class Main {

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String [] acounts1 = new String[] {"hoale123", "*hoale", "hoale","hoale_"};
        for (String account: acounts1
             ) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account " + account + " is valid: " + isValid);
        }
    }
}
