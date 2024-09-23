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
@Table(name = "fid_costos_admon", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidCostoAdmonSec" , sequenceName = "fid_costos_admon_costo_admon_id_seq", allocationSize = 1)
public class FidCostoAdmon {

    @Id
    @Column(name = "costo_admon_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidCostoAdmonSec")
    private Integer costoAdmonId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidRendimiento fidRendimiento;
    @Column(name = "monto_min", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double montoMin;
    @Column(name = "monto_max", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double montoMax;
    @Column(name = "costo_admon", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double costoAdmon;
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
