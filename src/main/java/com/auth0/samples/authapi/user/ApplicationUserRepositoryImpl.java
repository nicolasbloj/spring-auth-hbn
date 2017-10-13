package com.auth0.samples.authapi.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ApplicationUserRepositoryImpl implements ApplicationUserRepository {

  static List<ApplicationUser> list = new ArrayList<ApplicationUser>();


  @Override
  public ApplicationUser findByUsername(String username) {
    for (ApplicationUser user : list) {
      if (user.getUsername().equals(username)) {
        return user;
      }
    }
    return null;
  }

  @Override
  public void save(ApplicationUser user) {
    list.add(user);
  }

}
