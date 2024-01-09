package technology.cariad.app.competitiveanalysis.core.entity;

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
public class AppVersion extends Model<AppVersion> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 版本名称
     */
    private String name;

    /**
     * appid
     */
    private Integer appId;

    /**
     * 描述
     */
    private String description;

    /**
     * 截图url（多个,间隔）
     */
    private String pic;

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

    /**
     * 版本发布时间
     */
    private String versionTime;

    /**
     * 版本号
     */
    private String versionCode;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
