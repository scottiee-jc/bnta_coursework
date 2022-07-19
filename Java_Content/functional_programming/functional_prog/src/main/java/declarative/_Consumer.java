package declarative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal java function
        Customer maria = new Customer("Maria", "0123456789");
        greetCustomer(maria);

        // Consumer Functional interface
        greetCustomerConsumer.accept(maria);

        // BiConsumer functional interface
        // allows you to not show to phone number depending on whether true or false is checked
        // e.g. useful for login features when you want to show / unshow password
        greetCustomerConsumerV2.accept(maria, false);
    }

    // Using FUNCTIONAL INTERFACE

    static Consumer<Customer> greetCustomerConsumer =
            customer ->
                    System.out.println("Hello "
                            + customer.customerName +
                            ", thanks for registering "
                            + customer.customerPhoneNumber);

    // Using BiFunction interface

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
                    System.out.println("Hello "
                            + customer.customerName +
                            ", thanks for registering "
                            + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));


    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);
    }


    // Using OOP

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
