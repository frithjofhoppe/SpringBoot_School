package com.swisscocde.SpringDerbyDemo.service;

import com.swisscocde.SpringDerbyDemo.entity.SchoolGroup;
import com.swisscocde.SpringDerbyDemo.entity.Student;
import com.swisscocde.SpringDerbyDemo.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolGroupService
{

    @Autowired
    GroupRepository groupRepository;
    //@Autowired
   //StudentRepository studentRepository;

    public void saveGroup(SchoolGroup schoolGroup)
    {
        groupRepository.save(schoolGroup);
    }

    public SchoolGroup findGroupById(String id)
    {
        return groupRepository.findOne(id);
    }

    public List<SchoolGroup> getAllGroups()
    {
        Iterable<SchoolGroup> groups = groupRepository.findAll();
        List<SchoolGroup> backSchoolGroups = new ArrayList<SchoolGroup>();

        for(SchoolGroup g: groups)
        {
            backSchoolGroups.add(g);
        }

        return backSchoolGroups;
    }

    public void updateGroup(SchoolGroup schoolGroup)
    {
        String id;
        for(SchoolGroup g: getAllGroups())
        {
            if(g.getId().equals(schoolGroup.getId()))
            {
                groupRepository.save(schoolGroup);
            }
        }
    }

    public void deleteGroup(SchoolGroup schoolGroup)
    {
        groupRepository.delete(schoolGroup.getId());
    }

    public void joinGroup(Student student)
    {
        SchoolGroup gr = student.getSchoolGroup();
        for(SchoolGroup g: getAllGroups())
        {
            if(g.getId().equals(gr.getId()))
            {
               //studentRepository.save(student);
            }
        }
    }
}
