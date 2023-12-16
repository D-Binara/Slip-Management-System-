package com.fund.Slip_Manager.repo;



import com.fund.Slip_Manager.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
