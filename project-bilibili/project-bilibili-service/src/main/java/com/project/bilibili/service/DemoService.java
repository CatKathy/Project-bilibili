package com.project.bilibili.service;

import com.project.bilibili.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;

    public DemoService() {
    }

    public Long query(Long id) {
        return this.demoDao.query(id);
    }
}
