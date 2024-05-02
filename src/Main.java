public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println();
        person.setAge(21);
        person.setName("Luba");
        System.out.println("Output:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}