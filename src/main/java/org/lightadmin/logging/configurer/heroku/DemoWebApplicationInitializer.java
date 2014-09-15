package org.lightadmin.logging.configurer.heroku;

import org.lightadmin.logging.configurer.LoggingConfigurerSettings;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * @author Maxim Kharchenko (kharchenko.max@gmail.com)
 */
@Order(HIGHEST_PRECEDENCE)
public class DemoWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter(LoggingConfigurerSettings.LIGHT_CONFIGURER_BASE_URL, "/");
        servletContext.setInitParameter(LoggingConfigurerSettings.LIGHT_CONFIGURER_DEMO_MODE, "true");
    }
}