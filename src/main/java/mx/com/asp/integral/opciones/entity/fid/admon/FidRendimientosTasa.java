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
@Table(name = "fid_rendimientos_tasa", schema = "public")
@SequenceGenerator(name = "FidRendimientoTasaSec",sequenceName = "fid_rendimientos_tasa_rendimiento_tasa_id_seq", allocationSize = 1)
public class FidRendimientosTasa {

    @Id
    @Column(name = "rendimiento_tasa_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidRendimientoTasaSec")
    private Integer rendimientoTasaId;
    @Column(name = "monto_min", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoMin;
    @Column(name = "monto_max", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoMax;
    @Column(name = "tasa_10",  unique = false, nullable = true, insertable = true, updatable = true)
    private Double tasa10;
    @Column(name = "tasa_15",  unique = false, nullable = true, insertable = true, updatable = true)
    private Double tasa15;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rendimientoTasaId != null ? rendimientoTasaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidRendimientosTasa)) {
            return false;
        }
        FidRendimientosTasa other = (FidRendimientosTasa) object;
        if ((this.rendimientoTasaId == null && other.rendimientoTasaId != null) || (this.rendimientoTasaId != null && !this.rendimientoTasaId.equals(other.rendimientoTasaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.FidRendimientosTasa[rendimientoTasaId=" + rendimientoTasaId + "]";
    }




}
