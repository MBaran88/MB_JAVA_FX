import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseClientsDAO implements IDAO<User> {
    private static DatabaseClientsDAO instance = null;

    public static void init(DatabaseServer server){
        if (instance == null){
            instance = new DatabaseClientsDAO(server);
        }
    }
    public static DatabaseClientsDAO getInstance(){
        return instance;
    }
    public static final String CLIENT_ID_COLUMN = "client_id";
    public static final String CLIENT_NAME_COLUMN = "client_name";
    public static final String CLIENT_SURNAME_COLUMN = "client_surname";
    public static final String EMPLOYEE_ID_COLUMN = "employee_id";
    public static final String EMPLOYEE_NAME_COLUMN = "employee_name";
    public static final String EMPLOYEE_SURNAME_COLUMN = "employee_surname";



    public static final String GET_ALL_SQL ="select clients.name,clients.surname,employees.name,employees.surname from clients inner join employees where employees.surname = 'Hoss'";

    private DatabaseServer server;

    private DatabaseClientsDAO
}
