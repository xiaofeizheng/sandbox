package com.sony.app;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.sony.app.resources.AppResource;
import com.sony.app.health.TemplateHealthCheck;

public class AppApplication extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new AppApplication().run(args);
    }

    @Override
        public String getName() {
            return "hello-world";
        }

    @Override
        public void initialize(Bootstrap<AppConfiguration> bootstrap) {
            // nothing to do yet
        }

    @Override
        public void run(AppConfiguration configuration,
                Environment environment) {
            // nothing to do yet
            final AppResource resource = new AppResource(
                    configuration.getTemplate(),
                    configuration.getDefaultName()
                    );
            final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
            environment.healthChecks().register("template", healthCheck);
            environment.jersey().register(resource);
        }

}
