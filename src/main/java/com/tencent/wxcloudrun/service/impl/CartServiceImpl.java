package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.CartMapper;
import com.tencent.wxcloudrun.model.Cart;
import com.tencent.wxcloudrun.service.CartService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【cart】的数据库操作Service实现
* @createDate 2023-06-16 20:01:30
*/
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart>
    implements CartService{

}




