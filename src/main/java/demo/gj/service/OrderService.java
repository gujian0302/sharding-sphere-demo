package demo.gj.service;

import demo.gj.dal.OrderRepository;
import demo.gj.model.OrderDO;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  @Transactional
  public void save(Long id, Long orderId, Long userId){
    OrderDO order = new OrderDO();
    order.setId(id);
    order.setOrderId(orderId);
    order.setUserId(userId);
    orderRepository.insert(order);
  }

}
