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
@Table(name = "fid_bit_autoriza")
public class FidBitAutoriza {

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    private String numContrato;
    @Column(name = "usuario_aut",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer usuarioAut;
    @Column(name = "tipo",unique = false, nullable = true, insertable = true, updatable = true)
    private String tipo;
    @Column(name = "fecha_mov",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMov;
    @Column(name = "creado_por",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Column(name = "fecha_creacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "habilita_des",unique = false, nullable = true, insertable = true, updatable = true)
    private String habilitaDes;
    @Column(name = "monto",unique = false, nullable = true, insertable = true, updatable = true)
    private Double monto;
    @Column(name = "nombre_pc",unique = false, nullable = true, insertable = true, updatable = true)
    private String nombrePc;
    @Id
    @Column(name = "bit_autoriza_id",unique = false, nullable = true, insertable = true, updatable = true)
    private Integer bitAutorizaId;
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidBitAutoriza)) {
            return false;
        }
        FidBitAutoriza other = (FidBitAutoriza) object;
        if ((this.bitAutorizaId == null && other.bitAutorizaId != null) || (this.bitAutorizaId != null && !this.bitAutorizaId.equals(other.bitAutorizaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidBitAutoriza[bitAutorizaId=" + bitAutorizaId + "]";
    }


}
