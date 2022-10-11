package Midterm;



public class Customer extends User {
    Size size;
    Product product;
    private int rewardPoints;
    private double accountBalance;
    private String[] addresses;


    public Customer(String username, String password, double amount, String[] addresses) {
        super(username, password);
        this.accountBalance = amount;
                this.addresses = addresses;
    }
    public void useRewardPoints(int rewardPoints){
        this.rewardPoints = rewardPoints;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void deposit(double amount){
        if (amount <=0){
            System.out.println("ERROR. Cannot give negative balance, try again.");
        }else{
            this.accountBalance+=amount;
            System.out.println("Funds successfully deposited\n"+amount);
        }
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

}
