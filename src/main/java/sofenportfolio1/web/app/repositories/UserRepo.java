package sofenportfolio1.web.app.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import sofenportfolio1.web.app.entities.User;

public interface UserRepo extends JpaRepository <User,Integer>{

}
