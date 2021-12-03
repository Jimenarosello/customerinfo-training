package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutListBehavioralEvaluationsRiskSegmentGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlType(name = "dtoOutListBehavioralEvaluationsRiskSegmentGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutListBehavioralEvaluationsRiskSegmentGet implements Serializable {

  public static final long serialVersionUID = 3277088120244000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
