package tn.insat.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    @Autowired
    EnseignantRepository enseignantRepository;

    List<Enseignant> retrieveAllEnseignants(){
        return (List<Enseignant>) enseignantRepository.findAll();
    }
    Enseignant addEnseignant(Enseignant c){
        return enseignantRepository.save(c);
    }
    void deleteEnseignant(Integer id){
        enseignantRepository.deleteById(id);
    }
    Enseignant updateEnseignant(Enseignant c){
        Optional<Enseignant> enseignantToUpdate = enseignantRepository.findById(c.getId());
        enseignantToUpdate.get().setNom(c.getNom());
        enseignantToUpdate.get().setPrenom(c.getPrenom());
        enseignantToUpdate.get().setDepartements(c.getDepartements());
        return enseignantRepository.save(enseignantToUpdate.get());
    }
    Optional<Enseignant> retrieveEnseigant(Integer id){
        return enseignantRepository.findById(id);
    }
}
