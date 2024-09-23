package mx.com.asp.integral.opciones.entity.juridico;


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

@Table(name = "juicios_cuatrimestre", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "juiciosCuatrimestreSeq" , sequenceName = "juicios_cuatrimestre_juicios_cuatrimestre_id_seq", allocationSize = 1)
public class JuicioCuatrimestre {
    @Id
    @Column(name = "juicios_cuatrimestre_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "juiciosCuatrimestreSeq")
    private Long juicioCuatrimestreId;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaModificacion;
    @Column(name = "cuatrimestre", unique = false, nullable = false, insertable = true, updatable = true, length = 254)
    private String cuatrimestre;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicial", unique = false, nullable = false, insertable = true, updatable = true, length = 13)
    private Date fechaInicial;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_final", unique = false, nullable = false, insertable = true, updatable = true, length = 13)
    private Date fechaFinal;


}
