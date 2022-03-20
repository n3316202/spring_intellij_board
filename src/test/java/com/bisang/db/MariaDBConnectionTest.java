package com.bisang.db;

import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j
public class MariaDBConnectionTest {
    String url ="jdbc:mariadb://localhost:3306/board?user=torren&password=1234";

    @Test
    public void connectionTest() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url);
            System.out.println("### connection : " + connection + " - 연결 성공 ####");
            log.info("### connection : " + connection + " - 연결 성공 ####");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

