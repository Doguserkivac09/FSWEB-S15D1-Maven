package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Grocery grocery = new Grocery();
        //grocery.startGrocery();
        MobilePhone mobilePhone = new MobilePhone("234554821", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("dogus" , "23456423"));
        mobilePhone.addNewContact(new Contact("doguss" , "23456423"));
        mobilePhone.addNewContact(new Contact("dogussss" , "23456423"));
        mobilePhone.addNewContact(new Contact("dogusssss" , "23456423"));
        mobilePhone.addNewContact(new Contact("dogusssssss" , "23456423"));
        mobilePhone.printContacts();

    }
}
