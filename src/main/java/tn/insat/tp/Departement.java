package tn.insat.tp;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @ManyToOne
    @JoinColumn(name = "university_id",referencedColumnName = "id")
    private University university;

    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;

    @ManyToMany
    private List<Enseignant> enseignants;

}
