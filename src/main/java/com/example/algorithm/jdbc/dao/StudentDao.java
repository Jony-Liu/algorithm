package com.example.algorithm.jdbc.dao;

import com.example.algorithm.jdbc.entity.Student;

/**
 * @author Jony-Liu
 */
public interface StudentDao {

    /**
     * get student information
     * @param studentno
     * @return
     */
    Student getStudent(int studentno);

}
