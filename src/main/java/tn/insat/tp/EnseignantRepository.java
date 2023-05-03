package tn.insat.tp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantRepository extends CrudRepository<Enseignant, Integer> {

//    List<Etudiant> findEnseignantsByDepartements(){}

//    List<Etudiant> findEnseignantsByDepartement(Integer id){
//        List<Etudiant> findEnseigna
//
//    }
}
