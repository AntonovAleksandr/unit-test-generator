package com.vsu.unit_test_generator.util;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.Log;
import com.github.javaparser.utils.SourceRoot;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ASTTreeManager {
    private CompilationUnit cu;

    public List<ClassOrInterfaceDeclaration> getClasses(Node node) {
        List<ClassOrInterfaceDeclaration> classes = new ArrayList<>();
        for (Node element : node.getChildNodes()) {
            if (element.getClass() == ClassOrInterfaceDeclaration.class && !((ClassOrInterfaceDeclaration) element).isInterface()) {
                classes.add((ClassOrInterfaceDeclaration) element);
            }
            if (element.getClass() == ClassOrInterfaceDeclaration.class || element.getClass() == MethodDeclaration.class) {
                classes.addAll(getClasses(element));
            }
        }
        return classes;
    }

    public ASTTreeManager(CompilationUnit cu) {
        Log.setAdapter(new Log.StandardOutStandardErrorAdapter());
    }

    public List<ClassOrInterfaceDeclaration> getClasses(String path, String fileName){
        SourceRoot sourceRoot = new SourceRoot(Paths.get(path));
        cu = sourceRoot.parse("", fileName);
        return getClasses(cu);
    }




}
