package net.javaguides.user_service.service;

import net.javaguides.user_service.dto.ResponseDto;
import net.javaguides.user_service.entity.User;
public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
