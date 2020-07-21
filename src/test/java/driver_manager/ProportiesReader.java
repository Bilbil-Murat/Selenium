package driver_manager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProportiesReader {

private  static Properties properties;

    public ProportiesReader() throws IOException {
        String firstProportiesPath="C:\\NAUBootFW\\src\\test\\resources\\props\\first.properties";

        BufferedReader bReader;
        //load the buffered reader objects with the file
        bReader=new BufferedReader(new FileReader(firstProportiesPath));
        properties=new Properties();

        //load the properties object with buffered reader object
        properties.load(bReader);
        bReader.close();
    }

    public String getPropertyValue(String key){
        return  properties.getProperty(key);
    }
}
