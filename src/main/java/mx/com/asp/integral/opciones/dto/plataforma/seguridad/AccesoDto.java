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
public class AccesoDto {
    private Long accesoId;
    //private Usuarios usuarioId;
    private String computadora;
    private Date inicio;
    private Date terminacion;
    private String ipEquipo;
}
