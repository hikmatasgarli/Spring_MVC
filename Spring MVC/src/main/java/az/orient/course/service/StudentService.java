package az.orient.course.service;

import az.orient.course.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentList() throws Exception;

    void addStudent(Student student) throws Exception;

    List<Student> getStudentById(Long studentId) throws Exception;

    void updateStudent(Student student, Long studentId) throws Exception;

    void deleteStudent(Long studentId) throws Exception;

    List<Student> searchStudentData(String keyword) throws Exception;
}
