package com.fund.Slip_Manager.service;


import com.fund.Slip_Manager.entity.User;

import java.util.List;

public interface UserServiceInterface {

    User findUserByEmail(String email);

}
