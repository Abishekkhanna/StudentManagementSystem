package com.demo.dao;

import com.demo.model.Student;

public interface StudentDaoInterface {
    public boolean inserStudent(Student s);
    public boolean delete(int roll);
    public boolean update(int roll,String update,int ch,Student s);
    public void showallstudent();
    public boolean showstudentbyid(int roll);
}
