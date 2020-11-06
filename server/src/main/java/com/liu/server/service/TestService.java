package com.liu.server.service;

import com.liu.server.mapper.TestMapper;
import com.liu.server.pojo.Test;
import com.liu.server.pojo.TestExample;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
       /* TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        testExample.setOrderByClause("id desc");
        return  testMapper.selectByExample(testExample);*/
        return testMapper.selectByExample(null);
    }
}
