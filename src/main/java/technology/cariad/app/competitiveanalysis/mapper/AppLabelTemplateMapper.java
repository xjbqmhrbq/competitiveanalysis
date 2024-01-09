package technology.cariad.app.competitiveanalysis.mapper;

import technology.cariad.app.competitiveanalysis.core.entity.AppLabelTemplate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * app标签的模板库，用于存储当前(最新)版本的app标签关系 Mapper 接口
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Mapper
public interface AppLabelTemplateMapper extends BaseMapper<AppLabelTemplate> {

}
