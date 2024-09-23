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
@Table(name = "fid_solicitudes_aplicaciones_detalles", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidSolicitudesAplicacionesDetallesSec" , sequenceName = "fid_solicitudes_aplicaciones_detalle_seq", allocationSize = 1)
public class FidSolicitudesAplicacionesDetalles {
    @Id
    @Column(name = "solicitud_aplicacion_detalle_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidSolicitudesAplicacionesDetallesSec")
    private Integer solicitudAplicacionDetalleId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity=FidSolicitudesAplicaciones.class)
    @JoinColumn(name = "solicitud_aplicacion_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidSolicitudesAplicaciones solicitudAplicacionId;
    @ManyToOne(cascade = {}, fetch = FetchType.LAZY, targetEntity=FidContrato.class)
    @JoinColumn(name = "num_contrato", referencedColumnName = "num_contrato", unique = false, nullable = false, insertable = true, updatable = true)
    private FidContrato numContrato;
    @Column(name = "monto_aplicar", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoAplicar;
    @Column(name = "atributo01", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo01;
    @Column(name = "atributo02", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo02;
    @Column(name = "atributo03", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo03;
    @Column(name = "atributo04", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo04;
    @Column(name = "atributo05", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo05;
    @Column(name = "estatus", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String estatus;
    @Column(name = "observaciones", unique = false, nullable = true, insertable = true, updatable = true)
    private String observaciones;
    @Column(name = "monto_solicitado", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double montoSolicitado;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;


}
