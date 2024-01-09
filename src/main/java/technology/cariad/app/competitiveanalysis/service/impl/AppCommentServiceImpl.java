package technology.cariad.app.competitiveanalysis.service.impl;

import technology.cariad.app.competitiveanalysis.core.entity.AppComment;
import technology.cariad.app.competitiveanalysis.mapper.AppCommentMapper;
import technology.cariad.app.competitiveanalysis.service.AppCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 爬虫抓取应用各个版本评论 服务实现类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Service
public class AppCommentServiceImpl extends ServiceImpl<AppCommentMapper, AppComment> implements AppCommentService {

}
