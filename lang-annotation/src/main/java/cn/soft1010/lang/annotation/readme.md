

#####1、元注解

###### @Documented
Documented 注解表明这个注解应该被 javadoc工具记录

###### @Retention
Retention(保留)注解说明,这种类型的注解会被保留到那个阶段. 有三个值:
```
1.RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
2.RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
3.RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,
所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.
```

###### @Inherited
子类继承父类的注解

###### @Target
```
@Target说明了Annotation所修饰的对象范围：
Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、
类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。
在Annotation类型的声明中使用了target可更加明晰其修饰的目标。

```


##### 运用

###### 类注解
```
    ClassA classA = new ClassA();
    ClassAnnotation classAnnotation = classA.getClass().getAnnotation(ClassAnnotation.class);
```

###### 方法注解
```
  Method[] methods = classA.getClass().getMethods();
        for (Method me : methods
                ) {
            MethodAnnotation1 methodAnno1 = me.getAnnotation(MethodAnnotation1.class);
            if (methodAnno1 != null) {
                System.out.println("method:" + me.getName() + " | annotation:" + methodAnno1.annotationType().getName());
            }
            MethodAnnotation2 methodAnno2 = me.getAnnotation(MethodAnnotation2.class);
            if (methodAnno2 != null) {
                System.out.println("method:" + me.getName() + " | name:" + methodAnno2.name() +
                        " | annotation:" + methodAnno2.annotationType().getName());
            }
        }
```

###### 字段注解
```
  Field[] fields = classA.getClass().getFields();
        for (Field field : fields
                ) {
            FieldAnnotation fieldAnno = field.getAnnotation(FieldAnnotation.class);
            System.out.println(field.getName() + " | annotation" + fieldAnno.annotationType().getName());
        }

        Field[] fields2 = classA.getClass().getDeclaredFields();
        for (Field field : fields2
                ) {
            FieldAnnotation fieldAnno = field.getAnnotation(FieldAnnotation.class);
            System.out.println(field.getName() + " | annotation" + fieldAnno.annotationType().getName());
        }

```

###### 参数注解

```
Method[] methods2 = classA.getClass().getDeclaredMethods();
        for (Method me : methods2
                ) {
            Annotation[][] parameterAnnotations = me.getParameterAnnotations();
            for (Annotation[] annotations : parameterAnnotations) {
                for (Annotation annotation : annotations
                        ) {
                    if (annotation instanceof ParamAnnotation) {
                        ParamAnnotation anno = (ParamAnnotation) annotation;
                        System.out.println("method:" + me.getName() + " | anno:" + anno.annotationType().getName());
                    }
                }
            }
        }
```
