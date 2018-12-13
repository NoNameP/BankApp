package com.Gomes;

public class Main {

    public static void main(String[] args) {
        Checking chkacc1 = new Checking("John Doe", "123456789", 1500);

        Savings savacc1 = new Savings("John Sav", "987456321", 3000);

        chkacc1.showInfo();
        System.out.println("******************************************");
        savacc1.showInfo();

    }
}
