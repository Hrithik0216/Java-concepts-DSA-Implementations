package MessageService.Messaging_Service.Services;

import MessageService.Messaging_Service.Message;
import MessageService.Messaging_Service.MessageService;
import MessageService.Messaging_Service.MessageStatus;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(Message message) {
        System.out.println("Sending Message from: " + message.getSender()+" to: "+message.getRecipient()+" and the message is "+message.getMessage());
        if(message.getSender().getEmail().isEmpty()) {
            message.setStatus(String.valueOf(MessageStatus.MAIL_NOT_FOUND));
        }
        message.setStatus("Email message status: "+String.valueOf(MessageStatus.SENT));

        System.out.println(message.getStatus());
    }
}
