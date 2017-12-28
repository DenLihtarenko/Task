package people;

public class Student extends Person {

    private int year;
    private double averageRating;

    public Student(String name, int age, String gender, int year, double averageRating) {
        super(name, age, gender);
        this.year = year;
        this.averageRating = averageRating;
    }

    @Override
    public void writeInfo() {
        super.writeInfo();
        System.out.print("Student info: Year " + year + " Average Rating " + averageRating);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                " Student{" +
                "year=" + year +
                ", averageRating=" + averageRating +
                '}';
    }
}
