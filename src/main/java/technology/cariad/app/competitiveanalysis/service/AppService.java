package technology.cariad.app.competitiveanalysis.service;

import technology.cariad.app.competitiveanalysis.core.entity.App;
import com.baomidou.mybatisplus.extension.service.IService;
import technology.cariad.app.competitiveanalysis.exception.ParamsException;

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

    Boolean update(App app) throws ParamsException;

    Boolean delete(Integer id);

    List<App> appList();

}
