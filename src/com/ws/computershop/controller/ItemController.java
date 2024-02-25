/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.controller;

import com.ws.computershop.connection.DBConnection;
import com.ws.computershop.model.Item;
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
public class ItemController {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static boolean addNewItem(Item item) throws ClassNotFoundException, SQLException {

        connection = DBConnection.getDBConnection().getConnection();
        String quary = "Insert Into Item Values(?,?,?,?,?,?)";
        statement = connection.prepareStatement(quary);
        statement.setObject(1, item.getCode());
        statement.setObject(2, item.getName());
        statement.setObject(3, item.getDescription());
        statement.setObject(4, item.getItemType());
        statement.setObject(5, item.getPrice());
        statement.setObject(6, item.getQty());
        return statement.executeUpdate() > 0;
    }

    public static Item searchItemByCode(String itemCode) throws ClassNotFoundException, SQLException {
        connection = DBConnection.getDBConnection().getConnection();
        String quary = "Select * from Item Where CODE=?";
        statement = connection.prepareStatement(quary);
        statement.setObject(1, itemCode);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5), resultSet.getInt(6));
        }
        return null;
    }

    public static ArrayList<Item> getItemList() throws ClassNotFoundException, SQLException {

        connection = DBConnection.getDBConnection().getConnection();
        String quary = "Select * from Item";
        statement = connection.prepareStatement(quary);
        resultSet = statement.executeQuery();
        
        ArrayList<Item> itemList = new ArrayList<>();
        while (resultSet.next()) {
            itemList.add(new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5), resultSet.getInt(6)));
        }
        return itemList;
    }

    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException {

        connection = DBConnection.getDBConnection().getConnection();
        String quary = "Update Item set Name=? , Description=? , ItemType=? , Price=? , Qty=? Where CODE=?";
        statement = connection.prepareStatement(quary);
        statement.setObject(1, item.getName());
        statement.setObject(2, item.getDescription());
        statement.setObject(3, item.getItemType());
        statement.setObject(4, item.getPrice());
        statement.setObject(5, item.getQty());
        statement.setObject(6, item.getCode());
        return statement.executeUpdate() > 0;
    }

    public static boolean removeItem(String itemCode) throws ClassNotFoundException, SQLException {
        connection = DBConnection.getDBConnection().getConnection();
        String quary = "Delete From Item Where CODE=?";
        statement = connection.prepareStatement(quary);
        statement.setObject(1, itemCode);
        return statement.executeUpdate() > 0;
    }

    public static boolean updateItemQty(ArrayList<Item> itemList) throws ClassNotFoundException, SQLException {
        int count = 0;
        connection = DBConnection.getDBConnection().getConnection();
        for (Item item : itemList) {
            String quary = "Update Item Set QTY=QTY-? Where CODE=?";
            statement = connection.prepareStatement(quary);
            statement.setObject(1, item.getQty());
            statement.setObject(2, item.getCode());
            count += statement.executeUpdate();
            if (count == itemList.size()) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Item> getItemListByCode(ArrayList<OrderDetail> orderItemList) throws ClassNotFoundException, SQLException {

        String quary = "Select * from Item Where CODE=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        ArrayList<Item> itemList = new ArrayList<>();
        for (OrderDetail orderDetail : orderItemList) {
            statement.setObject(1, orderDetail.getCode());
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                itemList.add(new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), orderDetail.getPrice(), orderDetail.getOrderQty()));
            }
        }
        return itemList;
    }

}
