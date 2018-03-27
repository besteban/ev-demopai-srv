package com.ev.srv.demopai.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demopai.model.IntTransferBankCheckMovement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ContentIntTransferBankCheckMovement
 */

@Data
@Builder
public class ContentIntTransferBankCheckMovement  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("params")

  @ApiModelProperty(value = "")
  private Map<String, String> params = null;
  
  @JsonProperty("codigoEntidad")
  private String codigoEntidad;
  
  @JsonProperty("usuarioBE")
  private String usuarioBE;
  
  @JsonProperty("acuerdoBE")
  private String acuerdoBE;
  
  @JsonProperty("subacuerdo")
  private String subacuerdo;
  
  @JsonProperty("evoMovement")
  private IntTransferBankCheckMovement evoMovement;
  
}

