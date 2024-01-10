package technology.cariad.app.competitiveanalysis.service;

import technology.cariad.app.competitiveanalysis.core.entity.Label;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
public interface LabelService extends IService<Label> {

    Label add(Label label);

    Label update(Label label);

    List<Label> searchByName(String name);

    Boolean removeById(Integer id);

}
