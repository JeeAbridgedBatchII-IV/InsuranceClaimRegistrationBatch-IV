package com.insurance.claim.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection1 {
private static Connection conn=null;
public static Connection getConnection() throws IOException {
FileInputStream fis;
Properties props=new Properties();
String filepath="E:\\project\\InsuranceClaimRegistrationBatch-IV\\ClaimProject\\src\\com\\insurance\\claim\\utils\\database.properties";
/*String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="system";
String password="shreya10";*/
try {
fis=new FileInputStream(filepath);
props.load(fis);
String user=props.getProperty("username");
String password=props.getProperty("password");
String url = props.getProperty("url");
conn = DriverManager.getConnection(url,user,password);

}catch (SQLException e) {
e.printStackTrace();
}

return conn;

}
public static void closeConnection() {
try {
conn.close();
}catch(SQLException e) {
e.printStackTrace();
}
}
}
