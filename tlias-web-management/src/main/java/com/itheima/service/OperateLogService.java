package com.itheima.service;

import com.itheima.pojo.OperateLog;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;

public interface OperateLogService {
    // 查询日志

    PageResult<OperateLog> FindAll(OperateLog operateLog);

}
