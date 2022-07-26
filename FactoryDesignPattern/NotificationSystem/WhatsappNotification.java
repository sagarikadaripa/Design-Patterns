package FactoryDesignPattern.NotificationSystem;

public class WhatsappNotification implements Notification{
    public void notifyUser(){
        System.out.println("Sending WhatsApp Notification");
    }
}
