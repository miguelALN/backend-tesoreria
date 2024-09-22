package mx.com.asp.integral.opciones.entity.juridico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etapas_procesales", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "etapasProcesalesSeq" , sequenceName = "etapas_procesales_seq", allocationSize = 1)

public class EtapaProcesal {

    @Id
    @Column(name = "etapas_procesales_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etapasProcesalesSeq")
    private Long id;
    @Column(name = "descripcion", unique = false, nullable = false, insertable = true, updatable = true, length = 254)
    private String descripcion;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaModificacion;
    @Column(name = "multiple", unique = false, nullable = true, insertable = true, updatable = true, precision = 1)
    private Long multiple;
}
