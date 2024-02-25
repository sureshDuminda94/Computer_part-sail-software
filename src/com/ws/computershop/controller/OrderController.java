/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.controller;

import com.ws.computershop.connection.DBConnection;
import com.ws.computershop.model.Item;
import com.ws.computershop.model.Order;
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
public class OrderController {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static boolean addNewOrder(Order order, ArrayList<OrderDetail> orderDetails, ArrayList<Item> itemList) throws ClassNotFoundException, SQLException {

        String quary = "Insert Into Orders Values(?,?,?,?)";
        connection = DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        try {
            statement = connection.prepareStatement(quary);
            statement.setObject(1, order.getOid());
            statement.setObject(2, order.getCid());
            statement.setObject(3, order.getOrderDate());
            statement.setObject(4, order.getAmount());
            boolean isAddOrder = statement.executeUpdate() > 0;

            if (isAddOrder) {
                boolean isAddOrderDetail = OrderDetailController.addNewOrderDetaill(orderDetails);
                if (isAddOrderDetail) {

                    boolean updateItemQty = ItemController.updateItemQty(itemList);
                    if (updateItemQty) {
                        connection.commit();
                        return true;
                    }
                } else {
                    connection.rollback();
                    return false;
                }
            }
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }

    }

    public static Order getOrderById(String orderId) throws ClassNotFoundException, SQLException {

        String quary = "Select * From Orders Where OID=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, orderId);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Order(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
        }
        return null;
    }

    public static boolean removeOrder(String orderId) throws ClassNotFoundException, SQLException {
        String quary = "Delete From Orders Where OID=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, orderId);
        return statement.executeUpdate() > 0;
    }

}
