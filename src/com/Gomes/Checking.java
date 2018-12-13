package com.Gomes;

public class Checking extends Account {
    int debitCardNumber;
    int debitcardPin;

    //Constructor
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    //Methods
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitcardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "Your Checking Account Features : " +
                        "\nDebit Card Number : " + debitCardNumber +
                        "\nDebit Card Pin : " + debitcardPin
        );
    }
}
