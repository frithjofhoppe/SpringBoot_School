package com.swisscocde.SpringDerbyDemo.controller;

import com.swisscocde.SpringDerbyDemo.entity.SchoolGroup;
import com.swisscocde.SpringDerbyDemo.entity.Student;
import com.swisscocde.SpringDerbyDemo.service.SchoolGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolGroupController
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
    private SchoolGroupService schoolGroupService;

    @RequestMapping(value = "/schoolGroup", method = RequestMethod.POST)
    public void saveGroup(@RequestBody SchoolGroup schoolGroup)
    {
        schoolGroupService.saveGroup(schoolGroup);
    }

    @RequestMapping(value = "/schoolGroup/{id}",method = RequestMethod.GET)
    public SchoolGroup getGroupById(@PathVariable String id)
    {
        return schoolGroupService.findGroupById(id);
    }

    @RequestMapping(value = "/schoolGroup", method = RequestMethod.PUT)
    public void updateGroup(@RequestBody SchoolGroup schoolGroup)
    {
        schoolGroupService.updateGroup(schoolGroup);
    }

    @RequestMapping(value = "/schoolGroup", method = RequestMethod.DELETE)
    public void deleteGroup(@RequestBody SchoolGroup schoolGroup)
    {
        schoolGroupService.deleteGroup(schoolGroup);
    }

    @RequestMapping(value = "/schoolGroup",method = RequestMethod.GET)
    public List<SchoolGroup> getAllGroups()
    {
        return schoolGroupService.getAllGroups();
    }
}
