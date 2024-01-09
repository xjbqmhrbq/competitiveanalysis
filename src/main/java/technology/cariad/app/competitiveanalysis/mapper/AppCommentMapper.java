package technology.cariad.app.competitiveanalysis.mapper;

import technology.cariad.app.competitiveanalysis.core.entity.AppComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 爬虫抓取应用各个版本评论 Mapper 接口
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Mapper
public interface AppCommentMapper extends BaseMapper<AppComment> {

}
