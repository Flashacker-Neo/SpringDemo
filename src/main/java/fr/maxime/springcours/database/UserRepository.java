package fr.maxime.springcours.database;

import fr.maxime.springcours.models.User;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends CrudRepository<User, Integer> {



}
