package com.kun.test;

/**
 * 测试导入import
 */
import com.kun.oop.Car;
import java.util.*; //导入该包下所有的类。会降低编译速度，但不会降低运行速度。
import static java.lang.Math.*; //导入Math类的所有静态属性
import static java.lang.Math.PI;    //导入Math类的PI属性

public class TestImport {

    public static void main(String[] args) {
        //com.kun.oop.Car car = new com.kun.oop.Car();
        Car c1 = new Car();
        Car c2 = new Car();

        System.out.println(PI);
        System.out.println(random());
    }
}
