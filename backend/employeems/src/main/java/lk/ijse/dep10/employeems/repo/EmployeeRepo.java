package lk.ijse.dep10.employeems.repo;

import lk.ijse.dep10.employeems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
