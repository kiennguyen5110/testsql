package testsql;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class sql {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("12345");
        ds.setServerName("DESKTOP-8RHTMFS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QLHS");

        try(Connection conn = ds.getConnection()) {
            System.out.println("connection success");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
