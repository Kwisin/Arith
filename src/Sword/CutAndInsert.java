package Sword;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CutAndInsert {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.100.57.1: 8006","ksyun_kenc","Passwd123!@#");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
