package com.sharfine.fmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sharfine.common.utils.PageUtils;
import com.sharfine.fmall.product.entity.AttrAttrgroupRelationEntity;
import com.sharfine.fmall.product.vo.AttrGroupRelationVo;
import com.sharfine.fmall.product.vo.AttrRespVo;

import java.util.List;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author sharfine
 * @email sharfine@gmail.com
 * @date 2021-01-21 11:23:41
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void deleteRelation(AttrGroupRelationVo[] relationVos);

    void setRelation(List<AttrRespVo> attrRespVo);
}

