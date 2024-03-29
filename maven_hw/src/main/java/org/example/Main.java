package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try(InputStream resourceAsStream = TestMaven.class.getClassLoader()
                .getResourceAsStream("config.properties")){
//            prop.load(Object.requireNonNull(resourceAsStream));
        }
        catch(IOException e){
            System.err.println("Unable to load properties file : "+"config.properties");
        }

        prop.get("props.local.hello");
        prop.get("props.mvn.hello");
    }
}
