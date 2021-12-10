package com.training.springappInventory.web.controllers;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springappInventory.business.services.IProductManager;
import com.training.springappInventory.business.services.AddProduct;

@Controller
public class AddProductFormController {
	
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private IProductManager productManager;
    
    @RequestMapping(value="/addproduct.htm", method = RequestMethod.POST)
    public String onSubmit(@Valid AddProduct addProduct, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addproduct";
        }

        String name = addProduct.getNameProduct();
        double price = addProduct.getPriceProduct();
        logger.info("se registro con nombre " + name );

        productManager.addProduct(name, price);

        return "redirect:/hello.htm";
    }
    

}
