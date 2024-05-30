package com.example.mvc.service.impl;

import com.example.mvc.entity.Oauth2ThirdAccount;
import com.example.mvc.mapper.Oauth2ThirdAccountMapper;
import com.example.mvc.service.IOauth2ThirdAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 三方登录账户信息表 服务实现类
 * </p>
 *
 * @author lcf
 * @since 2024-05-30
 */
@Service
public class Oauth2ThirdAccountServiceImpl extends ServiceImpl<Oauth2ThirdAccountMapper, Oauth2ThirdAccount> implements IOauth2ThirdAccountService {

}
