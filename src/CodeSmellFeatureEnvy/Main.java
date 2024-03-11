package CodeSmellFeatureEnvy;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("1234567890");
        System.out.println("Formatted Phone Number: " + phone.toFormattedString());

        Phone.Customer customer = new Phone.Customer();
        customer.mobilePhone = phone;
        System.out.println("Customer's Mobile Phone Number: " + customer.getMobilePhoneNumber());
    }
}