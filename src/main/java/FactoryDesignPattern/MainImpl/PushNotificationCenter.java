package FactoryDesignPattern.MainImpl;

import FactoryDesignPattern.Notification;
import FactoryDesignPattern.NotificationCenter;

public class PushNotificationCenter extends NotificationCenter {

    public Notification getNotification(){
        return new PushNotification();
    }
}
