package com.swisscocde.SpringDerbyDemo.repository;

import com.swisscocde.SpringDerbyDemo.entity.SchoolGroup;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<SchoolGroup, String>
{

}
