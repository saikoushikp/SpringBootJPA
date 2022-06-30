package com.koushik.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.koushik.demo.dao.AlienRepo;
import com.koushik.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("getAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);

		return mv;
	}

	@RequestMapping("/aliens")
	@ResponseBody
	public java.util.List<Alien> displayAliens() {

		return repo.findAll();

	}

	@RequestMapping("/showAll")
	@ResponseBody
	public List<Alien> showAll() {

		return repo.findAll();

	}

	@RequestMapping("/deleteAlien")
	@ResponseBody
	public String deleteAlien(@RequestParam int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien());
		if (alien.getAid() == 0)
			return "Alien Not Found";
		else
			repo.delete(alien);

		return "Deleted";
	}

	@RequestMapping("/updateAlien")
	public String updateAlien(@RequestParam int aid, @RequestParam String aname) {
		Alien alien = repo.findById(aid).orElse(new Alien());
		if(alien.getAid()==0)
			return "Alien Not Found!!";
		else
		{
			alien.setAid(aid);
			alien.setAname(aname);
			repo.save(alien);
		}
		return "index.jsp";
		
	}
}
