package pl.camp.it.rest.model;

import java.util.ArrayList;
import java.util.List;
import pl.camp.it.rest.model.OrderDTO;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdersDTO  {
  
  @ApiModelProperty(value = "")
  private List<OrderDTO> orders = null;
 /**
   * Get orders
   * @return orders
  **/
  @JsonProperty("orders")
  public List<OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  public OrdersDTO orders(List<OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public OrdersDTO addOrdersItem(OrderDTO ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersDTO {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

