package demo.gj.dal;

import demo.gj.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface OrderRepository extends com.baomidou.mybatisplus.core.mapper.Mapper<OrderDO> {

}
