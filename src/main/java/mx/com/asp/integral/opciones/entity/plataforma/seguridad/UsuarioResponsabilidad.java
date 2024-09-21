package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "usuario_responsabilidad", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="usuarioResponsabilidadesSec", sequenceName="usuario_responsabilidad_usuario_responsabilidad_id_seq", allocationSize = 1)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponsabilidad {

    @Id
    @Column(name = "usuario_responsabilidad_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="usuarioResponsabilidadesSec")
    private Integer usuarioResponsabilidadId;

    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Integer creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Integer modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(unique = false, nullable = false, insertable = true, updatable = true)
    private Date fecha_term;

    @ManyToOne(cascade = {}, fetch=FetchType.EAGER, targetEntity=Usuario.class)
    @JoinColumn(name="usuario_id", referencedColumnName="usuario_id", unique = false, nullable = false, insertable = true, updatable = true)
    private Usuario usuario;

    @ManyToOne(cascade = {}, fetch=FetchType.LAZY, targetEntity=Responsabilidad.class)
    @JoinColumn(name="responsabilidad_id", referencedColumnName="responsabilidad_id", unique=false, nullable=false, insertable = true,  updatable=true)
    private Responsabilidad responsabilidad;

    public UsuarioResponsabilidad(Integer usuarioResponsabilidadId, Integer creadoPor,  Date fechaCreacion,
                                   Integer modificadoPor, Date fechaModificacion,  Usuario usuario,  Responsabilidad responsabilidad) {
        this.usuarioResponsabilidadId = usuarioResponsabilidadId;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.modificadoPor = modificadoPor;
        this.fechaModificacion = fechaModificacion;
        this.usuario = usuario;
        this.responsabilidad = responsabilidad;
    }

}
