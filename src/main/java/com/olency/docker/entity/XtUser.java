package com.olency.docker.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author olency
 * @since 2019-09-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class XtUser extends Model implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    @TableField("createTime")
    private LocalDateTime createTime;


}
