package com.dependencyinjectionexample.spring;

import com.dependencyinjectionexample.*;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringComputer {
    @Autowired
    CentralProcessingUnit cpu;

    @Autowired
    Motherboard mb;

    @Autowired
    ComputerCase computer;

    @Autowired
    RandomAccessMemory ram;

    @Autowired
    PowerSupply psu;


    public ComputerCase createComputer() {
        mb.add(cpu);
        mb.add(ram);
        psu.powerUp(mb);

        return computer.add(mb);
    }
}
