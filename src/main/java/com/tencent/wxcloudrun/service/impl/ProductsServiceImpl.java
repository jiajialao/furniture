package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tencent.wxcloudrun.dao.ProductsMapper;
import com.tencent.wxcloudrun.model.Products;
import com.tencent.wxcloudrun.service.ProductsService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【products】的数据库操作Service实现
* @createDate 2023-06-16 20:01:31
*/
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products>
    implements ProductsService{

}




