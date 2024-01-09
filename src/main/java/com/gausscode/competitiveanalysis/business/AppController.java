package com.gausscode.competitiveanalysis.business;


import cn.hutool.core.util.ObjectUtil;
import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.entity.App;
import com.gausscode.competitiveanalysis.service.AppService;
import com.gausscode.competitiveanalysis.tools.ResultUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 应用 前端控制器
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @Resource
    private AppService appService;


    @PostMapping
    public ResultDto add(@RequestBody App app){
        if(StringUtils.isEmpty(app.getName())){
            return ResultUtil.error("APP名称为空");
        }
        return ResultUtil.success(appService.add(app));
    }

    @PutMapping
    public ResultDto update(@RequestBody App app){
        if(StringUtils.isEmpty(app.getName())){
            return ResultUtil.error("APP名称为空");
        }
        if(ObjectUtil.isEmpty(app.getId())){
            return ResultUtil.error("APP主键id为空");
        }
        return ResultUtil.success(appService.update(app));
    }

    @DeleteMapping("/{id}")
    public ResultDto delete(@PathVariable("id") Integer id){
        return ResultUtil.success(appService.delete(id));
    }

    @GetMapping
    public ResultDto list(){
        return  ResultUtil.success(appService.appList());
    }
}
