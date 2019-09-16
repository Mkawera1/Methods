import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int x;
        int y;


        x= 5;
        y= 0;
        //add(x,y);
        int sum = add(x,y);
        System.out.println(sum);

        // ArrayList<String> newList = new ArrayList<>();
        //instances or objects
        Building gBTC = new Building(5,6,5,7);
        Building tPMC = new Building(7,7,7,7);
        gBTC.printNumberOfRooms();
        tPMC.printNumberOfRooms();

        Book one = new Book("Clarity");
        Book two = new Book("John Grey", 300);
        Book three = new Book("Got It","Peter Miles",600);
        one.giveTitle();
        two.stateAuthor();
        three.giveTitle();


    }
    public static int add(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
}
