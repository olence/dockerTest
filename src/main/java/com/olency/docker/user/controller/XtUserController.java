package com.olency.docker.user.controller;


import com.olency.docker.entity.XtUser;
import com.olency.docker.user.service.IXtUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author olency
 * @since 2019-09-21
 */
@Controller
@RequestMapping("/user/XtUserModel")
public class XtUserController {

    @Autowired
    IXtUserService xtUserService;

    @ResponseBody
    @RequestMapping(value = "getUser")
    public Object getUser(int id) {
        return new XtUser().selectById(id);
    }

}
