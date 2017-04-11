
##### 引用分为：  强引用、软引用、弱引用、虚引用

###### 强引用

只要某个对象有强引用与之关联，JVM必定不会回收这个对象，即使在内存不足的情况下，JVM宁愿抛出OutOfMemory错误也不会回收这种对象
```
public class Main {
    public static void main(String[] args) {
        new Main().fun1();
    }

    public void fun1() {
        Object object = new Object();
        Object[] objArr = new Object[1000];
    }
}
```

###### 软引用
只有在内存不足的时候JVM才会回收该对象
```
public class Main {
    public static void main(String[] args) {

        WeakReference<String> sr = new WeakReference<String>(new String("hello"));

        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
    }
}
```

###### 弱引用
当JVM进行垃圾回收时，无论内存是否充足，都会回收被弱引用关联的对象
```
public class Main {
    public static void main(String[] args) {

        WeakReference<String> sr = new WeakReference<String>(new String("hello"));

        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
    }
}
``
###### 虚引用
跟没有引用与之关联一样，在任何时候都可能被垃圾回收器回收


```

```






