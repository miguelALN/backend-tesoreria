package mx.com.asp.integral.opciones.entity.crm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pla_sistemas", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="plaSistemasSec", sequenceName="pla_sistema_sistema_id_seq", allocationSize = 1)
public class PlaSistemas {

    @Id
    @Column(name = "sistema_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="plaSistemasSec")
    private Integer sistemaId;
    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String nombre;
    @Column(name = "descripcion", unique = false, nullable = true, insertable = true, updatable = true)
    private String descripcion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;
    @Column(name = "extension", unique = false, nullable = true, insertable = true, updatable = true)
    private String extension;
    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "plaSistemas")
    private Set<PlaVersiones> plaVersioneses = new HashSet<PlaVersiones>(0);
}
