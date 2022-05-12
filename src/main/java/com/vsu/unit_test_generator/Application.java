package com.vsu.unit_test_generator;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        String fileName = "test";
        String classPath ="C://Users/zzzz1/IdeaProjects/javaparser-maven-sample/src/main/resources/Sample.java";
        String path = "C://Users/zzzz1/IdeaProjects/javaparser-maven-sample/src/test/java/" + fileName;
        UnitTestGenerator unitTestGenerator = new UnitTestGenerator();
        unitTestGenerator.generateUnitTest(classPath);
    }

}
