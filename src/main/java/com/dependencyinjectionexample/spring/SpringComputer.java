package com.dependencyinjectionexample.spring;

import com.dependencyinjectionexample.CentralProcessingUnit;
import com.dependencyinjectionexample.ComputerCase;
import com.dependencyinjectionexample.Motherboard;
import com.dependencyinjectionexample.PowerSupply;
import com.dependencyinjectionexample.RandomAccessMemory;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unused")
public class SpringComputer {
  private final CentralProcessingUnit cpu;
  private final Motherboard mb;
  private final ComputerCase computer;
  private final RandomAccessMemory ram;
  private final PowerSupply psu;

  @Autowired
  public SpringComputer(CentralProcessingUnit cpu, Motherboard mb,
                        ComputerCase computer, RandomAccessMemory ram,
                        PowerSupply psu) {
    this.cpu = cpu;
    this.mb = mb;
    this.computer = computer;
    this.ram = ram;
    this.psu = psu;
  }


  /**
   * createComputer returns a computer case with all its components
   *
   * @return computer.add(mb)
   */
  public ComputerCase createComputer() {
    mb.add(cpu);
    mb.add(ram);
    psu.powerUp(mb);

    return computer.add(mb);
  }
}
