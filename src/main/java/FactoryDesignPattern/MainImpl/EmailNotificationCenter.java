package FactoryDesignPattern.MainImpl;

import FactoryDesignPattern.Notification;
import FactoryDesignPattern.NotificationCenter;

public class EmailNotificationCenter extends NotificationCenter {

    @Override
    public Notification getNotification(){
        return new EmailNotification();
    }
}
