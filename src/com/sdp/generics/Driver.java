package com.sdp.generics;

/**
 * Created by Basil on 11/01/2016.
 */
public class Driver {

    public static void main(String[] args) {

        Storage<BankAccount> accountStorage = new Storage<>();
        Storage<String> stringStorage = new Storage<>();

        Class<BankAccount> bankAccountClass = BankAccount.class;

        try {

            BankAccount myAccount = (BankAccount) bankAccountClass.newInstance();
            accountStorage.setValue(myAccount);

            myAccount.deposit(15);

            System.out.println(accountStorage.getValue().showBalance());

            if (accountStorage.getClass() == stringStorage.getClass()) {
                System.out.println("EQUAL");
            } else {
                System.out.println("NOT EQUAL");
            }

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }

    }

}
