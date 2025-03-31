package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.demo.db.DBConnection;
import com.demo.model.Student;

public class StudentDaoImplements implements StudentDaoInterface{

    @Override
    public boolean inserStudent(Student s) {
        boolean flag = false;
        try {
            Connection con = DBConnection.createConnection();
            String query = "insert into student_details(sname,clgname,city,percentage) values(?,?,?,?)";
            PreparedStatement pmtp = con.prepareStatement(query);
            pmtp.setString(1, s.getName());
            pmtp.setString(2, s.getClgname());
            pmtp.setString(3, s.getCity());
            pmtp.setDouble(4, s.getPercentage());
            pmtp.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int roll) {
        boolean flag = false;
        try {
            Connection con = DBConnection.createConnection();
            String query = "delete from student_details where rollnum="+roll;
            PreparedStatement pmpt = con.prepareStatement(query);
            pmpt.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int roll, String update, int ch, Student s) {
        boolean flag = false;
        try {
            Connection con = DBConnection.createConnection();
            if(ch==1){
                String query = "update student_details set sname=? where rollnum=?";
                PreparedStatement pmpt = con.prepareStatement(query);
                pmpt.setString(1, update);
                pmpt.setInt(2, roll);
                pmpt.executeUpdate();
                flag = true;
            }else if(ch==2){
                String query = "update student_details set clgname=? where rollnum=?";
                PreparedStatement pmpt = con.prepareStatement(query);
                pmpt.setString(1, update);
                pmpt.setInt(2, roll);
                pmpt.executeUpdate();
                flag = true;
            }else if(ch==3){
                String query = "update student_details set city=? where rollnum=";
                PreparedStatement pmpt = con.prepareStatement(query);
                pmpt.setString(1, update);
                pmpt.setInt(2, roll);
                pmpt.executeUpdate();
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void showallstudent() {
        try {
            Connection con = DBConnection.createConnection();
            String query = "select * from student_details";
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(query);
            while(rst.next()){
                System.out.println("RollNumber: "+rst.getInt(1)+"\n" +
                        "Name: "+rst.getString(2)+"\n" +
                        "Clg name: "+rst.getString(3)+"\n" +
                        "City: "+rst.getString(4)+"\n" +
                        "Percentage: "+rst.getDouble(5));
                System.out.println("----------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean showstudentbyid(int roll) {
        boolean flag = false;
        try {
            Connection con = DBConnection.createConnection();
            String query = "select * from student_details where rollnum="+roll;
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery(query);
            while(rst.next()){
                System.out.println("RollNumber: "+rst.getInt(1)+"\n" +
                        "Name: "+rst.getString(2)+"\n" +
                        "Clg name: "+rst.getString(3)+"\n" +
                        "City: "+rst.getString(4)+"\n" +
                        "Percentage: "+rst.getDouble(5));
                System.out.println("----------------------------------");
                flag = true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}
