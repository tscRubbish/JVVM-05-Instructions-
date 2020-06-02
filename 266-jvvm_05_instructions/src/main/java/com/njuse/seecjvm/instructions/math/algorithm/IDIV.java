package com.njuse.seecjvm.instructions.math.algorithm;

import com.njuse.seecjvm.instructions.base.NoOperandsInstruction;
import com.njuse.seecjvm.runtime.StackFrame;

public class IDIV extends NoOperandsInstruction {

    /**
     * TODO：实现这条指令
     */
    @Override
    public void execute(StackFrame frame) {
        int i2=frame.getOperandStack().popInt();
        int i1=frame.getOperandStack().popInt();
        frame.getOperandStack().pushInt(i1/i2);
    }
}
