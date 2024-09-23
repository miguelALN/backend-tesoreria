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
@Table(name = "fid_retenciones_apertura_contrato")
@SequenceGenerator(name = "fidRetencionAperturaContratoIdSec" , sequenceName = "fid_retenciones_apertura_cont_retencion_apertura_contrato_i_seq", allocationSize = 1)
public class FidRetencionAperturaContrato {

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private FidRendimiento rendimientoId;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidTipoMovimiento.class)
    //@JoinColumn(name = "tipo_movimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    //private FidTipoMovimiento tipoMovimientoId;
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
    @Column(name = "retencion_apertura_contrato_id",unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fidRetencionAperturaContratoIdSec")
    private Integer retencionAperturaContratoId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    private FidContrato numContrato;

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidRetencionAperturaContrato)) {
            return false;
        }
        FidRetencionAperturaContrato other = (FidRetencionAperturaContrato) object;
        if ((this.retencionAperturaContratoId == null && other.retencionAperturaContratoId != null) || (this.retencionAperturaContratoId != null && !this.retencionAperturaContratoId.equals(other.retencionAperturaContratoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidRetencionAperturaContrato[retencionAperturaContratoId=" + retencionAperturaContratoId + "]";
    }
}
