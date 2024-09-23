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
@Table(name = "fid_retenciones_corte_contrato")
@SequenceGenerator(name = "fidRetencionCorteContratoIdSec" , sequenceName = "fid_retenciones_corte_contrato_retencion_corte_contrato_id_seq", allocationSize = 1)
public class FidRetencionCorteContrato {

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private FidRendimiento rendimientoId;
    @ManyToOne(cascade = {}, fetch = FetchType.LAZY,targetEntity = FidTipoMovimiento.class)
    @JoinColumn(name = "tipo_movimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private FidTipoMovimiento tipoMovimientoId;
    @Column(name = "formula",unique = false, nullable = true, insertable = true, updatable = true)
    private String formula;
    @Column(name = "creado_por",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Column(name = "fecha_creacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "modificado_por",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "fecha_modificacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Id
    @Column(name = "retencion_corte_contrato_id",unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fidRetencionCorteContratoIdSec")
    private Integer retencionCorteContratoId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER, targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato", referencedColumnName="num_contrato", unique = false, nullable = true, insertable = true, updatable = true)
    private FidContrato numContrato;

}
