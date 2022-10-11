package Midterm;

public class Main {

    public static void main(String[] args) {
        //Create an instance of the Admin class
        Admin admin = new Admin("Admin1", "AdminRoolz");

        //Create 3 customer objects with the parameterized constructor
        Customer customer1 = new Customer("Dope", "DopeBoy123",0, new String[]{"123 Court", "526 Way"});
        Customer customer2 = new Customer("Greg","Greg drools", 0, new String[]{"123 Court", "526 Way" });
        Customer customer3 = new Customer("Tiff", "TiffAndCo", 0, new String[]{"123 Court", "526 Way"});

        customer1.deposit(-150.00);//try to deposit a negative amount
        customer1.setAccountBalance(1000.00);
        System.out.println("Your account balance is now $" + customer1.getAccountBalance());

        //call method to give customer1 100 reward points
        customer1.setRewardPoints(1000 - 100);

        //invoke method to make customer use 100 of their reward points
        System.out.println("You now have " + customer1.getRewardPoints() +" left.");


        //call a method to get/retrieve ONLY secondary address of customer 1 then print it out

    }

}
