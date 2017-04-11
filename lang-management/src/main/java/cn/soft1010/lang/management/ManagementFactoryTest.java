package cn.soft1010.lang.management;

import java.lang.management.*;

/**
 * Created by zhangjifu on 2017/4/11.
 */
public class ManagementFactoryTest {


    public static void main(String[] args) {
        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        long loadedClassCount = classLoadingMXBean.getLoadedClassCount();
        long totalLoadedClassCount = classLoadingMXBean.getTotalLoadedClassCount();
        long unloadedClassCount = classLoadingMXBean.getUnloadedClassCount();
        System.out.println("loadedClassCount: " + loadedClassCount + " totalLoadedClassCount: " +
                totalLoadedClassCount + " unloadedClassCount: " + unloadedClassCount);


        CompilationMXBean compilationMXBean = ManagementFactory.getCompilationMXBean();
        long totalCompilationTime = compilationMXBean.getTotalCompilationTime();
        System.out.println(" totalCompilationTime: " + totalCompilationTime);

        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println(memoryMXBean.getHeapMemoryUsage().getUsed() / 1024);
        System.out.println(memoryMXBean.getHeapMemoryUsage().getMax()/1024);
        System.out.println(memoryMXBean.getHeapMemoryUsage().getInit()/1024);

    }
}
