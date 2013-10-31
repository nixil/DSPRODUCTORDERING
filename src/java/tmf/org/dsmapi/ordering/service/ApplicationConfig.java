/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tmf.org.dsmapi.ordering.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author pierregauthier
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(ProductOrderFacadeREST.class);
        resources.add(AdminFacadeREST.class);
        resources.add(JacksonConfigurator.class);
        // following code can be used to customize Jersey 1.x JSON provider:
        try {
            Class jacksonProvider = Class.forName("org.codehaus.jackson.jaxrs.JacksonJsonProvider");
            resources.add(jacksonProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically re-generated by NetBeans REST support to populate
     * given list with all resources defined in the project.
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(tmf.org.dsmapi.hub.service.HubFacadeREST.class);
        resources.add(tmf.org.dsmapi.ordering.service.AdminFacadeREST.class);
        resources.add(tmf.org.dsmapi.ordering.service.JacksonConfigurator.class);
        resources.add(tmf.org.dsmapi.ordering.service.ProductOrderFacadeREST.class);
    }
    
}
