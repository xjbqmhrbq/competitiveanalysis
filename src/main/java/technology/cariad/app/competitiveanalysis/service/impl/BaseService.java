package technology.cariad.app.competitiveanalysis.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;

import java.io.Serializable;

public class BaseService<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

    public T add(T obj) {
        if (save(obj)) {
            return obj;
        }
        return null;
    }

    public T update(T obj) {
        if (updateById(obj)) {
            return obj;
        }
        return null;
    }

    public boolean removeById(Serializable id) {
        T obj = getById(id);
        if (obj == null) return false;
        return SqlHelper.retBool(getBaseMapper().deleteById(id));
    }

}
