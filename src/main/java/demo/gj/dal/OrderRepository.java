package demo.gj.dal;

import demo.gj.model.OrderDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDO, Long> {

}
