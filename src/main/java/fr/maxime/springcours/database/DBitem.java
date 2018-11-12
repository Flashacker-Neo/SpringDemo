package fr.maxime.springcours.database;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DBitem {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
