package demo.gj.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.domain.Persistable;
import sun.tools.jconsole.ProxyClient.SnapshotMBeanServerConnection;

/**
 * 订单表
 */
@Data
@ToString
@Entity
@Table(name = "t_order")
@TableName(value = "t_order", autoResultMap = true)
public class OrderDO implements Persistable<Long> {

  @Id
  @Column(name = "id")
  @TableField("id")
  private Long id;

  /**
   * 订单id
   */
  @Column(name = "order_id")
  @TableField("order_id")
  private Long orderId;

  /**
   * 用户id
   */
  @Column(name = "user_id")
  @TableField("user_id")
  private Long userId;

  @Override
  public boolean isNew() {
    return true;
  }
}
