package Facade;

import java.util.Objects;

public class UserService {

    private User user;

    public User getUser() {
        if(Objects.isNull(user)){
            loadUser();
        }
        return user;
    }

    private void loadUser(){
        //Load user by token
        this.user = new User();
        this.user.getNotifiactionTypes().add(User.NotifiactionType.APPLIACATION);
        this.user.getNotifiactionTypes().add(User.NotifiactionType.SMS);

    }

}
