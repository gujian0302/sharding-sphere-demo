package demo.gj.dal;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.gj.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderRepository extends BaseMapper<OrderDO> {

}
