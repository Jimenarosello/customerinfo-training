package com.bbva.uuaa.customersv0.facade.v0.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutListCustomersGet", namespace = "com:bbva:uuaa:customersv0:facade:v0:dto")
@XmlType(name = "dtoOutListCustomersGet", namespace = "com:bbva:uuaa:customersv0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutListCustomersGet implements Serializable {

  public static final long serialVersionUID = 3277088120272000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  @NotNull
  @JsonProperty("dni")
  private Long dni;

  @NotNull
  @JsonProperty("name")
  private String name;

  @NotNull
  @JsonProperty("lastName")
  private String lastName;

  @NotNull
  @JsonProperty("dateOfBirth")
  private Date dateOfBirth;

  @NotNull
  @JsonProperty("accountNumber")
  private String accountNumber;

  @NotNull
  @JsonProperty("cards")
  private List<DtoOutListCardsGet> cards;

}
