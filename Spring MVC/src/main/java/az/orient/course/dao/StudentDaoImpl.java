package az.orient.course.dao;

import az.orient.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Student> getStudentList()  {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM STUDENT WHERE ACTIVE = 1";
        List<Student> studentList = jdbc.query(sql, new BeanPropertyRowMapper(Student.class));
        return studentList;
    }
    @Override
    public void addStudent(Student student) throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO STUDENT (USERNAME,PASSWORD,NAME,SURNAME,ADDRESS,PHONE,DOB) VALUES (?,?,?,?,?,?,?)";
        jdbc.update(sql,new Object[] {student.getUsername(),student.getPassword(),student.getName(),student.getSurname(),
                                            student.getAddress(),student.getPhone(),student.getDob()});
    }

    @Override
    public List<Student> getStudentById(Long studentId) throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "SELECT ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM STUDENT WHERE ACTIVE = 1 AND ID = ?";
        List<Student> studentList =  jdbc.query(sql,new Object[]{studentId},new BeanPropertyRowMapper(Student.class));
        return studentList;
    }

    @Override
    public void updateStudent(Student student, Long studentId) throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "UPDATE STUDENT SET USERNAME = ?,PASSWORD = ?,NAME = ?,SURNAME = ?,ADDRESS = ?,PHONE = ?,DOB = ? WHERE ID = ?";
        jdbc.update(sql, new Object[]{student.getUsername(),student.getPassword(),student.getName(),student.getSurname(),
                student.getAddress(),student.getPhone(),student.getDob(),studentId});
    }

    @Override
    public void deleteStudent(Long studentId) throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "UPDATE STUDENT SET ACTIVE = 0 WHERE ID = ?";
        jdbc.update(sql,new Object[]{studentId});
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "SELECT ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM STUDENT WHERE ACTIVE = 1 " +
                "AND (LOWER(NAME) LIKE LOWER(?) OR LOWER(SURNAME) LIKE LOWER(?) OR LOWER(ADDRESS) LIKE LOWER(?))";
       List<Student>studentList = jdbc.query(sql,new Object[]{keyword},new BeanPropertyRowMapper(Student.class));
        return studentList;
    }
}
