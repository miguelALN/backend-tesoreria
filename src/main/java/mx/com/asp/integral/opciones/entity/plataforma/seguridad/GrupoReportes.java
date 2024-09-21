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
@Table(name = "grupo_reportes", schema = "public")
@SequenceGenerator(name ="grupoReportesSeq", sequenceName="grupo_reportes_grupo_reporte_id_seq", allocationSize = 1)
public class GrupoReportes {

    @Id
    @Column(name = "grupo_reporte_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="grupoReportesSeq")
    private Integer grupoReporteId;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "creado_por", nullable = false)
    private Integer creadoPor;

    @Column(name = "modificado_por", nullable = false)
    private Integer modificadoPor;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", nullable = false, length = 8)
    private Date fechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_modificacion", nullable = false, length = 8)
    private Date fechaModificacion;

}
