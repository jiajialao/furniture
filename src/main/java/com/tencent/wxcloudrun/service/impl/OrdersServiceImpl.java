package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.OrdersMapper;
import com.tencent.wxcloudrun.model.Orders;
import com.tencent.wxcloudrun.service.OrdersService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【orders】的数据库操作Service实现
* @createDate 2023-06-16 20:01:31
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




