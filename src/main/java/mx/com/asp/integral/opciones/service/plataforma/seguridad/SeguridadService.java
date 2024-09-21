package mx.com.asp.integral.opciones.service.plataforma.seguridad;

import mx.com.asp.integral.opciones.dto.plataforma.seguridad.AccesoDto;
import mx.com.asp.integral.opciones.entity.plataforma.seguridad.Acceso;

import java.util.List;

public interface SeguridadService {
    List<AccesoDto> consultarAllAccesos();
}
