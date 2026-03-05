package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.CapgTopics;

@Service
public class CapgTopicsService {
	
	
	List<CapgTopics> list = new ArrayList<>(Arrays.asList(
			new CapgTopics("Spring Boot","Spring MVC","Spring"),
			new CapgTopics("J2SE Tech","JDBC","JAVA"))
		);

	public List<CapgTopics> getAllTopics() {
		return list;
	}

	public void addTopic(CapgTopics topic) {
		list.add(topic);
	}

	public CapgTopics getTopic(String id) {
		
		for(CapgTopics obj : list) {
			
			if(obj.getId().equals(id)) {
				return obj;
			}
		}
		return null;
	}

	public void deleteTopic(String id) {
		
		for(int i=0;i<list.size();i++) {
			
			CapgTopics topics = list.get(i);
			
			if(topics.getId().equals(id)) {
				list.remove(i);
			}
		}
	}
}
