package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.AddressesMapper;
import com.tencent.wxcloudrun.model.Addresses;
import com.tencent.wxcloudrun.service.AddressesService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【addresses】的数据库操作Service实现
* @createDate 2023-06-16 20:01:30
*/
@Service
public class AddressesServiceImpl extends ServiceImpl<AddressesMapper, Addresses>
    implements AddressesService{

}




