package com.chinagoods.framework.thinkcloud.repo.api.impl;

import com.chinagoods.framework.thinkcloud.domain.UmsUser;
import com.chinagoods.framework.thinkcloud.repo.api.UmsUserRepository;
import com.chinagoods.framework.thinkcloud.repo.mapper.UmsUserMapper;
import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {
}
