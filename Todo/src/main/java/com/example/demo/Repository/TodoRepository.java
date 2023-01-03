package com.example.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Task;

@Repository
public interface TodoRepository extends CrudRepository<Task , Integer> {

}
