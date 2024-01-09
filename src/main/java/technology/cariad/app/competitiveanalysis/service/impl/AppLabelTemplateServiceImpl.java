package technology.cariad.app.competitiveanalysis.service.impl;

import technology.cariad.app.competitiveanalysis.core.entity.AppLabelTemplate;
import technology.cariad.app.competitiveanalysis.mapper.AppLabelTemplateMapper;
import technology.cariad.app.competitiveanalysis.service.AppLabelTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app标签的模板库，用于存储当前(最新)版本的app标签关系 服务实现类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Service
public class AppLabelTemplateServiceImpl extends ServiceImpl<AppLabelTemplateMapper, AppLabelTemplate> implements AppLabelTemplateService {

}
