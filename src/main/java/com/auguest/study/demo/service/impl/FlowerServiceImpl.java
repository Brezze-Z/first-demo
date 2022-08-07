package com.auguest.study.demo.service.impl;

import com.auguest.study.demo.dao.Flower;
import com.auguest.study.demo.mapper.FlowerMapper;
import com.auguest.study.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public Flower getFlowerById(int id) {
        return flowerMapper.getFlowerById(id);
    }


}
