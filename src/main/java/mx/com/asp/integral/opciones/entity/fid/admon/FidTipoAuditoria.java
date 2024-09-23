package mx.com.asp.integral.opciones.entity.fid.admon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fid_tipos_auditoria")
public class FidTipoAuditoria {
    @Column(name = "descripcion")
    private String descripcion;
    @Id
    @Column(name = "tipo_auditoria_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer tipoAuditoriaId;
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidTipoAuditoria)) {
            return false;
        }
        FidTipoAuditoria other = (FidTipoAuditoria) object;
        if ((this.tipoAuditoriaId == null && other.tipoAuditoriaId != null) || (this.tipoAuditoriaId != null && !this.tipoAuditoriaId.equals(other.tipoAuditoriaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidTipoAuditoria[tipoAuditoriaId=" + tipoAuditoriaId + "]";
    }
}
