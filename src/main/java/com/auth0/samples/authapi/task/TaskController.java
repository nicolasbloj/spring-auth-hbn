package com.auth0.samples.authapi.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  @Autowired
  private TaskRepository taskRepository;


  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }


  @PostMapping
  public void addTask(@RequestBody Task task) {
    taskRepository.save(task);
  }

  @GetMapping("/")
  public List<Task> getTasks() {
    return taskRepository.findAll();
  }


  /*
   * @PutMapping("/{id}") public void editTask(@PathVariable long id, @RequestBody Task task) { Task
   * existingTask = taskRepository.findOne(id); Assert.notNull(existingTask, "Task not found");
   * existingTask.setDescription(task.getDescription()); taskRepository.save(existingTask); }
   * 
   * @DeleteMapping("/{id}") public void deleteTask(@PathVariable long id) {
   * taskRepository.delete(id); }
   */

}
