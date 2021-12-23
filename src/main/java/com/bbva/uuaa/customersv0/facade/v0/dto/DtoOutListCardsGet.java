package com.bbva.uuaa.customersv0.facade.v0.dto;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutListCardsGet", namespace = "com:bbva:uuaa:customersv0:facade:v0:dto")
@XmlType(name = "dtoOutListCardsGet", namespace = "com:bbva:uuaa:customersv0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutListCardsGet implements Serializable {

  public static final long serialVersionUID = 3277088120204000000L;

  @NotNull
  @JsonProperty("type")
  private String type;

  @NotNull
  @JsonProperty("cardHolder")
  private String cardHolder;

  @NotNull
  @JsonProperty("cardNumber")
  private String cardNumber;

  @NotNull
  @JsonProperty("purchaseLimit")
  private Long purchaseLimit;

  @NotNull
  @JsonProperty("expirationDate")
  private Date expirationDate;

}
