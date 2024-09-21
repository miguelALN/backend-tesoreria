package mx.com.asp.integral.opciones.entity.plataforma;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.com.asp.integral.opciones.entity.plataforma.seguridad.Ejecutable;

import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "layout_procesos", schema = "public")
@SequenceGenerator(name="layoutProsesosSeq", sequenceName="layout_prosesos_seq", allocationSize = 1)
public class LayoutProcesos {

    @Id
    @Column(name = "layout_proceso_id", unique = true, nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="layoutProsesosSeq")
    private Long layoutProcesoId;
    @ManyToOne(cascade={}, fetch = FetchType.EAGER, targetEntity = Layout.class)
    @JoinColumn(name = "layout_id", nullable = false)
    private Layout layout;
    @ManyToOne(cascade={}, fetch = FetchType.EAGER, targetEntity = Ejecutable.class)
        @JoinColumn(name = "ejecutable_id", nullable = false)
    private Ejecutable ejecutable;
    @Column(name = "requerido_por", nullable = false, precision = 5, scale = 0)
    public Long getRequeridoPor() {
        return this.requeridoPor;
    }
    private Long requeridoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "inicio_carga")
    private Date inicioCarga;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "terminacion_carga")
    private Date terminacionCarga;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "inicio_proceso")
    private Date inicioProceso;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "terminacion_proceso")
    private Date terminacionProceso;
    @Column(name = "estatus", length = 1)
    private String estatus;
    @Column(name = "log_carga")
    private String logCarga;
    @Column(name = "log_procesamiento")
    private String logProcesamiento;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
    private Date fechaModificacion;
    @Column(name = "cabecera")
    private String cabecera;
    @Column(name = "pie")
    private String pie;
}
