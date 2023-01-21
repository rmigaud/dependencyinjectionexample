package com.dependencyinjectionexample;

public class TightlyCoupledExample {

    public ComputerCase buildComputer() {
        Motherboard x570Motherboard = new Motherboard();
        CentralProcessingUnit amd5800x = new CentralProcessingUnit();
        RandomAccessMemory ddr3600 = new RandomAccessMemory();
        PowerSupply psu = new PowerSupply();
        x570Motherboard.add(amd5800x);
        x570Motherboard.add(ddr3600);
        ComputerCase computer = new ComputerCase();
        psu.powerUp(x570Motherboard);

        return computer;
    }

}
