package com.gausscode.competitiveanalysis.service;

import com.gausscode.competitiveanalysis.core.ResultDto;
import com.gausscode.competitiveanalysis.entity.App;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 应用 服务类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
public interface AppService extends IService<App> {

    ResultDto add(App app);

    ResultDto update(App app);

    ResultDto delete(Integer id);

    ResultDto appList();

}
