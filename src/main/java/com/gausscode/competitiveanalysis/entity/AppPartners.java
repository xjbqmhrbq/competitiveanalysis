package com.gausscode.competitiveanalysis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class AppPartners extends Model<AppPartners> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * appid
     */
    private Integer appId;

    /**
     * 标签id
     */
    private Integer labelId;

    /**
     * 功能名称
     */
    private String name;

    /**
     * 公司名称
     */
    private String compnay;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
