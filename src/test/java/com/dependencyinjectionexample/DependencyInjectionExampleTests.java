package com.dependencyinjectionexample;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.dependencyinjectionexample.spring.SpringComputer;

@SpringBootTest
class DependencyInjectionExampleTests {
  CentralProcessingUnit cpu;
  Motherboard mb;
  ComputerCase computer;
  RandomAccessMemory ram;
  PowerSupply psu;

  @Autowired
  SpringComputer setComputer() {
    return new SpringComputer(cpu, mb, computer, ram, psu);
  }

  @Test
  void contextLoads() {
    assertThat(setComputer()).isNotNull();
  }
}
