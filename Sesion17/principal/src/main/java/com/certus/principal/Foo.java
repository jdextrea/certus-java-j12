/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.principal;
import com.certus.annotation.Builder;
import com.certus.annotation.Value;
import java.util.Optional;

/**
 *
 * @author jdextre
 */
@Builder
@Value
public class Foo {

    private String name;
    private Optional<String> color;

    public Foo() {
    }

    public Foo(String name, Optional<String> color) {
        this.name = name;
        this.color = color;
    }

    public void sayHello() throws InterruptedException {
        System.out.println("Hello, my name is " + name + " and my favorite color is " + color.orElse("black"));
    }
}