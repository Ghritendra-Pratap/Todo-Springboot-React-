package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Task;
import com.example.demo.Services.TodoServices;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class TodoContoller {

	@Autowired
	private TodoServices service;
	
	@GetMapping("/tasks")
	public List<Task> getall() {
		return service.getTasks();
	}
	
	@GetMapping("/formtasks")
	public String gettall() {
		return "hello user";
	}
	
	@PostMapping("/addtask")
	public void addtask(@RequestBody Task task) {
		System.out.print(task.getTaskid());
		service.addtask(task);
	}
	
	@PutMapping("/update/{id}")
	public void updatetask(@PathVariable int id) {
		service.updatetask(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void deletetask(@PathVariable int id) {
		service.deletetask(id);
	}
}
