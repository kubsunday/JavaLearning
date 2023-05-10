public class Person {
    public String frequancy;
    public String name;
    public int age;

    public void eat() {
        System.out.println("I like pizza!");
    }

    public void walk(String frequancy) {
        this.frequancy = frequancy;
        System.out.println("I like walking" + frequancy);
    }

}
