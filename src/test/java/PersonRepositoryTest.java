import com.vybostok.insurance.model.Insurance;
import com.vybostok.insurance.model.Person;
import com.vybostok.insurance.repository.PersonRepository;
import com.vybostok.insurance.repositoryimplementation.InMemoryPersonRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonRepositoryTest {
    @Test
    public void givenRepositoryOf3PeopleAllAreReturned() {
        Person p1 = new Person(0, "Jarda");
        p1.addInsurance(new Insurance(0));

        var p2 = new Person(1, "Pepa");
        p2.addInsurance(new Insurance(1));

        var p3 = new Person(2, "Tom");
        p3.addInsurance(new Insurance(2));

        var repository = getRepository();
        repository.save(p1);
        repository.save(p2);
        repository.save(p3);

        var persons = repository.findAll();

        assertThat(persons)
                .hasSize(3)
                .contains(p1)
                .contains(p2)
                .contains(p3);
    }

    private PersonRepository getRepository() {
        return new InMemoryPersonRepository();
    }
}
