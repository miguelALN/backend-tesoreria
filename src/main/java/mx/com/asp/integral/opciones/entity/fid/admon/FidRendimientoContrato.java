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
@Table(name = "fid_rendimientos_contratos", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = { "num_contrato" }) })
@SequenceGenerator(name = "FidRendimientoContratoSec",sequenceName = "fid_rendimientos_contratos_rendimiento_contrato_id_seq", allocationSize = 1)
public class FidRendimientoContrato {
    @Id
    @Column(name = "rendimiento_contrato_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidRendimientoContratoSec")
    private Integer rendimientoContratoId;
    @ManyToOne(cascade = {}, fetch = FetchType.LAZY,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato", referencedColumnName="num_contrato", unique = true, nullable = false, insertable = true, updatable = true)
    private FidContrato fidContrato;
    @Column(name = "plazo", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String plazo;
    @Column(name = "tipo_tasa", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String tipoTasa;
    @Column(name = "calculo_iva", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String calculoIva;
    @Column(name = "tasa_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer tasaId;
    @Column(name = "base", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer base;
    @Column(name = "formula", unique = false, nullable = true, insertable = true, updatable = true)
    private String formula;
    private String tipoCorte;
    @Column(name = "num_dias", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer numDias;
    @Temporal(TemporalType.DATE)
    @Column(name = "vigencia_desde", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date vigenciaDesde;
    @Temporal(TemporalType.DATE)
    @Column(name = "vigencia_hasta", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date vigenciaHasta;
    @Column(name = "condiciones_retiro", unique = false, nullable = true, insertable = true, updatable = true)
    private String condicionesRetiro;
    @Column(name = "condiciones_apertura", unique = false, nullable = true, insertable = true, updatable = true)
    private String condicionesApertura;
    @Column(name = "costo_admon", unique = false, nullable = true, insertable = true, updatable = true)
    private Double costoAdmon;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaModificacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "tasa", unique = false, nullable = true, insertable = true, updatable = true)
    private Double tasa;
}
