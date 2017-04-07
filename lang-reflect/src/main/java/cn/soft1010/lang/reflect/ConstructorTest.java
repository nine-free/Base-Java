package cn.soft1010.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Created by zhangjifu on 2017/4/7.
 */
public class ConstructorTest {

    public static void main(String[] args) {
        ConstructorA constructorA = new ConstructorA();

        Constructor[] constructorAs = constructorA.getClass().getConstructors();
        for (Constructor c :
                constructorAs) {
            System.out.println(c.getName());
            Parameter[] parameters = c.getParameters();
            for (Parameter pa :
                    parameters) {
                System.out.println(pa.getType() + " | " + pa.getName());
            }
        }
    }
}
