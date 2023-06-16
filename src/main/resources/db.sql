CREATE TABLE `Counters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL DEFAULT '1',
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8


-- 创建用户表
CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT, -- 用户ID
                       username VARCHAR(50) NOT NULL, -- 用户名
                       password VARCHAR(50) NOT NULL, -- 密码
                       email VARCHAR(50) NOT NULL, -- 邮箱
                       phone VARCHAR(20) NOT NULL, -- 手机号码
                       created_at DATETIME DEFAULT CURRENT_TIMESTAMP -- 创建时间
);

-- 创建地址表
CREATE TABLE addresses (
                           id INT PRIMARY KEY AUTO_INCREMENT, -- 地址ID
                           user_id INT NOT NULL, -- 用户ID
                           address VARCHAR(100) NOT NULL, -- 地址
                           created_at DATETIME DEFAULT CURRENT_TIMESTAMP, -- 创建时间
                           FOREIGN KEY (user_id) REFERENCES users(id) -- 外键关联用户表
);

-- 创建商品表
CREATE TABLE products (
                          id INT PRIMARY KEY AUTO_INCREMENT, -- 商品ID
                          name VARCHAR(100) NOT NULL, -- 商品名称
                          price DECIMAL(10, 2) NOT NULL, -- 商品价格
                          description TEXT, -- 商品描述
                          thumbnail VARCHAR(100), -- 商品缩略图
                          created_at DATETIME DEFAULT CURRENT_TIMESTAMP -- 创建时间
);

-- 创建购物车表
CREATE TABLE cart (
                      id INT PRIMARY KEY AUTO_INCREMENT, -- 购物车ID
                      user_id INT NOT NULL, -- 用户ID
                      product_id INT NOT NULL, -- 商品ID
                      quantity INT NOT NULL, -- 商品数量
                      created_at DATETIME DEFAULT CURRENT_TIMESTAMP, -- 创建时间
                      FOREIGN KEY (user_id) REFERENCES users(id), -- 外键关联用户表
                      FOREIGN KEY (product_id) REFERENCES products(id) -- 外键关联商品表
);

-- 创建订单表
CREATE TABLE orders (
                        id INT PRIMARY KEY AUTO_INCREMENT, -- 订单ID
                        user_id INT NOT NULL, -- 用户ID
                        status VARCHAR(20) NOT NULL, -- 订单状态
                        total_amount DECIMAL(10, 2) NOT NULL, -- 订单总金额
                        created_at DATETIME DEFAULT CURRENT_TIMESTAMP, -- 创建时间
                        FOREIGN KEY (user_id) REFERENCES users(id) -- 外键关联用户表
);

-- 创建订单商品表
CREATE TABLE order_items (
                             id INT PRIMARY KEY AUTO_INCREMENT, -- 订单商品ID
                             order_id INT NOT NULL, -- 订单ID
                             product_id INT NOT NULL, -- 商品ID
                             quantity INT NOT NULL, -- 商品数量
                             price DECIMAL(10, 2) NOT NULL, -- 商品价格
                             FOREIGN KEY (order_id) REFERENCES orders(id), -- 外键关联订单表
                             FOREIGN KEY (product_id) REFERENCES products(id) -- 外键关联商品表
);