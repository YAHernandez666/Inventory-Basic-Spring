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
import com.training.springappInventory.business.services.PriceIncrease;
import com.training.springappInventory.business.services.AddProduct;

@Controller
@RequestMapping(value="/addproduct.htm")
public class AddProductFormController {
	
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private IProductManager productManager;
    
    @RequestMapping(method = RequestMethod.POST )
    public String onSubmit(@Valid AddProduct addProduct, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addproduct";
        }

        String name = addProduct.getNameProduct();
        Double price = addProduct.getPriceProduct();
        logger.info("se registro con nombre " + name );

        productManager.addProduct(name, price);

        return "redirect:/hello.htm";
    }
    
   @RequestMapping(method = RequestMethod.GET)
    protected AddProduct formBackingObject() {
        AddProduct addProduct = new AddProduct();
        return addProduct;
    }
    

}
