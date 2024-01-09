package com.gausscode.competitiveanalysis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * app标签迭代历史，基于模板类，展现迭代历史。	
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AppLabelHistory extends Model<AppLabelHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 模板id
     */
    private Integer templateId;

    private Integer appId;

    private Integer labelId;

    private Integer versionId;

    /**
     * 0: 新增，1:删除, 2:修改 (位置改动属于 删除 + 新增)
     */
    private Integer type;

    private String url;

    private Boolean end;

    private String desc;

    private String imageUrl;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
