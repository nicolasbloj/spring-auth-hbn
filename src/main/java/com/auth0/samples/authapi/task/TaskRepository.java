package com.auth0.samples.authapi.task;

import java.util.List;

public interface TaskRepository {
  public void save(Task task);

  public List<Task> findAll();
}

// The persistence layer of our application is backed by an in-memory database called HSQLDB.
// este esquema de JPARepository y Entity Task no esta funcionando con spring mvc
