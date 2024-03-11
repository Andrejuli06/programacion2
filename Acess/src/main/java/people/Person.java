package people;

public class Person {

    private String name;
    private String lastName;
    private String fullName;
    private int age;
    private String pass;

    

    public Person(String name, String lastName, int age) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        createFullName(name, lastName);
    }

    private void createFullName(String name, String lastname) {
        this.fullName = name + lastname;
        
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

}
