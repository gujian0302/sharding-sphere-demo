package demo.gj.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

  @Autowired
  private OrderService orderService;

  @Test
  void save() {
    orderService.save(0l, 1l, 1l);
  }
}