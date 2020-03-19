package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AnimaltableMapper;
import com.example.po.AnimaltablePO;
import com.example.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimaltableMapper dao;
	
	@Override
	public int addUser(AnimaltablePO animaltablePO) {
		// TODO Auto-generated method stub
		int result = 0;
		try{
			result = dao.insert(animaltablePO);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int deleteUser(int id) {
		int number=dao.deleteByPrimaryKey(id);
		return number;
	}

	@Override
	public int updateUser(AnimaltablePO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AnimaltablePO> getUser() {
		// TODO Auto-generated method stub
		List<AnimaltablePO> po = dao.getAll();
		return po;
	}

}
