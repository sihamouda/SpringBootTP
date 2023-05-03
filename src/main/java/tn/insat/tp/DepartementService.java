package tn.insat.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementService {
    @Autowired
    DepartementRepository departementRepository;

    Integer retrieveDepartementGL(){
        List<Departement> all = (List<Departement>) departementRepository.findAll();
        return all.size();
    }

    List<Departement> retrieveDepartementsByUniversite(Integer idUniversite){
        return (List<Departement>) departementRepository.findDepartementByUniversity(idUniversite);
    }
}
