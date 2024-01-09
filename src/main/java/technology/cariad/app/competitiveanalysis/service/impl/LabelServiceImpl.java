package technology.cariad.app.competitiveanalysis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import technology.cariad.app.competitiveanalysis.core.entity.Label;
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
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements LabelService {

    @Override
    public List<Label> searchByName(String name) {
        LambdaQueryWrapper<Label> wrapper = Wrappers.lambdaQuery();
        wrapper.like(Label::getName, name);
        return list(wrapper);
    }

    @Override
    public Boolean remove(Integer id) {
        Label label = getById(id);
        if (label == null || !label.getActive()) {
            return false;
        }
        label.setActive(false);
        return updateById(label);
    }
}
