package FactoryDesignPattern;

import java.util.Scanner;

public class NotificationService {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the channel name = ");
        String channel = scanner.next();
        NotificationFactory nf = new NotificationFactory();
        Notification no = nf.getNotificationChannel(channel);
        no.notifyUser();
        scanner.close();
    }  
}
