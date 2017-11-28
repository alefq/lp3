package py.edu.uca.lp3.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.edu.uca.lp3.domain.Institute;
import py.edu.uca.lp3.domain.Person;
import java.lang.String;

@RepositoryRestResource(collectionResourceRel = "institute", path = "institute")
public interface InstituteRepository extends PagingAndSortingRepository<Institute, Long> {

	List<Institute> findByName(String name);

}
