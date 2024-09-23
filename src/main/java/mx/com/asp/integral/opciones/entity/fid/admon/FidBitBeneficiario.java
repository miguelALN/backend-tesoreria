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
@Table(name = "fid_bit_beneficiarios")
public class FidBitBeneficiario {
    @Column(name = "bit_version",unique = false, nullable = true, insertable = true, updatable = true)
    private Short bitVersion;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    private String numContrato;
    @Column(name = "solicitante_id",unique = false, nullable = true, insertable = true, updatable = true)
    private String solicitanteId;
    @Column(name = "relacion_id",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer relacionId;
    @Column(name = "porcentaje",unique = false, nullable = true, insertable = true, updatable = true)
    private Double porcentaje;
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
    @Column(name = "bit_beneficiario_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer bitBeneficiarioId;

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidBitBeneficiario)) {
            return false;
        }
        FidBitBeneficiario other = (FidBitBeneficiario) object;
        if ((this.bitBeneficiarioId == null && other.bitBeneficiarioId != null) || (this.bitBeneficiarioId != null && !this.bitBeneficiarioId.equals(other.bitBeneficiarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidBitBeneficiario[bitBeneficiarioId=" + bitBeneficiarioId + "]";
    }



}
