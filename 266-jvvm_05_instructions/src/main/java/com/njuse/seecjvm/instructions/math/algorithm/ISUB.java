package com.njuse.seecjvm.instructions.math.algorithm;

import com.njuse.seecjvm.instructions.base.NoOperandsInstruction;
import com.njuse.seecjvm.runtime.StackFrame;

public class ISUB extends NoOperandsInstruction {

    /**
     * TODO：实现这条指令
     */
    @Override
    public void execute(StackFrame frame) {
        int d2=frame.getOperandStack().popInt();
        int d1=frame.getOperandStack().popInt();
        frame.getOperandStack().pushInt(d1-d2);
    }
}
