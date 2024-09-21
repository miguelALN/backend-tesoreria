package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

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
@Table(name = "accesos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "accesosIdSeq" , sequenceName = "accesos_id_seq", allocationSize = 1)
public class Acceso {

    @Id
    @Column(name = "acceso_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accesosIdSeq")
    private Long accesoId;

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER, targetEntity = Usuario.class)
    @JoinColumn(name = "usuario_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Usuario usuarioId;

    @Column(name = "computadora", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String computadora;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "inicio", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date inicio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "terminacion", unique = false, nullable = true, insertable = true, updatable = true, length = 8)
    private Date terminacion;

    @Column(name = "ip_equipo", unique = false, nullable = true, insertable = true, updatable = true, length = 16)
    private String ipEquipo;

}
