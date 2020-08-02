package cn.jiyun.service;

import cn.jiyun.mapper.EmpMapper;
import cn.jiyun.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpService {
    @Autowired(required = false)
    private EmpMapper empMapper;

    public List<Emp> findAll(){
        return this.empMapper.findAll();
    }
    public void addEmp(Emp emp){
        empMapper.addEmp(emp);
    }

    public void deleteEmp(Integer eid){
        empMapper.deleteEmp(eid);
    }

    public Emp selectById(Integer eid) {
        return empMapper.selectById(eid);
    }


    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }

}
