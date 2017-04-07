package cn.soft1010.lang.reflect;

/**
 * Created by zhangjifu on 2017/4/6.
 */
public class FieldA {

    private String name;

    private Integer age;

    private byte sex;

    public FieldA() {
    }

    public FieldA(String name, Integer age, byte sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
