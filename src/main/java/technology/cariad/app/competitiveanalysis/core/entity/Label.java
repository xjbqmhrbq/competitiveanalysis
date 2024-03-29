package technology.cariad.app.competitiveanalysis.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class Label extends Model<Label> {

    private static final long serialVersionUID = 1L;

    /**
     * 标签ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名，唯一
     */
    private String name;

    /**
     * 是否可用，用于标记删除，0表示删除
     */
    @TableLogic
    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
