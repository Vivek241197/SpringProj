package FactoryDesignPattern;

import FactoryDesignPattern.MainImpl.EmailNotificationCenter;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        NotificationCenter nc;

        nc=new EmailNotificationCenter();
        nc.send("Hello");


    }
}
