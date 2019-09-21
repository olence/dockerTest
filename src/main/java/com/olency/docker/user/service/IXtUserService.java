package com.olency.docker.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.olency.docker.entity.XtUser;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author olency
 * @since 2019-09-21
 */
public interface IXtUserService extends IService<XtUser> {

   XtUser getXtUserById(int id);
}
