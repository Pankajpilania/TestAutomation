import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(input);

        String dbUrl = properties.getProperty("Database.url");
        String dbPassword = properties.getProperty("Database.password");
        String dbusername = properties.getProperty("Database.username");
        String serverport = properties.getProperty("server.port");

        System.out.println("Database url - "  + dbUrl);
        System.out.println("Database username - "  + dbusername);
        System.out.println("Database password - " + dbPassword);
        System.out.println("Server port - " + serverport);

        properties.setProperty("server.port - ", "1900");
        try {
            FileOutputStream output = new FileOutputStream("config.properties");
            properties.store(output, "updated port by pankaj for testing purpose");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
