package technology.cariad.app.competitiveanalysis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import technology.cariad.app.competitiveanalysis.core.entity.Function;
import technology.cariad.app.competitiveanalysis.core.entity.Label;
import technology.cariad.app.competitiveanalysis.mapper.FunctionMapper;
import technology.cariad.app.competitiveanalysis.mapper.LabelMapper;
import technology.cariad.app.competitiveanalysis.service.LabelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Service
public class LabelServiceImpl  extends ServiceImpl<LabelMapper, Label> implements LabelService {

    @Override
    public Label add(Label label) {
        return null;
    }

    @Override
    public Label update(Label label) {
        return null;
    }

    @Override
    public List<Label> searchByName(String name) {
        LambdaQueryWrapper<Label> wrapper = Wrappers.lambdaQuery();
        wrapper.like(Label::getName, name);
        return list(wrapper);
    }

}
