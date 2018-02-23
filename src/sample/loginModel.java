package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {
    Connection connection;

    public loginModel() {
    try {
        this.connection = dbConnection.getConnection();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    if (this.connection ==null) {
        System.exit(1);
    }
    }//loginModel
    public boolean isDatabaseConnection(){
        return this.connection !=null;
    }
}//class
