import java.io.FileNotFoundException;

public class Car implements Vehicle {
    @Override
    public void draw() throws FileNotFoundException {
        System.out.println("Inside Car, draw() method");
        FindPrice findPrice = new FindPrice();
        findPrice.parseFile("C:\\Users\\matta\\OneDrive\\Documents\\School 2020-21\\princip project\\SOFE3650-Assign1\\data.txt", "car");
    }
}
