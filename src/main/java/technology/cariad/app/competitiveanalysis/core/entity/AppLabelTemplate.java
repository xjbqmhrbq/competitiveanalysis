package technology.cariad.app.competitiveanalysis.core.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * app标签的模板库，用于存储当前(最新)版本的app标签关系
 * </p>
 *
 * @author lx
 * @since 2024-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AppLabelTemplate extends Model<AppLabelTemplate> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer appId;

    private Integer labelId;

    /**
     * /app/label1/label2
     */
    private String url;

    /**
     * 1:最终，0:不是
     */
    private Boolean end;

    /**
     * 描述
     */
    private String desc;

    /**
     * 图片Url，用;分割
     */
    private String imageUrl;

    private Date createTime;

    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
