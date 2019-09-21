package com.olency.docker.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.olency.docker.entity.XtUser;
import com.olency.docker.user.mapper.XtUserMapper;
import com.olency.docker.user.service.IXtUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author olency
 * @since 2019-09-21
 */
@Service
public class XtUserServiceImpl extends ServiceImpl<XtUserMapper, XtUser> implements IXtUserService {


    @Override
    public XtUser getXtUserById(int id) {
        return getById(id);
    }
}
