package com.dependencyinjectionexample.looselycoupled;

import com.dependencyinjectionexample.Motherboard;

public class MotherboardFactory extends Motherboard {
    public Motherboard getMotherboard(String x570) {
        return new Motherboard();
    }
}
