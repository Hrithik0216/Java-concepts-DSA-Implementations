package MessageService.Messaging_Service;

public class Execution {
    public static void main(String[] args) {
        User hrithik = new User("Hrithik", "9443128095");
        User nitin = new User("Nitin", "9440000000");

        Message message1 = new Message(hrithik, nitin, "Hey Nitin! How are you?");

        SmsService smsService = new SmsService();
        MessagingThread thread1 = new MessagingThread(smsService, message1);
        thread1.start();
    }

}
