package com.ev.srv.demopai.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.demopai.model.PaymentModel;
import java.util.List;


/**
 * PaymentMovement
 */

@Data
@Builder
public class PaymentMovement extends PaymentModel implements Serializable {
  private static final long serialVersionUID = 1L;

}

