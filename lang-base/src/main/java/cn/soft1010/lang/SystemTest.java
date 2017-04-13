package cn.soft1010.lang;

import java.util.Map;
import java.util.Properties;

/**
 * Created by zhangjifu on 2017/4/13.
 */
public class SystemTest {

    public static void main(String[] args) {

        new SystemTest().test();
    }

    public void test() {
        System.err.println(true);

        System.out.println("================= system.arraycopy() =====================");
        SystemConfig[] systemConfigs = new SystemConfig[3];
        for (int i = 0; i < systemConfigs.length; i++) {
            SystemConfig systemConfig = new SystemConfig();
            systemConfig.setName("name+" + i);
            systemConfig.setValue("value+" + i);
            systemConfigs[i] = systemConfig;
        }
        SystemConfig[] systemconfig2 = new SystemConfig[3];
        // system.arraycopy()
        System.arraycopy(systemConfigs, 0, systemconfig2, 0, 3);
        for (SystemConfig systemConfig : systemconfig2) {
            System.out.println(systemConfig.getName() + " =" + systemConfig.getValue());
            if (systemConfig.getName().equalsIgnoreCase("name+2")) {
                systemConfig.setValue("value changed");
            }
        }

        // copy对象时，copy前后的对象还是一份，一改全改
        for (SystemConfig systemConfig : systemConfigs) {
            System.out.println(systemConfig.getName() + "=" + systemConfig.getValue());
        }

        System.out.println("================== system set get property ===================");

        System.setProperty("name", "value");
        System.out.println(System.getProperty("name"));
        System.out.println(System.getProperty("name1", "value2"));

        Properties properties = System.getProperties();
        for (Object obj : properties.keySet()
                ) {
            System.out.println(obj + "=" + properties.get(obj));

        }

        System.out.println("============== system env ================");
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            System.out.println(key + "=" + env.get(key));
        }

        System.out.println("=======================================");


    }

    class SystemConfig {
        String name;
        String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
