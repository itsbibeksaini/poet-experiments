package com.examples.kotlinpoet

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec

fun main(args: Array<String>){

    val sampleClass = TypeSpec
                        .classBuilder("TestClass")
                        .primaryConstructor(
                            FunSpec
                                .constructorBuilder()
                                .addParameter("test", String::class)
                                .build()
                        )
                        .build()
    val kotlinFile: FileSpec = FileSpec.builder("com.example.testpackage", "TestClass").addType(sampleClass).build()

    kotlinFile.writeTo(System.out)
}