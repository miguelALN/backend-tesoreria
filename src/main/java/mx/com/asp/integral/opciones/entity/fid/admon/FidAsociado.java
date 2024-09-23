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
@Table(name = "fid_asociados")
public class FidAsociado {
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    //@JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    //private String numContrato;
    @Column(name = "solicitante_id",unique = false, nullable = true, insertable = true, updatable = true)
    private String solicitanteId;
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
    @Column(name = "asociado_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer asociadoId;
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidAsociado)) {
            return false;
        }
        FidAsociado other = (FidAsociado) object;
        if ((this.asociadoId == null && other.asociadoId != null) || (this.asociadoId != null && !this.asociadoId.equals(other.asociadoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidAsociado[asociadoId=" + asociadoId + "]";
    }
}
