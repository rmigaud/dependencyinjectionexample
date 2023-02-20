package com.dependencyinjectionexample.payments.services;

import com.dependencyinjectionexample.payments.dao.PaymentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
  @Autowired
  private PaymentDAO dao;

  private PaymentDAO getDao() {
    return dao;
  }

  private void setDao(PaymentDAO dao) {
    this.dao = dao;
  }

}
