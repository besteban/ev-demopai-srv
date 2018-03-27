package com.ev.srv.demopai.service.impl;

import com.ev.srv.demopai.service.CategoriesService;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.demopai.model.Categories;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * A delegate to be called by the {@link CategoriesController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

@Service
@Slf4j
public class CategoriesServiceImpl implements CategoriesService{

    @Override
    public List<Categories> getListOfAllCategories(String tipo) throws ApiException{
        
        // TODO Auto-generated method stub
        return null;
     }

}
