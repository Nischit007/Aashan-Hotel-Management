package aashan.hotel.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import aashan.hotel.entity.User;
import aashan.hotel.temp.CurrentUser;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();

	User getLoggedUser();
}
