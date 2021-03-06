package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserIdProductId(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "productIdList") List<String> productIdList);

    int checkedOrUncheckedProduct(@RequestParam(value = "userId")Integer userId, @RequestParam(value = "productId")Integer productId, @RequestParam(value = "checked")Integer checked);

    int selectCartProductCount(@RequestParam(value = "userId")Integer userId);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}