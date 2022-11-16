package de.sacnoth;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "T_MY_ENTITY")
@Entity
public class MyEntity {
    @Id
    int entityId = 1;

    int entityValue = 2;
}
