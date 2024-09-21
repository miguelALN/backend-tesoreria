package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.com.asp.integral.opciones.entity.cm.admon.Empleado;

import java.util.Date;

@Entity
@Table(name = "usuarios", schema = "public", uniqueConstraints = {})
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(name = "usuario_id", unique = true, nullable = false)
    private Integer usuarioId;

    @Column(name = "usuario", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String usuario;

    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true, length = 40)
    private String nombre;

    @Column(name = "puesto", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String puesto;

    @Column(name = "password", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_ini", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaIni;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_term", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaTerm;

    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

    @Column(name = "expirado", unique = false, nullable = true, insertable = true, updatable = true)
    private Short expirado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_cambio", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCambio;

    @ManyToOne(cascade = {}, fetch = FetchType.LAZY, targetEntity = Empleado.class)
    @JoinColumn(name = "no_empleado", unique = false, nullable = true, insertable = true, updatable = true)
    private Empleado noEmpleado;

    @Column(name = "bloqueado", unique = false, nullable = true, insertable = true, updatable = true)
    private Short bloqueado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ultimo_acceso", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date ultimoAcceso;

    @Column(name = "usuario_spark", unique = false, nullable = true, insertable = true, updatable = true, length = 40)
    private String usuarioSpark;

    @Transient
    private String userName;
    @Transient
    private String passName;
    @Transient
    private String idUserName;
    @Transient
    private String ipUser;
    @Transient
    private String idSesion;
    @Transient
    private String numEmpleado;
    @Transient
    private Integer estatus;

}
