package Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveNotifiaction(Notifiaction notifiaction){
        jdbcTemplate.update("INSERT INTO `notifiaction` (message, userId) VALUES (?,?,?); ",
                notifiaction.getMessage(), notifiaction.getUserId());

    }
}
