package main;

import config.Config;
import entity.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.CustomerRepository;
import service.CustomerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Customer> createListCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.setName("Tam");
        customer1.setAddress("Da Nang");
        customer1.setBirthday(LocalDate.parse("1997-06-26"));
        customer1.setSex("male");
        customer1.setPhone("0369696969");
        customer1.setEmail("dinhtam.ftu2@gmail.com");
        Customer customer2 = new Customer();
        customer2.setName("Ngan");
        customer2.setAddress("Quang Nam");
        customer2.setBirthday(LocalDate.parse("1997-08-20"));
        customer2.setSex("male");
        customer2.setPhone("06464646464");
        customer2.setEmail("davidthai@gmail.com");
        Customer customer3 = new Customer();
        customer3.setName("Huy");
        customer3.setAddress("Da Nang");
        customer3.setBirthday(LocalDate.parse("1970-10-08"));
        customer3.setSex("male");
        customer3.setPhone("9898989899");
        customer3.setEmail("huythanhnguyen@gmail.com");
        Customer customer4 = new Customer();
        customer4.setName("Nhung");
        customer4.setAddress("Da Nang");
        customer4.setBirthday(LocalDate.parse("2001-10-08"));
        customer4.setSex("female");
        customer4.setPhone("46464646464");
        customer4.setEmail("hooteenhung@gmail.com");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        return customerList;
    }

    public static void main(String[] args) {

//        List<Customer> customerList = createListCustomer();
//        for (Customer c : customerList) {
//            CustomerService.addCustomer(c);
//        }

//        CustomerService.showAllCustomer();
//
//        CustomerService.findById(2);
//
//        CustomerService.findByName("am");
//
//        CustomerService.findByPhoneOrEmail("46464646464", "huythanhnguyen@gmail.com");
//
        CustomerService.findCustomerFromAgeToAge("male",20,30);
    }
}