package MessageService.Messaging_Service;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        try {
            System.out.println("Sending message from: "
                    + message.getSender().toString() + " to: "
                    + message.getRecipient() + " The message is: "
                    + message.getMessage());
            message.setStatus(String.valueOf(MessageStatus.SENT));
            System.out.println("Status: "+message.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
