package org.game.service;

public interface UserManageService {
	void register(String userId, String password);
	
	void login(String userId, String password);
	
	void logout();
	
}
