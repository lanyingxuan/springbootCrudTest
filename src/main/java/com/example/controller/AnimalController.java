package com.example.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.po.AnimaltablePO;
import com.example.service.AnimalService;

@RestController
@RequestMapping("/animal/")
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
    @RequestMapping("/toAdd")
    public ModelAndView toAdd() {
    	ModelAndView mav = new ModelAndView("user/userAdd");
        return mav;
    }
	
	//增
	@RequestMapping("/addAnimal")
	public int addUser(AnimaltablePO animaltablePO){
		
		int result = animalService.addUser(animaltablePO);
		
		return result;
	}
	
	@RequestMapping("/list")
    public ModelAndView list(Model model) {
		// 顾名思义 实体和数据 同时返回页面模板和数据
        ModelAndView mav = new ModelAndView("user/list");
        List<AnimaltablePO> list = animalService.getUser();
        mav.addObject("users",list);
        return mav;
    }
	
	
	@RequestMapping("/delete")
	@ResponseBody
    public void delete(int id, HttpServletRequest request, HttpServletResponse response) {
		animalService.deleteUser(id);
		
    }
}
