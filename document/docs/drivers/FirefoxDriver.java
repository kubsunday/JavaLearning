package document.docs.drivers;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
            System.out.println("Otwieram przeglądarkę Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Znajduję element w przeglądarce Firefox");
    }
}
    

