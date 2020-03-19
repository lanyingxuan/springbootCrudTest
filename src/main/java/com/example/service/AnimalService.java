package com.example.service;

import java.util.List;

import com.example.po.AnimaltablePO;

public interface AnimalService {

	int addUser(AnimaltablePO animaltablePO);
	//删
	public int deleteUser(int id);
	//改	
	public int updateUser(AnimaltablePO user);
	//查	
	public List<AnimaltablePO> getUser();

}
