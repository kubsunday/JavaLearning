public class TestersTemplate {
    
    public String name;
    public String surname;
    public String position;
    public int payRate;

    public void personalData(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    public void companyData(){
        System.out.println("Position: " + position);
        System.out.println("Payrate: " + payRate);
    }
}