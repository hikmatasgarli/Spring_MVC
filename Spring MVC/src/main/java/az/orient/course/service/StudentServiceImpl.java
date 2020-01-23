package az.orient.course.service;
import az.orient.course.dao.StudentDao;
import az.orient.course.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    public List<Student> getStudentList() throws Exception {
        return studentDao.getStudentList();
    }

    public void addStudent(Student student) throws Exception {
        studentDao.addStudent(student);
    }

    @Override
    public List<Student> getStudentById(Long studentId) throws Exception {
       return studentDao.getStudentById(studentId);
    }

    @Override
    public void updateStudent(Student student, Long studentId) throws Exception {
        studentDao.updateStudent(student,studentId);
    }

    @Override
    public void deleteStudent(Long studentId) throws Exception {
        studentDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        return studentDao.searchStudentData(keyword);
    }
}
