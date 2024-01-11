package technology.cariad.app.competitiveanalysis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface BaseService<T> extends IService<T> {

    default T add(T obj) {
        if (save(obj)) {
            return obj;
        }
        return null;
    }

    default T update(T obj) {
        if (updateById(obj)) {
            return obj;
        }
        return null;
    }

    default Page<T> getByPage(int pageNum, int pageSize) {
        Page<T> page = new Page<>(pageNum, pageSize);
        return getBaseMapper().selectPage(page, null);
    }

}
