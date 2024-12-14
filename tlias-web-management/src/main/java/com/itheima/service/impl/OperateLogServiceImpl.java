package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.OperateLogMapper;
import com.itheima.pojo.OperateLog;
import com.itheima.pojo.PageResult;
import com.itheima.service.OperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 滴滴滴
 * @CreateTime: 2024-12-10
 * @Description: 日志处理
 * @Version: 1.0
 */
@Service
public class OperateLogServiceImpl implements OperateLogService {

    @Autowired
    private OperateLogMapper operateLogMapper;


    @Override
    public PageResult<OperateLog> FindAll(OperateLog operateLog) {
        PageHelper.startPage(operateLog.getPage(), operateLog.getPageSize());
        List<OperateLog> empList = operateLogMapper.list(operateLog);
        Page<OperateLog> p = (Page<OperateLog>) empList;
        return new PageResult<OperateLog>(p.getTotal(), p.getResult());
    }
}
