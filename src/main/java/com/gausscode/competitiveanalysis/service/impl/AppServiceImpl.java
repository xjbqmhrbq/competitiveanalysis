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
    public Boolean add(App app) {
        return save(app);
    }

    @Override
    public Boolean update(App app) {
        if(ObjectUtil.isNull(query(app))){
            return false;
        }
        return saveOrUpdate(app);
    }

    @Override
    public Boolean delete(Integer id) {
        return  removeById(id);
    }

    @Override
    public List<App> appList() {
        return list();
    }

    private App query(App app){
        LambdaQueryWrapper<App> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(App::getId,app.getId());
        List<App> list =list(wrapper);
        return list.isEmpty() ? null : list.get(0);
    }
}
