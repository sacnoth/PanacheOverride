package de.sacnoth;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

public interface DontDeleteRepo<E, I> extends PanacheRepositoryBase<E, I> {
    String PROHIBIT_DELETE_MESSAGE = "You shall not delete!";

    @Override
    default long deleteAll() {
        throw new UnsupportedOperationException(PROHIBIT_DELETE_MESSAGE);
    }
}
