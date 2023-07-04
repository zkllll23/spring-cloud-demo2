package net.biancheng.c.service.impl;

import net.biancheng.c.entity.Dept;
import net.biancheng.c.mapper.Dept8002Mapper;
import net.biancheng.c.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private Dept8002Mapper dept8002Mapper;

    @Override
    public Dept get(Integer deptNo) {
        return dept8002Mapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return dept8002Mapper.GetAll();
    }
}