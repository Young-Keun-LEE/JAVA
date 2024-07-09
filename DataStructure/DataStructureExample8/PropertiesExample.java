package DataStructure.DataStructureExample8;

import java.util.Properties;
public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        
        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        String url = properties.getProperty("database.url");
        String username = properties.getProperty("database.username");
        String password = properties.getProperty("database.password");
        String appname = properties.getProperty("app.name");
        String appversion = properties.getProperty("app.version");

        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Appname: " + appname);
        System.out.println("Appversion: " + appversion);
    }
}