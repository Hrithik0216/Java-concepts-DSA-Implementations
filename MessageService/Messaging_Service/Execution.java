package MessageService.Messaging_Service;

import MessageService.Messaging_Service.Services.EmailService;
import MessageService.Messaging_Service.Services.SmsService;

public class Execution {
    public static void main(String[] args) {
        User hrithik = new User("Hrithik", "9443128095");
        User nitin = new User("Nitin", "9440000000");

        User logash = new User("Logash", "9443128095","logashitaintme@gmail.com");
        User mirth = new User("Mirth", "9443128095","mirth@gmail.com");

        Message message1 = new Message(hrithik, nitin, "Hey Nitin! How are you?");
        Message emailMessage = new Message(logash,mirth,"Hey mirthu How are you?");

        SmsService smsService = new SmsService();
        MessagingThread smsThread = new MessagingThread(smsService, message1);
        smsThread.start();
        try{
            smsThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        EmailService emailService = new EmailService();
        MessagingThread emailThread = new MessagingThread(emailService, emailMessage);
        emailThread.start();
        try{
            emailThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
