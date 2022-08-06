package com.examples.kotlinpoet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName

/**
 * Sample kotlin poet to generate kotlin class file.
 */
fun main(args: Array<String>) {
    val sampleClass = TypeSpec
        .classBuilder("TestClass")
        .primaryConstructor(
            FunSpec
                .constructorBuilder()
                .addParameter("test", String::class)
                .build()
        )
        .addTypeVariable(TypeVariableName.Companion.invoke("var1", String::class))
        .addFunction(FunSpec.builder("testFun").addStatement("return \"test func\"").returns(String::class).build())
        .build()
    val kotlinFile: FileSpec = FileSpec.builder("com.example.testpackage", "TestClass").addType(sampleClass).build()

    kotlinFile.writeTo(System.out)
}