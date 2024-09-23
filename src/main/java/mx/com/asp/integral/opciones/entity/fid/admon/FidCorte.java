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
@Table(name = "fid_cortes")
public class FidCorte {
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private int rendimientoId;
    @Column(name = "fid_destino",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer fidDestino;
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
    @Column(name = "corte_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer corteId;

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidCorte)) {
            return false;
        }
        FidCorte other = (FidCorte) object;
        if ((this.corteId == null && other.corteId != null) || (this.corteId != null && !this.corteId.equals(other.corteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidCorte[corteId=" + corteId + "]";
    }

}
