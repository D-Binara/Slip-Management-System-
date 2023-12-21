package com.slipMangement.service;

import com.slipMangement.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}
