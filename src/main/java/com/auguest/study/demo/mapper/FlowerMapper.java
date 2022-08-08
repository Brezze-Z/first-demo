package com.auguest.study.demo.mapper;

import com.auguest.study.demo.dao.Flower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface FlowerMapper {

    Flower getFlowerById(@Param(value = "id") int id);
    // 1111111




}
