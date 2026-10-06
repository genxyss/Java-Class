public class CalculateAverage {
    static void main() {

        CalculateAverage cav = new CalculateAverage();
        System.out.println(cav.returnInitial("christopher"));
    }
    char returnInitial(String name){
        char mni = name.toUpperCase().charAt(0);
        return mni;
    }
}


