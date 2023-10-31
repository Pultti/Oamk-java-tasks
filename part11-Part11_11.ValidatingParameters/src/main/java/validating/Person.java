package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}