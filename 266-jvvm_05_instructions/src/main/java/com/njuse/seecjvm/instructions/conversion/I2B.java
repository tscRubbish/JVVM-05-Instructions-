package com.njuse.seecjvm.instructions.conversion;

import com.njuse.seecjvm.instructions.base.NoOperandsInstruction;
import com.njuse.seecjvm.runtime.StackFrame;
import com.njuse.seecjvm.runtime.struct.Slot;

public class I2B extends NoOperandsInstruction {

    /**
     * TODO：（加分项）实现这条指令
     * 这是一条可选测试用例才会涉及的指令
     */
    @Override
    public void execute(StackFrame frame) {
        int i=frame.getOperandStack().popInt();
        int s=(byte)i;
        Slot slot=new Slot();slot.setValue(s);
        frame.getOperandStack().pushSlot(slot);
    }
}
