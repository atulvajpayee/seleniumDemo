import org.openqa.selenium.WebDriverException;
import org.testng.SkipException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigName {

    static Properties prop = new Properties();
    static FileInputStream fis = null;

    public static String getProperty(String s) {

        String str = "";
        File file = new File(System.getProperty("user.dir") + "//Config.properties");

        WebDriverException ExtentInstance = null;
        try {
            fis = new FileInputStream(file);
            if (fis != null) {
                try {
                    prop.load(fis);
                    str = prop.get(s).toString();
                    if (str == " ")
                        throw new SkipException("keys value" + s + "not present in config file");
                } catch (IOException e) {
                    /*ExtentInstance.addFail(e);*/
                }
            }

        } catch (FileNotFoundException e) {

           /* ExtentInstance.addInfo(e);*/
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return str;
    }



}
