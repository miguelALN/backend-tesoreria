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
@Table(name = "cat_fideicomisos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "CatFideicomisoIdSec", sequenceName = "cat_fideicomisos_cat_fideicomiso_id_seq", allocationSize = 1)
public class FidCatFideicomiso {

    @Id
    @Column(name = "cat_fideicomiso_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CatFideicomisoIdSec")
    private int catFideicomisoId;
    @Column(name = "fideicomiso_id", unique = true, nullable = false, insertable = true, updatable = true)
    private String fideicomisoId;
    @Column(name = "fideicomiso_fecha", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fideicomisoFecha;
    @Column(name = "fifeicomitente", unique = false, nullable = true, insertable = true, updatable = true)
    private String fideicomitente;
    @Column(name = "id_cuenta", unique = false, nullable = true, insertable = true, updatable = true)
    private Long idCuenta;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaModificacion;

    private Double porcentaje;

    public Double getPorcentaje() {
        return porcentaje!=null ? porcentaje:0;
    }
}
