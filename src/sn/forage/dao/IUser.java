package sn.forage.dao;

import java.util.List;

import sn.forage.entities.User;

public interface IUser {
	public int add(User user);
	public List<User> list();
	public User getLogin(String email, String password);
}
