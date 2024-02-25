/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.controller;

import com.ws.computershop.connection.DBConnection;
import com.ws.computershop.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Waruna
 */
public class CustomerController {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static boolean addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException {

        String quary = "Insert Into Customer Values(?,?,?,?,?)";

        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, customer.getCid());
        statement.setObject(2, customer.getName());
        statement.setObject(3, customer.getNic());
        statement.setObject(4, customer.getAddress());
        statement.setObject(5, customer.getContact());
        return statement.executeUpdate() > 0;
    }

    public static Customer searchCustomerID(String id) throws ClassNotFoundException, SQLException {

        String quary = "Select * from Customer where CID=?";

        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, id);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
        }
        return null;
    }

    public static Customer searchCustomerNic(String nic) throws ClassNotFoundException, SQLException {

        String quary = "Select * from Customer where NIC=?";

        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, nic);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
        }
        return null;
    }

    public static Customer searchCustomerContact(int contact) throws ClassNotFoundException, SQLException {

        String quary = "Select * from Customer where CONTACT=?";

        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, contact);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
        }
        return null;
    }

    public static ArrayList<Customer> customerList() throws ClassNotFoundException, SQLException {

        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement("Select * from Customer");
        resultSet = statement.executeQuery();

        ArrayList<Customer> customerList = new ArrayList<>();
        while (resultSet.next()) {
            customerList.add(new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5)));
        }
        return customerList;
    }

    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {

        String quary = "Update Customer set Name=?,NIC=?,Address=?,Contact=? where CID=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, customer.getName());
        statement.setObject(2, customer.getNic());
        statement.setObject(3, customer.getAddress());
        statement.setObject(4, customer.getContact());
        statement.setObject(5, customer.getCid());
        return statement.executeUpdate() > 0;
    }

    public static boolean removeCustomer(String customerID) throws SQLException, ClassNotFoundException {
        String quary = "Delete From Customer where CID=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, customerID);
        return statement.executeUpdate() > 0;
    }

}
