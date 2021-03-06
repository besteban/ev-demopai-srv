package com.ev.srv.demopai.service;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.demopai.model.RequestWrapperPosition;
import com.evo.api.springboot.exception.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link InitializationController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface InitializationService {


 	/**
 	 * Codify the data.
 	 * 
     * @return
     */
    String initialize(RequestWrapperPosition body)  throws ApiException;    
}
