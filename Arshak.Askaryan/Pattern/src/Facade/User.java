package Facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private long id;
    private String name;
    private List<NotifiactionType> notifiactionTypes = new ArrayList<NotifiactionType>();

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
}
