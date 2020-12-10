package com.xds.mongodb.dao;

import com.xds.mongodb.entity.DemoEntity;

public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
