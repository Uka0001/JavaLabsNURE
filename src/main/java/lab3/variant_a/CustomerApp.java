package lab3.variant_a;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomerApp {
    public static void main(String[] args) {
        Customer [] customers;
        customers = new Customer[]{
                new Customer(1L,
                        "SurnA",
                        "NameCC",
                        "FnameCC",
                        "1990-01-11",
                        "1234",
                        "1234"),
                new Customer(2L,
                        "SurnB",
                        "NameB",
                        "FnameB",
                        "1991-02-10",
                        "2233",
                        "1233"),
                new Customer(3L,
                        "SurnC",
                        "NameCA",
                        "FnameC",
                        "1992-02-10",
                        "1232",
                        "1232"),
        };
        getOrderedCustomers(customers);
        getCreditCardNumberPatternInterval(customers);
    }

    private static void getCreditCardNumberPatternInterval(Customer[] customers) {
        System.out.println(Arrays.stream(customers).filter(i -> i.getCreditCardNumber().substring(0, 2).contains("12")).collect(Collectors.toList()));
    }

    private static void getOrderedCustomers(Customer[] customers) {
        System.out.println(Arrays.stream(customers).map(Customer::getFirstName).sorted().collect(Collectors.toList()));
    }
}
