package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "responsabilidades", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="responsabilidadesSec", sequenceName="responsabilidades_responsabilidad_id_seq", allocationSize = 1)
public class Responsabilidad {

    @Id
    @Column(name = "responsabilidad_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="responsabilidadesSec")
    private Integer responsabilidadId;

    @Column(name = "responsabilidad", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String responsabilidad;

    @Column(name = "descripcion", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String descripcion;

    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Integer creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Integer modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

    @ManyToOne(cascade={}, fetch=FetchType.EAGER, targetEntity=GrupoReportes.class)
    @JoinColumn(name = "grupo_reporte_id", unique = false, nullable = true, insertable = true, updatable = true)
    private GrupoReportes grupoReporteId;

    @ManyToOne(cascade={}, fetch=FetchType.EAGER, targetEntity=Menu.class)
    @JoinColumn(name = "menu_id", unique = false, nullable = true, insertable = true, updatable = true)
    Menu menuId;

    @ManyToOne(cascade={}, fetch=FetchType.LAZY, targetEntity=Aplicacion.class)
    @JoinColumn(name = "aplicacion_id", unique = false, nullable = true, insertable = true, updatable = true)
    Aplicacion	aplicacionId;

    public Responsabilidad( Integer responsabilidadId, String responsabilidad,  String descripcion,  Integer creadoPor,
                            Date fechaCreacion, Integer modificadoPor, Date fechaModificacion,  Menu menuId,  GrupoReportes grupoReporteId ) {
        this.responsabilidadId = responsabilidadId;
        this.responsabilidad = responsabilidad;
        this.descripcion = descripcion;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.modificadoPor = modificadoPor;
        this.fechaModificacion = fechaModificacion;
        this.menuId = menuId;
        this.grupoReporteId = grupoReporteId;
    }
}
