package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.OrderItemsMapper;
import com.tencent.wxcloudrun.model.OrderItems;
import com.tencent.wxcloudrun.service.OrderItemsService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【order_items】的数据库操作Service实现
* @createDate 2023-06-16 20:01:31
*/
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems>
    implements OrderItemsService{

}




