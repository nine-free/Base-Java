package cn.soft1010.lang.instrument;

import java.lang.instrument.Instrumentation;

/**
 * Created by zhangjifu on 2017/4/5.
 */
public class TestAgent {

    @SuppressWarnings("rawtypes")
    public static void agentmain(String args, Instrumentation inst) {
        Class[] classes = inst.getAllLoadedClasses();
        for (Class cls : classes) {
            System.out.println(cls.getName());
        }
    }

}

