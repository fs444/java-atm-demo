/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountdemo;

import java.sql.DriverManager;;


/**
 *
 * @author david
 */
public class DataBase {
    
    private static final String dbClassName = "com.mysql.cj.jdbc.Driver";
    
    private static final String CONNECTION = "jdbc:mysql://localhost:3306/bank_account_demo";
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "1234";
    
    
    public static java.sql.Connection connection() throws Exception {
        Class.forName(dbClassName);
        
        return DriverManager.getConnection(CONNECTION, USER, PASSWORD);
    }
    
}
