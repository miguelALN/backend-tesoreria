package mx.com.asp.integral.opciones.entity.fid.admon.general;

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
@Table(name="fid_tipos_movimientos",schema="public", uniqueConstraints = {})
@SequenceGenerator(name="FidTipoMovimientoSec",sequenceName="fid_tipos_movimientos_tipo_movimiento_id_seq", allocationSize = 1)
public class FidTipoMovimiento {

    @Id
    @Column(name = "tipo_movimiento_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="FidTipoMovimientoSec")
    private int tipoMovimientoId;
    @Column(name = "descripcion", unique = false, nullable = true, insertable = true, updatable = true)
    private String descripcion;
    @Column(name = "operacion", unique = false ,nullable = false, insertable = true, updatable = true)
    private String operacion;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = true, nullable = false, insertable = true, updatable = true)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaModificacion;
}
