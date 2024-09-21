package mx.com.asp.integral.opciones.util;

import mx.com.asp.integral.opciones.dto.plataforma.seguridad.AccesoDto;
import mx.com.asp.integral.opciones.entity.plataforma.seguridad.Acceso;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface GeneralMapper {

    AccesoDto accesoEntityToAccesoDto(Acceso accesoEntity);
}
