package service;

import config.Config;
import entity.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    static AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
    static CustomerRepository customerRepo = applicationContext.getBean("customerRepository", CustomerRepository.class);
    public static void addCustomer(Customer customer){
        customerRepo.save(customer);
    }
    public static void showAllCustomer(){
        List<Customer> customerList = (List<Customer>) customerRepo.findAll();
        for (Customer customer:customerList)
            System.out.println(customer.toString());
    }

    public static void findById(int id){
        Optional<Customer> customerList = customerRepo.findById(id);
        System.out.println(customerList.get().toString());
    }

    public static void findByName(String name){
        List<Customer> customerList = customerRepo.findByNameLike("%"+name+"%");
        for (Customer customer:customerList)
            System.out.println(customer.toString());
    }

    public static void findByPhoneOrEmail(String phone, String email) {
        List<Customer> customerList = customerRepo.findByPhoneOrEmail(phone, email);
        for (Customer customer:customerList)
            System.out.println(customer.toString());
    }

    public static void findCustomerFromAgeToAge(String sex, int age1, int age2){
        List<Customer> customerList = customerRepo.findCustomerFromAgeToAge(sex,age1,age2);
        for (Customer customer:customerList)
            System.out.println(customer.toString());
    }
}