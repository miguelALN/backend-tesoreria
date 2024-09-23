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
@Table(name = "fid_movimientos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidMovimientoSec", sequenceName = "fid_movimientos_movimiento_id_seq", allocationSize = 1)
public class FidMovimiento {

    @Id
    @Column(name = "movimiento_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidMovimientoSec")
    private Integer movimientoId;
    //@ManyToOne(cascade = {}, fetch = FetchType.LAZY,targetEntity = FidTipoMovimiento.class)
    //@JoinColumn(name = "tipo_movimiento_id", unique = false, nullable = true, insertable = true, updatable = true)
    //private FidTipoMovimiento fidTipoMovimiento;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidContrato.class)
    @JoinColumn(name = "num_contrato",referencedColumnName = "num_contrato", unique = false, nullable = true, insertable = true, updatable = true)
    public FidContrato getFidContrato() {
        return this.fidContrato;
    }
    private FidContrato fidContrato;
    @Column(name = "banco_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Long bancoId;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_mov", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date fechaMov;
    @Column(name = "monto", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double monto;
    @Column(name = "atributo01", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo01;
    @Column(name = "atributo02", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo02;
    @Column(name = "atributo03", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo03;
    @Column(name = "atributo04", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo04;
    @Column(name = "atributo05", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String atributo05;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date fechaCreacion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date fechaModificacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;



}
