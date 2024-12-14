package com.itheima.controller;

import com.itheima.pojo.OperateLog;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.OperateLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 滴滴滴
 * @CreateTime: 2024-12-10
 * @Description: 处理日志
 * @Version: 1.0
 */

@Slf4j
@RestController
@RequestMapping("/log")
public class OperateLogController {

    @Autowired
    private OperateLogService operateLogService;

    @RequestMapping("/page")
    public Result page(OperateLog operateLog) {
        log.info("查询所有日志：{}", operateLog);
        PageResult<OperateLog> pageResult = operateLogService.FindAll(operateLog);
        return Result.success(pageResult);
    }
}
