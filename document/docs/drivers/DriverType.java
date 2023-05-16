package document.docs.drivers;

public enum DriverType {

    CHROME("chrome", "/scr/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/tst/resource/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path){
        this.name = name;
        this.path = path;

    }


}
