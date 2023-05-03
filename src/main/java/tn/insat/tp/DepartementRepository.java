package tn.insat.tp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartementRepository extends CrudRepository<Departement, Integer> {
    List<Departement> findDepartementByUniversity(Integer idUniversity);
}
