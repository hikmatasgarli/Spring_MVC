package az.orient.course.controller;

import az.orient.course.model.Student;
import az.orient.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = {"/","/index"})
    public ModelAndView index() throws Exception {
        ModelAndView model = new ModelAndView();
      List<Student> studentList =  studentService.getStudentList();
        model.addObject("fullname","Hikmat Asgarli");
        model.setViewName("index");
        return model;
    }

    @GetMapping(value = "/newStudent")
    public ModelAndView newStudent() throws Exception {
        ModelAndView model = new ModelAndView("student/newStudent");

        return model;
    }

    @GetMapping (value = "/getStudentList")
    public ModelAndView studentList() throws Exception {
        ModelAndView model = new ModelAndView("student/studentList");
        List<Student> studentList = studentService.getStudentList();
        model.addObject("studentList",studentList);
        return model;
    }

    @PostMapping(value = "/addStudent")
    public @ResponseBody String addStudent(@RequestParam("name") String name, @RequestParam("surname") String surname,@RequestParam("address") String address)  {
        String result = "fail";
        try {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAddress(address);
        studentService.addStudent(student);
        result = "success";

    }catch (Exception ex) {
        ex.printStackTrace();
    }
        return result;
    }

    @GetMapping(value = "/editStudent")
    public ModelAndView editStudent(@RequestParam(name = "studentId") String studentId) throws Exception {
        ModelAndView model = new ModelAndView("student/editStudent");
       List<Student>studentList = studentService.getStudentById(Long.parseLong(studentId));
        model.addObject("studentList",studentList);
        return model;
    }
    @PostMapping(value = "/updateStudent")
    public @ResponseBody String updateStudent(@RequestParam(name = "studentId") String studentId, @RequestParam("name") String name,@RequestParam("surname") String surname) throws Exception {
        String result = "fail";
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        studentService.updateStudent(student,Long.parseLong(studentId));
        result = "success";
        return result;
    }

}
