package com.examples.javapoet;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;

public class JavaPoet {

    public static void main(String[] args) throws IOException {

        // Generating simple JAVA class
        var sampleClass = TypeSpec.classBuilder("SampleClass")
                .addModifiers(Modifier.PUBLIC)
                .build();

        JavaFile javaFile = JavaFile.builder("com.example", sampleClass).build();

        javaFile.writeTo(System.out);
    }
}
