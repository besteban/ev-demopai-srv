package com.ev.srv.demopai.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demopai.model.ContentListString;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * RequestWrapperListString
 */

@Data
@Builder
public class RequestWrapperListString  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ContentListString content;
  
}

