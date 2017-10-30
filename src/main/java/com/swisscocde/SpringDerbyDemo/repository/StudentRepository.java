package com.swisscocde.SpringDerbyDemo.repository;

import com.swisscocde.SpringDerbyDemo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;


public interface StudentRepository extends CrudRepository<Student,String>
{

}
