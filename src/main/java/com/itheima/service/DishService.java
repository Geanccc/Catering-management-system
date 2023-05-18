package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.entity.Dish;
import com.itheima.dto.DishDto;

public interface DishService extends IService<Dish> {
     //新增菜品保存
     public void savaWithFlavor(DishDto dishDto);

     //菜品回显
     public DishDto getByIdWithFlavor(Long id);

     //修改菜品
     public void updateWithFlavor(DishDto dishDto);
}
