/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.other;

import com.ws.computershop.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Waruna
 */
public class Genarater {
    
    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;
    
    public static String genarateId(String tableName, String fieldName, String prific) throws ClassNotFoundException, SQLException {
        
        String lastId = null;
        String quary = "Select " + fieldName + " From " + tableName + " Order by " + fieldName + " desc limit 1";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            lastId = resultSet.getString(1);
            String substring = lastId.substring(1, lastId.length());
            int nowId = Integer.parseInt(substring);
            nowId++;
            return prific.concat("00").concat(Integer.toString(nowId));
            
        }
        return prific.concat("001");
    }
    
}
