package FactoryDesignPattern;

public class NotificationFactory {
    public Notification getNotificationChannel(String channel){
        if(channel == null || channel.isEmpty())    return null;
        switch(channel){
            case "SMS": 
                return new SMSNotification();
            case "EMAIL": return new EmailNotification();
            default : throw new IllegalArgumentException("Unknow Channel "+ channel);
        }
    }
}
