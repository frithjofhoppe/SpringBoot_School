package com.swisscocde.SpringDerbyDemo.controller;

import com.swisscocde.SpringDerbyDemo.entity.SchoolGroup;
import com.swisscocde.SpringDerbyDemo.entity.Student;
import com.swisscocde.SpringDerbyDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    /**
     * saveStudent
     * getStudentById
     * updateStudent
     * deleteStudent
     *
     * saveGroup
     * getGroupById
     * updateGroup
     * deleteGroup
     */

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/schoolGroup/{gId}/student",method = RequestMethod.POST)
    private void saveStudent(@RequestBody Student student,@PathVariable String gId)
    {
        SchoolGroup sg = new SchoolGroup(gId,"");
        student.setSchoolGroup(sg);
        studentService.saveStudent(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    private Student getStudent(@PathVariable String id)
    {
        return studentService.findStudentById(id);
    }

    @RequestMapping(value="/student",method = RequestMethod.PUT)
    private void updateStudent(Student student)
    {
        studentService.updateStudent(student);
    }
}

