
import java.time.LocalDate;
import java.util.Arrays;

public class FirstClass {
    private String firstName;
    private String lastName;
    private LocalDate Dob;

    public FirstClass(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        Dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return Dob;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Dob=" + Dob +
                '}';
    }

    public void setDob(LocalDate dob) {
        Dob = dob;


    }
}
class Result{
    void main(){
        FirstClass fc = new FirstClass("Josh","Frank",LocalDate.of(1995,5,21));

        System.out.println(fc);

        int[] nums = new int[10];
        for ( int i = 0; i < nums.length; i++){
            System.out.println(i);
        }

    }
}
class AverageCalculator{
    void main(){
        int val = calculateAverage(5,8,13,25,10,20,-3);
        System.out.println("Average score is : " +val);
    }
    int calculateAverage(int... numbers){
        int sum = 0;
        for (int num : numbers){
            sum +=num;
        }
        System.out.println(Arrays.toString(numbers));
        return sum / numbers.length;
    }
}

