package tn.insat.tp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateofbirth;

    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;

}
