package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 角色菜单多对多关联表
 * </p>
 *
 * @author lcf
 * @since 2024-05-30
 */
@Getter
@Setter
@TableName("sys_role_authority")
public class SysRoleAuthority implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色菜单关联表自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 权限菜单ID
     */
    private Integer authorityId;
}
