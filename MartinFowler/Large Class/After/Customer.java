public class Customer {
    private String name;
    private int age;

    public Customer(String n, int a, int c) {
        name = n;
        age = a;

    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    Credit();
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Credit: " + credit);
    }
}
