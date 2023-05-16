package document.docs.drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Znajduję element w przeglądarce Chrome");
    }


    
}
