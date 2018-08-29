package proxy;

import java.sql.DatabaseMetaData;

public class AdminUser  implements User{
 DatabaseMetaData data;
 private String name;

    public AdminUser(String name) {
        this.name = name;
    }

    @Override
    public boolean createOtherUser() {
        if(data.loadUserByName(name).canAdd()){//user include pessmion data
            return true;
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
