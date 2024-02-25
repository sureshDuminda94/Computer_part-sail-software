/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.computershop.databaseautocreater;

import com.ws.computershop.connection.DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Waruna
 */
public class DatabaseCreater {

    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static boolean isExistDatabase(String dataBaseName) throws ClassNotFoundException, SQLException {
        String quary = "Show Databases";
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost", "root", "mysql");
        statement = connection.prepareStatement(quary);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            if (resultSet.getString(1).equals(dataBaseName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean createDatabase() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

        lock.writeLock().lock();
        try {
            boolean existDatabase = DatabaseCreater.isExistDatabase("computershop");
            if (true && existDatabase) {

            } else if (false && existDatabase) {
                System.out.println("database nee");
                connection = DBConnection.getDBConnection().getConnection();
                connection.setAutoCommit(false);
                try {
                    int count = 0;
                    File file = new File("DATABASE.SQL");
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    String line = bufferedReader.readLine();
                    StringTokenizer stringTokenizer = new StringTokenizer(line, "####");
                    for (int i = 0; i < 6; i++) {
                        statement = connection.prepareStatement(stringTokenizer.nextToken());
                        System.out.println(stringTokenizer.nextToken());
                        count += statement.executeUpdate();
                    }
                    if (6 == count) {
                        connection.commit();
                        return true;
                    } else {
                        connection.rollback();
                        return false;
                    }
                } finally {
                    connection.setAutoCommit(true);
                }

            }

        } finally {
            lock.writeLock().unlock();
        }
        return false;
    }
}
