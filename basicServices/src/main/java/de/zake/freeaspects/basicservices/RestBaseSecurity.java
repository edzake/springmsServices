package de.zake.freeaspects.basicservices;

import org.springframework.stereotype.Component;

/**
 * 
 * @author zake
 */
@Component
public class RestBaseSecurity {
    
    public boolean validateRequest() {
        return false;
    }
}
