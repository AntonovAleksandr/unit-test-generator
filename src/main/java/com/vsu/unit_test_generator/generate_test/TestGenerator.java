package com.vsu.unit_test_generator.generate_test;

import com.vsu.unit_test_generator.data.TestEntity;

import java.util.List;

public interface TestGenerator {
    StringBuilder generateTest(TestEntity testEntity);
    StringBuilder generateTest(List<TestEntity> testEntity);
}
