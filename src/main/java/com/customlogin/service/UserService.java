package com.customlogin.service;

import com.customlogin.dto.UserDto;
import com.customlogin.model.User;

public interface UserService {

	User findByUsername(String username);

	User save(UserDto userDto);

}
