package com.itheima.mapper;

import com.itheima.pojo.OperateLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OperateLogMapper {

    //插入日志数据
    @Insert("insert into operate_log (operate_emp_id, operate_time, class_name, method_name, method_params, return_value, cost_time) " +
            "values (#{operateEmpId}, #{operateTime}, #{className}, #{methodName}, #{methodParams}, #{returnValue}, #{costTime});")
    public void insert(OperateLog log);
    //分页查询日志数据
    @Select("SELECT e.name operateEmpName,o.* FROM emp e RIGHT JOIN operate_log o ON e.dept_id = o.operate_emp_id")
    //@Select("select * from operate_log " )
    List<OperateLog> list(OperateLog operateLog);
}
