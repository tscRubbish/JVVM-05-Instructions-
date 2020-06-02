package com.njuse.seecjvm.instructions.comparison;

import com.njuse.seecjvm.instructions.base.NoOperandsInstruction;
import com.njuse.seecjvm.runtime.StackFrame;

public class DCMPL extends NoOperandsInstruction {

    /**
     * TODO：实现这条指令
     */
    @Override
    public void execute(StackFrame frame) {
        double d2=frame.getOperandStack().popDouble();
        double d1=frame.getOperandStack().popDouble();
        if (!Double.isNaN(d1)&&!Double.isNaN(d2)){
            frame.getOperandStack().pushInt(Double.compare(d1,d2));
        }else{
            frame.getOperandStack().pushInt(-1);
        }
    }
}
