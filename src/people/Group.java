package people;

import java.util.Arrays;

public class Group implements GroupI {
    private int size = 0;
    private Student[] students = new Student[10];

    @Override
    public void add(Student student) throws StudentArrayIndexOutOfBoundsException {

        for (int i = 0; i < students.length; i++) {
            if(size >= 10 ){
                throw new StudentArrayIndexOutOfBoundsException();
            } else if (students[i] == null){
                    students[i] = student;
                    size++;
                    break;
                }

        }
    }

    @Override
    public void remove(int index) {
        students[index] = null;
        size--;
    }

    @Override
    public void search(String name) {
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equals(name)) {
                student = students[i];
            }
        }
        if (student != null) {
            System.out.println(student.toString());
        } else {
            System.out.println("There no results by request: " + name);
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
