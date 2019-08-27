package com.mmall.dao;

import com.mmall.pojo.Order;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByUserIdAndOrderNo(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "OrderNo") Long OrderNo);
}