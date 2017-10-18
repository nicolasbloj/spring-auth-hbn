package com.auth0.samples.authapi.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepositoryImpl implements TaskRepository {

  static List<Task> list = new ArrayList<Task>();
  static int x = 1;


  @Override
  public void save(Task task) {
    list.add(task);
  }

  @Override
  public List<Task> findAll() {
    list.add(new Task("tarea " + x++));
    return list;
  }

}
