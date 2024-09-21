package mx.com.asp.integral.opciones.dto.plataforma.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UsusarioDto {

    private Integer usuarioId;
    private String usuario;
    private String nombre;
    private String puesto;
    private String password;
    private Date fechaIni;
    private Date fechaTerm;
    private Short creadoPor;
    private Date fechaCreacion;
    private Short modificadoPor;
    private Date fechaModificacion;
    private Short expirado;
    private Date fechaCambio;
    //private Empleado noEmpleado;
    private Short bloqueado;
    private Date ultimoAcceso;
    private String usuarioSpark;
    private String userName;
    private String passName;
    private String idUserName;
    private String ipUser;
    private String idSesion;
    private String numEmpleado;
    private Integer estatus;

}
