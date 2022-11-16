package de.sacnoth;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static de.sacnoth.DontDeleteRepo.PROHIBIT_DELETE_MESSAGE;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@QuarkusTest
@TestTransaction
class MyEntityRepoWithInterfaceTest {
    @Inject
    MyEntityRepoWithInterface repo;

    @Test
    void deleteAll() {
        assertThatThrownBy(() -> repo.deleteAll())
                .isInstanceOf(UnsupportedOperationException.class)
                .hasMessage(PROHIBIT_DELETE_MESSAGE);
    }
}