package com.gausscode.competitiveanalysis.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.entity.App;
import com.gausscode.competitiveanalysis.mapper.AppMapper;
import com.gausscode.competitiveanalysis.service.AppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gausscode.competitiveanalysis.tools.ResultUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 应用 服务实现类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

    @Override
    public ResultDto add(App app) {
        if(StringUtils.isEmpty(app.getName())){
            return ResultUtil.error("APP名称为空");
        }
        return ResultUtil.success(save(app));
    }

    @Override
    public ResultDto update(App app) {
        if(StringUtils.isEmpty(app.getName())){
            return ResultUtil.error("APP名称为空");
        }
        if(ObjectUtil.isEmpty(app.getId())){
            return ResultUtil.error("APP主键id为空");
        }
        if(ObjectUtil.isNull(query(app))){
            return ResultUtil.error("查询不到APP");
        }
        return ResultUtil.success(saveOrUpdate(app));
    }

    @Override
    public ResultDto delete(Integer id) {
        return  ResultUtil.success(removeById(id));
    }

    @Override
    public ResultDto appList() {
        return ResultUtil.success(list());
    }

    private App query(App app){
        LambdaQueryWrapper<App> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(App::getId,app.getId());
        List<App> list =list(wrapper);
        return list.isEmpty() ? null : list.get(0);
    }
}
