package FactoryDesignPattern.MainImpl;

import FactoryDesignPattern.Notification;

public class PushNotification implements Notification {

    @Override
    public void sendMessage(String message){
        System.out.println(message+" sent from pushNotification");
    }
}
