package com.gausscode.competitiveanalysis.service;

import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.entity.App;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 应用 服务类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
public interface AppService extends IService<App> {

    Boolean add(App app);

    Boolean update(App app);

    Boolean delete(Integer id);

    List<App> appList();

}
