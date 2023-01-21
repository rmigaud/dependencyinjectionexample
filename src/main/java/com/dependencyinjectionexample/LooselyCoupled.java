package com.dependencyinjectionexample;

import com.dependencyinjectionexample.looselycoupled.*;

public class LooselyCoupled {


    public ComputerCase buildComputer() {
        Motherboard x570Motherboard = new MotherboardFactory().getMotherboard("x570");
        CentralProcessingUnit amd5800x = new CentralProcessingUnitFactory().getCPU("amd5800x");
        RandomAccessMemory ddr3600 = new RandomAccessMemoryFactory().getRAM("ddr3600");
        PowerSupply psu = new PowerSupplyFactory();
        x570Motherboard.add(amd5800x);
        x570Motherboard.add(ddr3600);
        ComputerCase computer = new ComputerCaseFactory();
        psu.powerUp(x570Motherboard);

        return computer;
    }
}
