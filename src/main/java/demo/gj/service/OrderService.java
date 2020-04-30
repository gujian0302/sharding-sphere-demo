package demo.gj.service;

import demo.gj.dal.OrderRepository;
import demo.gj.model.OrderDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  @Transactional(isolation = Isolation.READ_COMMITTED)
  public void save(Long id, Long orderId, Long userId){
    OrderDO order = new OrderDO();
    order.setId(id);
    order.setOrderId(orderId);
    order.setUserId(userId);
    orderRepository.save(order);
  }

}
