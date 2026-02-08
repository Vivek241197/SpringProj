package FactoryDesignPattern;

public abstract class NotificationCenter {

    public abstract Notification getNotification();

    public void send(String message){
        Notification not = getNotification();
        not.sendMessage(message);
    }
}
