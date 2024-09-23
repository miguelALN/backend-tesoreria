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
@Table(name = "fid_bitacoras")
public class FidBitacora {
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    //@JoinColumn(name = "num_contrato",unique = false, nullable = true, insertable = true, updatable = true)
    //private String numContrato;
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
    @Column(name = "tasa",unique = false, nullable = true, insertable = true, updatable = true)
    private Double tasa;
    @Column(name = "fecha_creacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion",unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Column(name = "cuenta_destino",unique = false, nullable = true, insertable = true, updatable = true)
    private String cuentaDestino;
    @Id
    @Column(name = "bitacora_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer bitacoraId;


}
