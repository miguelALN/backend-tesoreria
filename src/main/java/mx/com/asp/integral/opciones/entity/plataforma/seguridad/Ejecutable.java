package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

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
@Table(name = "adm_ejecutable", schema = "public")
@SequenceGenerator(name="admEjecutableSeq", sequenceName="adm_ejecutable_seq", allocationSize = 1)

public class Ejecutable {
    @Id
    @Column(name = "ejecutable_id", unique = true, nullable = false, precision = 5, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="admEjecutableSeq")
    private Long ejecutableId;
    @Column(name = "ejecutable", length = 32)
    private String ejecutable;
    @Column(name = "tipo", length = 1)
    private String tipo;
    @Column(name = "creado_por", precision = 5, scale = 0)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "modificado_por", precision = 5, scale = 0)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;
    @ManyToOne(cascade = {}, fetch = FetchType.LAZY, targetEntity=Aplicacion.class)
    @JoinColumn(name = "aplicacion_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Aplicacion aplicacion;
}
