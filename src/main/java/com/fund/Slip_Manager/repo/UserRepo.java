package com.fund.Slip_Manager.repo;

import com.fund.Slip_Manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {


}
