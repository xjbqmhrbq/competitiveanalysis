package com.gausscode.competitiveanalysis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Function extends Model<Function> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 0删除1正常
     */
    @TableLogic
    private Boolean status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 操作人
     */
    private String operator;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
