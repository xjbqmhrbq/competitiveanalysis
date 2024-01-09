package com.gausscode.competitiveanalysis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 爬虫抓取应用各个版本评论
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AppComment extends Model<AppComment> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * appid
     */
    private Integer appId;

    /**
     * 版本id
     */
    private Integer versionId;

    /**
     * 星级
     */
    private Integer star;

    /**
     * 用户名称
     */
    private String user;

    /**
     * 评论时间
     */
    private Date commentTime;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论来源
     */
    private String source;

    /**
     * ip地址
     */
    private String ipAddress;

    /**
     * 手机型号
     */
    private String model;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
