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
@Table(name = "fid_saldos")
public class FidSaldo {

    @JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    private String numContrato;
    @Column(name = "solicitante_id",unique = false, nullable = true, insertable = true, updatable = true)
    private String solicitanteId;
    @Column(name = "saldo_real",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoReal;
    @Column(name = "saldo_promedio",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoPromedio;
    @Column(name = "saldo_acumulado",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoAcumulado;
    @Column(name = "fecha_corte",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaCorte;
    @Column(name = "fecha_deposito",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaDeposito;
    @Column(name = "intereses",unique = false, nullable = true, insertable = true, updatable = true)
    private Double intereses;
    @Column(name = "iva",unique = false, nullable = true, insertable = true, updatable = true)
    private Double iva;
    @Column(name = "isr",unique = false, nullable = true, insertable = true, updatable = true)
    private Double isr;
    @Column(name = "retenciones",unique = false, nullable = true, insertable = true, updatable = true)
    private Double retenciones;
    @Column(name = "desviacion",unique = false, nullable = true, insertable = true, updatable = true)
    private Double desviacion;
    @Column(name = "dias",unique = false, nullable = true, insertable = true, updatable = true)
    private Short dias;
    @Column(name = "saldo_disponible",unique = false, nullable = true, insertable = true, updatable = true)
    private Double saldoDisponible;
    @Id
    @Column(name = "saldo_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer saldoId;
    @Override

    public boolean equals(Object object) {
        if (!(object instanceof FidSaldo)) {
            return false;
        }
        FidSaldo other = (FidSaldo) object;
        if ((this.saldoId == null && other.saldoId != null) || (this.saldoId != null && !this.saldoId.equals(other.saldoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidSaldo[saldoId=" + saldoId + "]";
    }
}
