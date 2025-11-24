package module4.projects.ucell.config;

import java.net.URL;

public class LoggerConfig {

    public static void load() {
            URL resource = LoggerConfig.class.getClassLoader().getResource("logging.properties");

        assert resource != null;
        System.setProperty("java.util.logging.config.file", resource.getPath());

        if (resource.getPath().isEmpty()){
            System.out.println("No logging.properties file found");
        }
    }
}

