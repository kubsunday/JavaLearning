package document.docs.drivers;

public class WebDriverTest {


    public static void main(String[] args){

        DriverType[] driverTypes = DriverType.values();
        for(int i=0; i<driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);

        }


        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElement();
        driver.findElement();
        driver.findElement();
        driver.findElement();
        driver.findElement();

        // FirefoxDriver firefox = new FirefoxDriver();

        // firefox.get();
        // firefox.findElement();
        
    }

    private static WebDriver getDriver(DriverType type){
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
        return new FirefoxDriver();



    }

}
    

