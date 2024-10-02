package MessageService.Messaging_Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String phone;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        Pattern pattern = Pattern.compile(Constants.REGEX);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "User{name='" + name + "', phone='" + phone + "', email='" + (email != null ? email : "N/A") + "'}";
    }
}
