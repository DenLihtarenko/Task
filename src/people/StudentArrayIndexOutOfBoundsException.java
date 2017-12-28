package people;

public class StudentArrayIndexOutOfBoundsException extends Exception{

    @Override
    public String getMessage() {
        return "The array is full";
    }
}
