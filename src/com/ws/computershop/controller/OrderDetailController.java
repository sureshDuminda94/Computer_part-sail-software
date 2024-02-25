/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.controller;

import com.ws.computershop.connection.DBConnection;
import com.ws.computershop.model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Waruna
 */
public class OrderDetailController {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static boolean addNewOrderDetaill(ArrayList<OrderDetail> orderDetails) throws ClassNotFoundException, SQLException {
        int count = 0;
        connection = DBConnection.getDBConnection().getConnection();
        for (OrderDetail orderDetail : orderDetails) {
            String quary = "Insert Into OrderDetail values(?,?,?,?)";
            statement = connection.prepareStatement(quary);
            statement.setObject(1, orderDetail.getOid());
            statement.setObject(2, orderDetail.getCode());
            statement.setObject(3, orderDetail.getOrderQty());
            statement.setObject(4, orderDetail.getPrice());
            count += statement.executeUpdate();
        }
        if (count == orderDetails.size()) {
            return true;
        }
        return false;
    }

    public static ArrayList<OrderDetail> getOrderItemList(String oid) throws ClassNotFoundException, SQLException {

        String quary = "Select * From Orderdetail Where OID=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, oid);
        resultSet = statement.executeQuery();
        ArrayList<OrderDetail> orderDetails = new ArrayList<>();
        while (resultSet.next()) {
            orderDetails.add(new OrderDetail(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getDouble(4)));
        }
        return orderDetails;
    }

}
