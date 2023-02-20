package com.dependencyinjectionexample;

import com.dependencyinjectionexample.payments.services.PaymentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PaymentsTest {

  @Autowired
  PaymentServiceImpl paymentService;

  @Test
  void testPaymentDependencyInjection() {
    assertThat(paymentService).isNotNull();
  }
}
