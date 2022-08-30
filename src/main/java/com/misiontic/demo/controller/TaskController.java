package com.misiontic.demo.controller;

import com.misiontic.demo.model.Task;
import com.misiontic.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @GetMapping("/{id}")
    public Task getTasks(@PathVariable long id){
        return repository.findById(id).get();
    }

    @GetMapping
    public List<Task> getTasks(){
         return repository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return repository.save(task);
    }

    @PutMapping
    public Task modifyTask(@RequestBody Task modify){
        return repository.save(modify);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id){
        repository.deleteById(id);
    }
}
