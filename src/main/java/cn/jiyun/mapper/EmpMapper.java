package cn.jiyun.mapper;

import cn.jiyun.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<Emp> findAll();

    void addEmp(@Param(value="emp") Emp emp);

    void deleteEmp(@Param(value = "eid") Integer eid);

    Emp selectById(@Param(value = "eid") Integer eid);
    void updateEmp(@Param(value = "emp") Emp emp);
}
