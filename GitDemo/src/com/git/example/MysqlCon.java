package com.git.example;
import java.sql.*;

class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

//Connection con=DriverManager.getConnection("jdbc:mysql://192.168.174.141:3306/dbstudent","root","root");
Connection con=DriverManager.getConnection("jdbc:mysql://192.168.174.142:3306/batchjobs","root","root");
//Connection con=DriverManager.getConnection("jdbc:mysql://192.168.174.130:3306/batchmate","root","root");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from user");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2)  );

con.close();

}catch(Exception e){ System.out.println(e);}

}
}