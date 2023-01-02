package repository;

import entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByNameLike(String name);
    List<Customer> findByPhoneOrEmail(String phone, String email);
            @Query(value = "Select * from customer c where sex=?1 and (year(curdate()) - year(c.birthday) >= ?2 and year(curdate()) - year(c.birthday) <= ?3)", nativeQuery = true)
    List<Customer> findCustomerFromAgeToAge(String sex, int age1, int age2);
}