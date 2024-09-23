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
@Table(name = "fid_edoscuenta")
public class FidEdoCuenta {

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    private String numContrato;
    @Column(name = "fecha_corte",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaCorte;
    @Column(name = "saldo_real",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoReal;
    @Column(name = "saldo_disponible",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoDisponible;
    @Column(name = "saldo_promedio",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoPromedio;
    @Column(name = "saldo_acumulado",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoAcumulado;
    @Column(name = "intereses",unique = false, nullable = true, insertable = true, updatable = true)
    private Double intereses;
    @Column(name = "iva",unique = false, nullable = true, insertable = true, updatable = true)
    private Double iva;
    @Column(name = "isr",unique = false, nullable = true, insertable = true, updatable = true)
    private Double isr;
    @Column(name = "retenciones",unique = false, nullable = true, insertable = true, updatable = true)
    private Double retenciones;
    @Column(name = "dias",unique = false, nullable = true, insertable = true, updatable = true)
    private Short dias;
    @Column(name = "mes",unique = false, nullable = true, insertable = true, updatable = true)
    private Short mes;
    @Column(name = "anio",unique = false, nullable = true, insertable = true, updatable = true)
    private Short anio;
    @Column(name = "fecha_creacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Id
    @Column(name = "edocuenta_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer edocuentaId;

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidEdoCuenta)) {
            return false;
        }
        FidEdoCuenta other = (FidEdoCuenta) object;
        if ((this.edocuentaId == null && other.edocuentaId != null) || (this.edocuentaId != null && !this.edocuentaId.equals(other.edocuentaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidEdoCuenta[edocuentaId=" + edocuentaId + "]";
    }
}
