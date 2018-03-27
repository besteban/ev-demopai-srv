package com.ev.srv.demopai.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.demopai.model.SupraCategories;
import com.ev.srv.demopai.service.SupracategoriesService;

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
public class SupracategoriesController {

	@Autowired
    private SupracategoriesService service;

	@ApiOperation(value = "List all supra categories associated with a movement", nickname = "getListOfAllSupraCategories", notes = "", response = SupraCategories.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SupraCategories.class, responseContainer = "List") })
    @RequestMapping(value = "/supracategories/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<SupraCategories>> getListOfAllSupraCategories() throws ApiException{
        return new ResponseEntity<List<SupraCategories>>(service.getListOfAllSupraCategories(), HttpStatus.NOT_IMPLEMENTED);
    }

}
