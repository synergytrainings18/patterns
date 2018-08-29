package proxy;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocation;

import javax.xml.stream.Location;
import java.sql.DatabaseMetaData;

public class AdminUserProxy implements User {
    DatabaseMetaData data;
    private String name;
    ServerLocation serverLocation;

    public AdminUserProxy(String name) {
        this.name = name;
    }

    @Override
    public boolean createOtherUser() {
        GetLocationExample obj = new GetLocationExample();
        ServerLocation location = obj.getLocation("206.190.36.45");
        if(location=="USA"){
            return new AdminUser(name).createOtherUser();
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
