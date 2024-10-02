package MessageService.Messaging_Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message {
    private User sender;
    private User recipient;
    private String message;
    private String status;



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Message(User sender, User recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
