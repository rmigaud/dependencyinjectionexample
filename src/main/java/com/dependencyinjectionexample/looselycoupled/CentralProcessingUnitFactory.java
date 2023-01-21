package com.dependencyinjectionexample.looselycoupled;

import com.dependencyinjectionexample.CentralProcessingUnit;

public class CentralProcessingUnitFactory extends CentralProcessingUnit {

    public CentralProcessingUnit getCPU (String cpu) {
        if (cpu.equals("amd5800x")) return new CPUImplAmd5800x();
        return new CentralProcessingUnit();
    }

}
