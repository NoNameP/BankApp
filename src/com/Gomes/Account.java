package com.Gomes;

public abstract class Account implements IBaseRate {
    static int index = 10000;
    String name;
    String SSN;
    double balance;
    String accountNumber;
    double rate;

    //Constructors
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;

        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    //Set account number
    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void showInfo() {
        System.out.println(
                "Name : " + name +
                        "\nAccount Number : " + accountNumber +
                        "\nBalance : " + balance +
                        "\nRate : " + rate + "%"
        );
    }
    //General methods
}
