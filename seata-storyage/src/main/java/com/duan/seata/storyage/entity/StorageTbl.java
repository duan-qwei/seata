package com.duan.seata.storyage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author duanqiangwei
 * @since 2023-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("storage_tbl")
public class StorageTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 冻结数量
     */
    private Integer freezeCount;


}
