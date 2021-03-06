package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import com.imooc.oa.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Repository("employeeDao")
public interface EmployeeDao {
    void save(Employee employee);

    void update(Employee employee);

    void delete(String sn);

    Employee select(String sn);

    List<Employee> selectAll();

    List<Employee> selectByDepartmentAndPost(@Param("department")Department department, @Param("post")String post);
}
