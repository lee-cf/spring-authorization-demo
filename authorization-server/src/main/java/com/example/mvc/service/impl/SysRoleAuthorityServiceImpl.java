package com.example.mvc.service.impl;

import com.example.mvc.entity.SysRoleAuthority;
import com.example.mvc.mapper.SysRoleAuthorityMapper;
import com.example.mvc.service.ISysRoleAuthorityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色菜单多对多关联表 服务实现类
 * </p>
 *
 * @author lcf
 * @since 2024-05-30
 */
@Service
public class SysRoleAuthorityServiceImpl extends ServiceImpl<SysRoleAuthorityMapper, SysRoleAuthority> implements ISysRoleAuthorityService {

}
