package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Task;
import com.example.demo.Repository.TodoRepository;

@Service
public class TodoServices {

	@Autowired
	private TodoRepository repo;
	
	public List<Task> getTasks(){
		List<Task> lists = new ArrayList<>();
		for(Task list :repo.findAll()) {
			lists.add(list);
		}
		return lists;
	}
	
	public Task gettask(int id) {
		return repo.findById(id).get();
	}
	
	public void addtask(Task task)
	{
		repo.save(task);
	}
	
	public void updatetask(int id) {
		Task tasks = repo.findById(id).get();
		repo.save(tasks);
	}
	public void deletetask(int id) {
		repo.deleteById(id);
	}
}
