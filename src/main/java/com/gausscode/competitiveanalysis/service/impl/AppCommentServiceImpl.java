package com.gausscode.competitiveanalysis.service.impl;

import com.gausscode.competitiveanalysis.entity.AppComment;
import com.gausscode.competitiveanalysis.mapper.AppCommentMapper;
import com.gausscode.competitiveanalysis.service.AppCommentService;
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
