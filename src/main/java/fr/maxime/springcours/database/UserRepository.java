package fr.maxime.springcours.database;

import fr.maxime.springcours.models.User;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<User, Integer> {



}
