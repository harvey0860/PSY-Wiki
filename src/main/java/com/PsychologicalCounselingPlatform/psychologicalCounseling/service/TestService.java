package com.PsychologicalCounselingPlatform.psychologicalCounseling.service;

import com.PsychologicalCounselingPlatform.psychologicalCounseling.domain.Test;
import com.PsychologicalCounselingPlatform.psychologicalCounseling.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {

        return testMapper.list();
    }
}