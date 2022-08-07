package com.auguest.study.demo.service;

import com.auguest.study.demo.dao.Flower;
import org.apache.ibatis.annotations.Param;

public interface FlowerService {

    public Flower getFlowerById(int id);

}
