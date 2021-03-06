package com.ev.srv.demopai.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.demopai.model.RequestWrapperListString;
import com.ev.srv.demopai.service.DecodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.evo.api.springboot.exception.ApiException;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class DecodeController {

	@Autowired
    private DecodeService service;

	@ApiOperation(value = "Codify the data.", nickname = "decode", notes = "", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Failure") })
    @RequestMapping(value = "/decode",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<List<String>> decode(@ApiParam(value = "Json representing the texts to encode" ,required=true )  @RequestBody RequestWrapperListString body) throws ApiException{
        return new ResponseEntity<List<String>>(service.decode(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
