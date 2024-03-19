package com.vg.addressapp.repo;

import com.vg.addressapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    //address based on an employee id
    @Query(nativeQuery = true, value = "SELECT ea.id, ea.lane1, ea.lane2, ea.state, ea.zip FROM address ea join employee ee on ea.employee_id = ee.id where ee.id = :employeeId")
    Address findAddressByEmployeeId(@Param("employeeId") int employeeId);
}
