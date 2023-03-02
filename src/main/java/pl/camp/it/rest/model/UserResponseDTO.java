package pl.camp.it.rest.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponseDTO  {
  
  @ApiModelProperty(value = "")
  private Integer id = null;

  @ApiModelProperty(value = "")
  private String login = null;

  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private String orders = null;


@XmlType(name="RoleEnum")
@XmlEnum(String.class)
public enum RoleEnum {

@XmlEnumValue("ADMIN") ADMIN(String.valueOf("ADMIN")), @XmlEnumValue("USER") USER(String.valueOf("USER"));


    private String value;

    RoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RoleEnum fromValue(String v) {
        for (RoleEnum b : RoleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private RoleEnum role = null;

  @ApiModelProperty(value = "")
  private String surname = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserResponseDTO id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Get login
   * @return login
  **/
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public UserResponseDTO login(String login) {
    this.login = login;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserResponseDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get orders
   * @return orders
  **/
  @JsonProperty("orders")
  public String getOrders() {
    return orders;
  }

  public void setOrders(String orders) {
    this.orders = orders;
  }

  public UserResponseDTO orders(String orders) {
    this.orders = orders;
    return this;
  }

 /**
   * Get role
   * @return role
  **/
  @JsonProperty("role")
  public String getRole() {
    if (role == null) {
      return null;
    }
    return role.value();
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public UserResponseDTO role(RoleEnum role) {
    this.role = role;
    return this;
  }

 /**
   * Get surname
   * @return surname
  **/
  @JsonProperty("surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public UserResponseDTO surname(String surname) {
    this.surname = surname;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

