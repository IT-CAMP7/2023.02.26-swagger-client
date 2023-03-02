package pl.camp.it.rest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pl.camp.it.rest.model.OrderPosition;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveOrderRequest  {
  
  @ApiModelProperty(value = "")
  private Date date = null;

  @ApiModelProperty(value = "")
  private List<OrderPosition> orderPositions = null;


@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

@XmlEnumValue("NEW") NEW(String.valueOf("NEW")), @XmlEnumValue("PAID") PAID(String.valueOf("PAID")), @XmlEnumValue("CONFIRMED") CONFIRMED(String.valueOf("CONFIRMED")), @XmlEnumValue("SENT") SENT(String.valueOf("SENT")), @XmlEnumValue("DONE") DONE(String.valueOf("DONE"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum b : StateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private StateEnum state = null;

  @ApiModelProperty(value = "")
  private Integer userId = null;
 /**
   * Get date
   * @return date
  **/
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public SaveOrderRequest date(Date date) {
    this.date = date;
    return this;
  }

 /**
   * Get orderPositions
   * @return orderPositions
  **/
  @JsonProperty("orderPositions")
  public List<OrderPosition> getOrderPositions() {
    return orderPositions;
  }

  public void setOrderPositions(List<OrderPosition> orderPositions) {
    this.orderPositions = orderPositions;
  }

  public SaveOrderRequest orderPositions(List<OrderPosition> orderPositions) {
    this.orderPositions = orderPositions;
    return this;
  }

  public SaveOrderRequest addOrderPositionsItem(OrderPosition orderPositionsItem) {
    this.orderPositions.add(orderPositionsItem);
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    if (state == null) {
      return null;
    }
    return state.value();
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SaveOrderRequest state(StateEnum state) {
    this.state = state;
    return this;
  }

 /**
   * Get userId
   * @return userId
  **/
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public SaveOrderRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOrderRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    orderPositions: ").append(toIndentedString(orderPositions)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

