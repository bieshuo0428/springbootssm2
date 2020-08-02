package cn.jiyun.service;

import cn.jiyun.mapper.DeptMapper;
import cn.jiyun.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    public List<Dept> toAddfind(){
        return deptMapper.toAddfind();
    }

}
