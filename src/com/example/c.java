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
   //��test���в���һ������
   sql="select * from tbl_user";
   //stmt.executeUpdate(sql);
   //����test���е����м�¼����ȡ�������
   //sql="select * from mytable";
   ResultSet rs=stmt.executeQuery(sql);
   System.out.println("���� ����");
   System.out.println(rs.next());
   while(rs.next())
   {
    no=rs.getInt(1);
    name=rs.getString(2);
    System.out.println(no+" "+name);
   }
   //�ر�����
   stmt.close();
   con.close();
  }catch(SQLException ex)
  {
   System.err.println("sqlexception :"+ex.getMessage());
  }
 }
}