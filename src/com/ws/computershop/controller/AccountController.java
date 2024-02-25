/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.controller;

import com.ws.computershop.connection.DBConnection;
import com.ws.computershop.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Waruna
 */
public class AccountController {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public static int createAccount(Account account) throws ClassNotFoundException, SQLException {

        String quary = "";
        connection = DBConnection.getDBConnection().getConnection();

        quary = "Select * from Account";
        statement = connection.prepareStatement(quary);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return 1;
        } else {
            quary = "Insert Into Account Values(?,?)";
            statement = connection.prepareStatement(quary);
            statement.setObject(1, account.getUserName());
            statement.setObject(2, account.getPassword());
            int result = statement.executeUpdate();
            if (0 == result) {
                return 2;
            } else if (1 == result) {
                return 3;
            }
        }
        return 4;
    }

    public static Account getAccount(String userName) throws ClassNotFoundException, SQLException {
        String quary = "Select * from Account Where USERNAME=?";
        connection = DBConnection.getDBConnection().getConnection();
        statement = connection.prepareStatement(quary);
        statement.setObject(1, userName);
        resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return new Account(resultSet.getString(1), resultSet.getString(2));
        }
        return null;
    }

    public static int updateAccount(Account account, String newPassword) throws ClassNotFoundException, SQLException {

        Account searchAccount = AccountController.getAccount(account.getUserName());
        if (null != searchAccount) {
            if (account.getPassword().equals(searchAccount.getPassword())) {
                String quary = "Update  Account set USERPASSWORD=? Where USERNAME=?";
                connection = DBConnection.getDBConnection().getConnection();
                statement = connection.prepareStatement(quary);
                statement.setObject(1, newPassword);
                statement.setObject(2, account.getUserName());
                int result = statement.executeUpdate();
                if (0 == result) {
                    return 2;
                } else if (1 == result) {
                    return 3;
                }
            } else {
                return 1;
            }
        }
        return 4;
    }
}
