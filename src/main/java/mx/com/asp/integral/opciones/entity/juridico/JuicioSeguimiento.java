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
@Table(name = "juicios_seguimientos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="juicioSeguimientoSeq", sequenceName="juicios_seguimientos_seq", allocationSize = 1)
public class JuicioSeguimiento {

    @Id
    @Column(name = "juicio_seguimiento_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="juicioSeguimientoSeq")
    private Long id;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Juicio.class)
    @JoinColumn(name = "juicio_id", unique = false, nullable = false, insertable = true, updatable = true)
    private Juicio juicioId;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fecha;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=EtapaProcesal.class)
    @JoinColumn(name = "etapas_procesales_id", unique = false, nullable = false, insertable = true, updatable = true)
    private EtapaProcesal etapasProcesalesId;
    @Column(name = "observacion", unique = false, nullable = false, insertable = true, updatable = true)
    private String observacion;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;
    @Column(name = "estatus", unique = false, nullable = false, insertable = true, updatable = true)
    private String estatus;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=JuicioCuatrimestre.class)
    @JoinColumn(name = "juicios_cuatrimestre_id", unique = false, nullable = true, insertable = true, updatable = true)
    private JuicioCuatrimestre juicioCuatrimestre;




}
