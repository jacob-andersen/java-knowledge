public class Person {
    
    private String name;
    private int age;

    public Person (String n, int a) {
        this.name=n;
        this.age=a;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nAge  : "+ age;
    }

}
