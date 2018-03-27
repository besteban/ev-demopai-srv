package com.ev.srv.demopai.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demopai.model.ContentGeneralProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * RequestWrapperGeneralProperties
 */

@Data
@Builder
public class RequestWrapperGeneralProperties  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ContentGeneralProperties content;
  
}

