package de.zake.freeaspects.basicservices;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Loading Beans if needed. Please dont declare Beans as object attributes. 
 * Microservices dont have a db tier. Maybe just your usecase needs one.
 * 
 * @author zake
 */
@Component
public class Springloader {


    protected ApplicationContext context;
    
    protected Object load(String beanname) {
        return null;
    }
    
    protected Object load(Class cls) {
        return null;
    }

    
}
