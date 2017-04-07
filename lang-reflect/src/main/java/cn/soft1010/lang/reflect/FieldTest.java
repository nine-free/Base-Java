package cn.soft1010.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * Created by zhangjifu on 2017/4/6.
 */
public class FieldTest {

    public static void main(String[] args) throws IllegalAccessException {

        FieldA fieldA = new FieldA("zhang", 12, (byte) 1);
        //声明的字段 包含私有
        Field[] fields = fieldA.getClass().getDeclaredFields();
        //私有访问 不能获取到
        Field[] fields1 = fieldA.getClass().getFields();

        for (Field field : fields
                ) {
            // 需要设置可访问才能获取 / 设置值
            field.setAccessible(true);
            Object o = field.get(fieldA);
            System.out.println(field.getType().toString() + " : " + o.toString());
        }

        Class clazz = fields[0].getDeclaringClass();
        System.out.println(clazz);

        Type type = fields[0].getGenericType();
        System.out.println(type);

        int modifier = fields[0].getModifiers();
        System.out.println(modifier);

        String name = fields[0].getName();
        System.out.println(name);

        fields[0].set(fieldA, "yang");
        System.out.println(fields[0].get(fieldA));



    }
}