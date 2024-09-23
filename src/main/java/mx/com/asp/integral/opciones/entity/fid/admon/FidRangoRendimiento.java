package mx.com.asp.integral.opciones.entity.fid.admon;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fid_rangos_rendimiento")
public class FidRangoRendimiento {
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private int rendimientoId;
    @Column(name = "monto_min",unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoMin;
    @Column(name = "monto_max",unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoMax;
    @Column(name = "porcentaje",unique = false, nullable = true, insertable = true, updatable = true)
    private BigDecimal porcentaje;
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
    @Column(name = "rango_rendimiento_id",unique = true, nullable = false, insertable = true, updatable = true)
    private Integer rangoRendimientoId;


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidRangoRendimiento)) {
            return false;
        }
        FidRangoRendimiento other = (FidRangoRendimiento) object;
        if ((this.rangoRendimientoId == null && other.rangoRendimientoId != null) || (this.rangoRendimientoId != null && !this.rangoRendimientoId.equals(other.rangoRendimientoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.FidRangoRendimiento[rangoRendimientoId=" + rangoRendimientoId + "]";
    }
}
