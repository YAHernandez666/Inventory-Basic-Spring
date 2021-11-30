package com.training.springappInventory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.training.springappInventory.business.SpringappBusinessConfig;
import com.training.springappInventory.web.SpringappWebConfig;


public class SpringappWebApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { SpringappBusinessConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { SpringappWebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
