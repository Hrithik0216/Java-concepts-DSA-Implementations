package MessageService.Messaging_Service;

public class MessagingThread extends Thread {
    private MessageService messageService;
    private Message message;

    public MessagingThread(MessageService messageService, Message message) {
        this.messageService = messageService;
        this.message = message;
    }

    @Override
    public void run() {
        messageService.sendMessage(message);
    }
}
