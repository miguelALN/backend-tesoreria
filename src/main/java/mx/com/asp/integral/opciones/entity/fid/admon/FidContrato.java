package mx.com.asp.integral.opciones.entity.fid.admon;

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
@Table(name = "fid_contratos")
@SequenceGenerator(name = "fidContratoIdSec" , sequenceName = "fid_contratos_contrato_id_seq", allocationSize = 1)
public class FidContrato {


    @Column(name = "num_contrato", unique = true, nullable = false, insertable = true, updatable = true)
    private String numContrato;

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, targetEntity = FidSolicitudesAplicacionesDetalles.class, mappedBy = "numContrato")
    private Set<FidSolicitudesAplicacionesDetalles> fidSolicitudesAplicacionesDetallesCollection = new HashSet<FidSolicitudesAplicacionesDetalles>(0);

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, targetEntity = FidMovimiento.class, mappedBy="fidContrato")
    private Set<FidMovimiento> fidMovimientoCollection = new HashSet<FidMovimiento>(0);

    @ManyToOne(cascade = {},targetEntity = FidCatFideicomiso.class)
    @JoinColumn(name = "fideicomiso_id", referencedColumnName = "fideicomiso_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidCatFideicomiso fideicomiso;

    @ManyToOne(cascade = {},targetEntity = FidSolicitante.class)
    @JoinColumn(name = "solicitante_id", referencedColumnName="numero", unique = false, nullable = true, insertable = true, updatable = true)
    private FidSolicitante solicitante;

    @ManyToOne(cascade = {},targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidRendimiento rendimiento;

    @Column(name = "monto_apertura", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoApertura;

    @Column(name = "monto_saldo", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoSaldo;

    @Column(name = "estatus", unique = false, nullable = true, insertable = true, updatable = true)
    private String estatus;

    @Column(name = "fecha_cierre", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaCierre;

    @Column(name = "fecha_apertura", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaApertura;

    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;

    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;

    @Id
    @Column(name = "contrato_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fidContratoIdSec")
    private Integer contratoId;

    @Column(name = "sucursal", unique = false, nullable = true, insertable = true, updatable = true)
    private String sucursal;

    @Column(name = "monto_credito", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoCredito;

    @Column(name = "folio_constancia", unique = false, nullable = true, insertable = true, updatable = true)
    private String folioConstancia;



}
