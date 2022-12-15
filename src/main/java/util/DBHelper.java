package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    public static Connection getConn() {
        Connection conn =null;
        //jdbc驱动
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是cxxt
        String url="jdbc:mysql://localhost:3306/partyhistory?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true";
        String user="root";
        String password="zhuyucong137168";
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            conn = DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                System.out.println("数据库连接成功");
                return conn;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
