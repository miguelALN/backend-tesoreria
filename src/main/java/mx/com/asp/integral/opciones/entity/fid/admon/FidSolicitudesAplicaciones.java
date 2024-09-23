package mx.com.asp.integral.opciones.entity.fid.admon;

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
@Table(name = "fid_solicitudes_aplicaciones", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidSolicitudesAplicacionesSec", sequenceName = "fid_solicitudes_aplicaciones_seq", allocationSize = 1)
public class FidSolicitudesAplicaciones {
    @Id
    @Column(name = "solicitud_aplicacion_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidSolicitudesAplicacionesSec")
    private Integer solicitudAplicacionId;
    @Column(name = "banco_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer bancoId;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_solicitud", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaSolicitud;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_aplicacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaAplicacion;
    @Column(name = "usuario_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer usuarioId;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date fechaModificacion;
    @Column(name = "num_oficio_solicitud", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String numOficioSolicitud;
    @Column(name = "num_folio_respuesta", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String numFolioRespuesta;
    @Column(name = "tipo", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer tipo;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_corte", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCorte;
    @ManyToOne(cascade={}, fetch=FetchType.LAZY, targetEntity = FidCatFideicomiso.class)
    @JoinColumn(name="cat_fideicomiso_id", referencedColumnName = "cat_fideicomiso_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidCatFideicomiso catFideicomisoId;


}
