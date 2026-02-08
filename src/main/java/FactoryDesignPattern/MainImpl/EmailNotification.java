package FactoryDesignPattern.MainImpl;

import FactoryDesignPattern.Notification;

public class EmailNotification implements Notification {

    @Override
    public void sendMessage(String message){
        System.out.println(message+" sent from email");
    }

}
