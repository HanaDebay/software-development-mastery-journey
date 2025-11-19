public class ExerciseOne {
    public static void main(String[] args) {
        //
        Person person1 = new Person("Hana", 38);
        Person person2 = new Person("Abel", 39);
        person1.introduce();
        person2.introduce();
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}