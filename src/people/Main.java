package people;

public class Main {

    public static void main(String[] args) throws StudentArrayIndexOutOfBoundsException {
        Group group = new Group();
        Student student = new Student("Barry", 20, "male", 4, 4.0);
        Student student1 = new Student("Jack", 21, "male", 5, 5.0);
        Student student2 = new Student("Maria", 19, "female", 3, 4.5);
        group.add(student);
        group.add(student1);
        group.add(student2);
        group.add(student2);
        group.add(student2);
        group.add(student2);
        group.add(student2);
        group.add(student2);
        group.add(student2);
        group.add(student2);

        System.out.println(group.toString());
        System.out.println(group.getSize());

        group.remove(5);
        group.remove(7);
        group.remove(3);

        System.out.println(group.toString());
        System.out.println(group.getSize());

        group.add(student);
        group.add(student1);
        group.add(student2);


        System.out.println(group.toString());
        System.out.println(group.getSize());









    }
}
