package cn.soft1010.lang.reflect;

/**
 * Created by zhangjifu on 2017/4/7.
 */
public class ConstructorA {

    public ConstructorA() {
    }

    public ConstructorA(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
