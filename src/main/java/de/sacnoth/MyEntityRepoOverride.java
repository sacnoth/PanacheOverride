package de.sacnoth;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

import static de.sacnoth.DontDeleteRepo.PROHIBIT_DELETE_MESSAGE;

@ApplicationScoped
public class MyEntityRepoOverride implements PanacheRepositoryBase<MyEntity, Long> {
    @Override
    public long deleteAll() {
        throw new UnsupportedOperationException(PROHIBIT_DELETE_MESSAGE);
    }
}
