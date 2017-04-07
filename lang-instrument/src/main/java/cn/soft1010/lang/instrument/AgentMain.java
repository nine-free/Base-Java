package cn.soft1010.lang.instrument;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

/**
 * Created by zhangjifu on 2017/4/5.
 */
public class AgentMain {

    public static void main(String[] args) throws IOException, AgentLoadException, AgentInitializationException, AttachNotSupportedException {

        VirtualMachine vm = VirtualMachine.attach(args[0]);
        vm.loadAgent(args[1]);
    }
}
