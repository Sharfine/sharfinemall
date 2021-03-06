package com.sharfine.fmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sharfine.common.utils.PageUtils;
import com.sharfine.fmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author sharfine
 * @email sharfine@gmail.com
 * @date 2021-01-21 11:23:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    Long[] findCategoryPath(Long catelogId);

    void updateCascade(CategoryEntity category);
}

