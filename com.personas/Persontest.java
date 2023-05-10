public class Persontest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 29;

        teacher.walk(" slow");
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
        teacher.school = "University";

        Footballer footballer = new Footballer();
        footballer.name = "Mike";
        footballer.age = 21;

        footballer.walk(" fast");
        footballer.eat();
        footballer.footballClub = "Boca Juniors";
        footballer.sayHello();

    }

}
