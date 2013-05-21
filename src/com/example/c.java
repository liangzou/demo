package com.example;

import java.sql.*;
public class c
{
 public static void main (String args[])
 {
  String urlstr="jdbc:mysql://liangzou.duapp.com:4050/XuUimDmbDFRAkHkUPDIr";
  Connection con;
  String sql;
  Statement stmt;
  String name;
  int no;
  try
  {
   Class.forName("com.mysql.jdbc.Driver");
  }
  catch(java.lang.ClassNotFoundException e)
  {
   System.err.print("classnotfoundexception :");
   System.err.print(e.getMessage());
  }
  try
  {
   con=DriverManager.getConnection(urlstr,"jumxZ7Tj9Kpn3hpBRFkTYocE","CgKkwz8sO8y79UtqAbUxw0y3IGoqQNM1");
   stmt=con.createStatement();
   //向test表中插入一条数据
   sql="select * from tbl_user";
   //stmt.executeUpdate(sql);
   //检索test表中的所有记录并获取数据输出
   //sql="select * from mytable";
   ResultSet rs=stmt.executeQuery(sql);
   System.out.println("号码 姓名");
   System.out.println(rs.next());
   while(rs.next())
   {
    no=rs.getInt(1);
    name=rs.getString(2);
    System.out.println(no+" "+name);
   }
   //关闭连接
   stmt.close();
   con.close();
  }catch(SQLException ex)
  {
   System.err.println("sqlexception :"+ex.getMessage());
  }
 }
}