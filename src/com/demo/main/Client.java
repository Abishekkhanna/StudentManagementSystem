package com.demo.main;

import java.util.Scanner;
import com.demo.dao.StudentDaoImplements;
import com.demo.dao.StudentDaoInterface;
import com.demo.model.Student;
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDaoInterface doa = new StudentDaoImplements();
        System.out.println("Welcome to Student Management System");
        while(true){
            System.out.println("1.Add Student\n2.Show all Students\n3.Get Student based on roll no\n4.Delete Student\n5.Update Student\n6.Exit");
            System.out.println("Enter your Choice : ");
            int ch = sc.nextInt();
            if(ch==1){
                System.out.println("Add Student");
                System.out.println("Enter your Name : ");
                String name = sc.next();
                System.out.println("Enter your Clg Name : ");
                String clgname = sc.next();
                System.out.println("Enter your City Name : ");
                String cityname = sc.next();
                System.out.println("Enter your Percentage : ");
                Double percentage = sc.nextDouble();
                Student st = new Student(name, clgname, cityname, percentage);
                boolean flag = doa.inserStudent(st);
                if(flag){
                    System.out.println("Record Inserted Successfully");
                }else{
                    System.out.println("Record Not Inserted Please Try again");
                }
            }else if(ch==2){
                System.out.println("Show all Student");
                doa.showallstudent();
            }else if(ch==3){
                System.out.println("Get Student based on roll no");
                System.out.println("Enter roll no : ");
                int rollno = sc.nextInt();
                boolean flag = doa.showstudentbyid(rollno);
                if(!flag){
                    System.out.println("Roll No doesn't Exists !");
                }
            }else if(ch==4){
                System.out.println("Delete Student");
                System.out.println("Enter the roll no : ");
                int roll = sc.nextInt();
                boolean flag = doa.delete(roll);
                if(!flag){
                    System.out.println("Roll No doesn't Exists !");
                }
            }else if(ch==5){
                System.out.println("Update Student");
                System.out.println("1.Update name\n2.Update clgname\n3.Update City name\n4.Update percentage");
                System.out.println("Enter your Choice : ");
                int cho = sc.nextInt();
                System.out.println("Enter your roll Number : ");
                int roll = sc.nextInt();
                if(cho==1){
                    System.out.println("Enter new Name : ");
                    String name = sc.next();
                    Student st = new Student();
                    st.setName(name);
                    boolean flag = doa.update(roll, name, cho, st);
                    if(flag){
                        System.out.println("Name Updated");
                    }else{
                        System.out.println("Something went Wrong !");
                    }
                }else if(cho==2){
                    System.out.println("Enter new Clg Name : ");
                    String clgname = sc.next();
                    Student st = new Student();
                    st.setName(clgname);
                    boolean flag = doa.update(roll, clgname, cho, st);
                    if(flag){
                        System.out.println("Clg Name Updated");
                    }else{
                        System.out.println("Something went Wrong !");
                    }
                }else if(cho==3){
                    System.out.println("Enter new City Name : ");
                    String cityname = sc.next();
                    Student st = new Student();
                    st.setName(cityname);
                    boolean flag = doa.update(roll, cityname, cho, st);
                    if(flag){
                        System.out.println("City Name Updated");
                    }else{
                        System.out.println("Something went Wrong !");
                    }
                }else{
                    System.out.println("Invalid Option !");
                }
            }else if(ch==6){
                System.out.println("Thank You");
                System.exit(0);
            }else{
                System.out.println("Invalid Option Try Again");
            }
        }
    }
}
