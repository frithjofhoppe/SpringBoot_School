package com.swisscocde.SpringDerbyDemo.service;

import com.swisscocde.SpringDerbyDemo.entity.Student;
import com.swisscocde.SpringDerbyDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService
{

    @Autowired
    StudentRepository studentRepository;

    public void saveStudent(Student student)
    {
        studentRepository.save(student);
    }

    public Student findStudentById(String id)
    {
        return studentRepository.findOne(id);
    }

    public List<Student> getAllStudent()
    {
        Iterable<Student> students = studentRepository.findAll();
        List<Student> backStudennts = new ArrayList<Student>();

        for(Student s: students)
        {
            backStudennts.add(s);
        }

        return backStudennts;
    }

    public void updateStudent(Student student)
    {
        String id;
        for(Student s: getAllStudent())
        {
            if(s.getId().equals(student.getId()))
            {
                studentRepository.save(student);
            }
        }
    }

    public void deleteStudent(Student student)
    {
        studentRepository.delete(student.getId());
    }

}
