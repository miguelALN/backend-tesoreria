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
@Table(name = "fid_movimientos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidMovimientoSec", sequenceName = "fid_movimientos_movimiento_id_seq", allocationSize = 1)
public class PlaVersiones {

    @Id
    @Column(name = "version_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="plaVersionesSec")
    private Integer versionId;
    @ManyToOne(cascade = {}, targetEntity = PlaSistemas.class)
    @JoinColumn(name = "sistema_id", unique = false, nullable = true, insertable = true, updatable = true)
    private PlaSistemas plaSistemas;
    @Column(name = "num_version", unique = false, nullable = true, insertable = true, updatable = true, precision = 4, scale = 0)
    private String 	numVersion;
    @Column(name = "descripcion", unique = false, nullable = true, insertable = true, updatable = true)
    private String 	descripcion;
    @Column(name = "observacion", unique = false, nullable = true, insertable = true, updatable = true)
    private String 	observacion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date 	fechaModificacion;
    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "plaVersiones")
    private Set<PlaDocumentos> plaDocumentoses = new HashSet<PlaDocumentos>(0);


}
