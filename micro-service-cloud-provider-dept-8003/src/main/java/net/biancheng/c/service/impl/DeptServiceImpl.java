package net.biancheng.c.service.impl;

import net.biancheng.c.entity.Dept;
import net.biancheng.c.mapper.Dept8003Mapper;
import net.biancheng.c.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private Dept8003Mapper dept8003Mapper;

    @Override
    public Dept get(Integer deptNo) {
        return dept8003Mapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return dept8003Mapper.GetAll();
    }
}