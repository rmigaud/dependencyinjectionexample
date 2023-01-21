package com.dependencyinjectionexample.looselycoupled;

import com.dependencyinjectionexample.RandomAccessMemory;

public class RandomAccessMemoryFactory extends RandomAccessMemory {
    public RandomAccessMemory getRAM(String ddr3600) {
        return new RandomAccessMemory();
    }
}
