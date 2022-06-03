package com.itstyle.quartz.service;

import java.util.List;
import com.itstyle.quartz.entity.QuartzEntity;
import org.quartz.SchedulerException;

public interface IJobService {

    /**
     * 查询任务列表
     */
    List<QuartzEntity> listQuartzEntity(QuartzEntity quartz,Integer pageNo,Integer pageSize) throws SchedulerException;

    /**
     * 查询任务数量
     */
    Long listQuartzEntity(QuartzEntity quartz);	
}
