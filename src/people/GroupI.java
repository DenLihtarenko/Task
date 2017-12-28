package people;

public interface GroupI {

    void add(Student student) throws StudentArrayIndexOutOfBoundsException;

    void remove(int index);

    void search(String name);



}
