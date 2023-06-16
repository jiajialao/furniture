package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.UsersMapper;
import com.tencent.wxcloudrun.model.Users;
import com.tencent.wxcloudrun.service.UsersService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-06-16 20:01:31
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




