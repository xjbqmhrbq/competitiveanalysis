package technology.cariad.app.competitiveanalysis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import technology.cariad.app.competitiveanalysis.core.entity.App;
import technology.cariad.app.competitiveanalysis.exception.ParamsException;
import technology.cariad.app.competitiveanalysis.mapper.AppMapper;
import technology.cariad.app.competitiveanalysis.service.AppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    public Boolean update(App app) throws ParamsException {
        if (query(app) == null) {
            throw new ParamsException("id");
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

    public App query(App app){
        LambdaQueryWrapper<App> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(App::getId,app.getId());
        List<App> list =list(wrapper);
        return list.isEmpty() ? null : list.get(0);
    }
}
