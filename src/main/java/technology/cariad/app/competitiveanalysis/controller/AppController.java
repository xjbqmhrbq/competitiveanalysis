package technology.cariad.app.competitiveanalysis.controller;


import cn.hutool.core.util.ObjectUtil;
import technology.cariad.app.competitiveanalysis.core.Result;
import technology.cariad.app.competitiveanalysis.core.entity.App;
import technology.cariad.app.competitiveanalysis.exception.ParamsException;
import technology.cariad.app.competitiveanalysis.service.AppService;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @RequestMapping("/add")
    public Result<App> add(@RequestBody App request) {
        if (request == null) {
            return Result.errorWithNull("app");
        }
        if (appService.add(request)) {
            return Result.success(request);
        }
        return Result.fail();
    }

    @PutMapping
    @RequestMapping("/update")
    public Result<App> update(@RequestBody App request) {
        if (request == null) {
            return Result.errorWithNull("app");
        }
        if (StringUtils.isEmpty(request.getName())) {
            return Result.errorWithNull("name");
        }
        if (ObjectUtil.isEmpty(request.getId())) {
            return Result.errorWithNull("id");
        }
        try {
            if (appService.update(request)) {
                return Result.success(request);
            } else {
                return Result.fail();
            }
        } catch (ParamsException e) {
            return e.getResult();
        }
    }

    @DeleteMapping("/update/{id}")
    public Result<Boolean> delete(@PathVariable("id") Integer id) {
        if (id == null) {
            return Result.errorWithNull("id");
        }
        return Result.success(appService.delete(id));
    }

    @GetMapping
    @RequestMapping("/list")
    public Result<List<App>> list() {
        return Result.success(appService.appList());
    }
}
