package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.CapgTopics;
import com.capg.springboot.service.CapgTopicsService;

@RestController
public class CapgTopicsController {
	
	@Autowired
	CapgTopicsService topicService;
	
	@RequestMapping("/mycontroller")
	public String display() {
		return "My Controller";
	}
	
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	//Topic by ID
	
	@RequestMapping("/capgtopics/{id}")
	public CapgTopics getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
