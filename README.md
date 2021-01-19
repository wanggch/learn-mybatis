
## 01. learn-mybatis-helloworld

### 准备数据

**表结构：**

```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `id` varchar(128) NOT NULL COMMENT '主键，编码',
  `pid` varchar(128) NOT NULL COMMENT '父节点ID',
  `code` varchar(128) NOT NULL COMMENT '编码',
  `name` varchar(128) NOT NULL COMMENT '名称',
  `remark` varchar(128) NOT NULL COMMENT '备注',
  `leaf` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否是叶子节点，0 - 否；1 - 是',
  `status` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态：0 - 不可用；1 - 可用',
  `order_no` int(4) NOT NULL DEFAULT 9999 COMMENT '显示顺序，值越大，显示越靠后',
  `create_time` timestamp NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='字典';

SET FOREIGN_KEY_CHECKS = 1;
```

**测试数据：**

```sql
insert into dict(id, pid, code, name, remark, leaf, status, order_no, create_time) 
values('1', '0', 'A01', '测试节点', 'test', 1, 1, 9999, '2021-01-18 19:25:39');
```

### 实体类

> jenny.learn.mybatis.simple.entity.Dict

### Dao类

> jenny.learn.mybatis.simple.dao.DictDao

### Mybatis映射文件

> mappers/DictMapper.xml

### Mybatis配置文件

> mybatis-config.xml

### 项目启动类

> jenny.learn.mybatis.Hello