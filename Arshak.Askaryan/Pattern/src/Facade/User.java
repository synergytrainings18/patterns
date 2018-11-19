package Facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private long id;
    private String name;
    private List<NotifiactionType> notifiactionTypes = new ArrayList<NotifiactionType>();
    private String phoneNumber;
    private String email;

    public enum NotifiactionType {
        APPLIACATION,
        MAIL,
        SMS
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NotifiactionType> getNotifiactionTypes() {
        return notifiactionTypes;
    }

    public void setNotifiactionTypes(List<NotifiactionType> notifiactionTypes) {
        this.notifiactionTypes = notifiactionTypes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
