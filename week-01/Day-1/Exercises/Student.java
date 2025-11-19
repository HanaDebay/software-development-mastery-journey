public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void printDetail(){
        System.out.println("name: " + name +  " age: "  + age + " id: " + id);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Hana",38,"H1234");
        Student student2 = new Student("Abel", 39, "A3836");
        student1.printDetail();
        student2.printDetail();
    }
}


