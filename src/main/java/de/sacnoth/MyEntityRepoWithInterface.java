package de.sacnoth;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyEntityRepoWithInterface implements DontDeleteRepo<MyEntity, Long> {

}
