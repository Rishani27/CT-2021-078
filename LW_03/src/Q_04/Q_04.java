package Q_04;

public class Q_04 {

    public static void main(String[] args) {
        Owner owner = new Owner("John Doe", "123-456-7890");


        Bicycle bike = new Bicycle("Giant", 21, owner);

        bike.displayDetails();
    }
}
