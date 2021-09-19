import java.io.File;
import java.io.FileNotFoundException;

public class SUV implements Vehicle {
    @Override
    public void draw() throws FileNotFoundException{
        System.out.println("Inside SUV, draw() method");
        FindPrice findPrice = new FindPrice();
        findPrice.parseFile("C:\\Users\\matta\\OneDrive\\Documents\\School 2020-21\\princip project\\SOFE3650-Assign1\\data.txt", "suv");
    }
}
