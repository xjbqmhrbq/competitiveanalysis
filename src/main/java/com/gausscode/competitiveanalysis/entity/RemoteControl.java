package com.gausscode.competitiveanalysis.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class RemoteControl extends Model<RemoteControl> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车机状态
     */
    @TableLogic
    private String status;

    /**
     * 功能
     */
    private String function;

    /**
     * 终端
     */
    private String terminal;

    /**
     * 车型名称
     */
    private String name;

    /**
     * 时长（单位秒）
     */
    private BigDecimal time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
