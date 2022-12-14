package daoimp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public  class DBConnect {
    // 连接数据库所需的信息（例如 URL、用户名、密码等）省略
    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/partyhistory?serverTimezone=UTC";
    private final String userName = "root";
    private final String password = "123456";

    public static Connection conn;

    {
        try {
            Class.forName(this.jdbcDriver);
            try {
                conn = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public DBConnect(){

    }
}
