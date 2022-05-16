package com.vsu.unit_test_generator;


import com.vsu.unit_test_generator.data.TestEntity;
import com.vsu.unit_test_generator.util.ASTAnalyzeUtil;
import com.vsu.unit_test_generator.util.FileManager;

import java.util.List;

public class ASTGenerator {
    private String classPath;
    private String testDirectoryPath;
    private ASTAnalyzeUtil analyzerUtil;
//    private ASTGenerateUtil generateUtil;
    private FileManager fileManager;

    public ASTGenerator() {
//
        fileManager = new FileManager();
    }


    private List<TestEntity> getNotGeneratedTests(String classPath){

    }

    public void generateUnitTest(String classPath, String testDirectoryPath) {
//        fileManage
        this.classPath = classPath;
        this.testDirectoryPath = testDirectoryPath;
    }

    public void generateUnitTest(String classPath) {
        this.classPath = classPath;

    }
}
