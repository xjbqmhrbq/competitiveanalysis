package com.gausscode.competitiveanalysis.business;


import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.entity.App;
import com.gausscode.competitiveanalysis.service.AppService;
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
    public ResultDto add(@RequestBody App request){
        return appService.add(request);
    }

    @PutMapping
    public ResultDto update(@RequestBody App request){
        return appService.update(request);
    }

    @DeleteMapping("/{id}")
    public ResultDto delete(@PathVariable("id") Integer id){
        return appService.delete(id);
    }

    @GetMapping
    public ResultDto list(){
        return appService.appList();
    }
}
