package mx.com.asp.integral.opciones.util;

import javax.annotation.processing.Generated;
import mx.com.asp.integral.opciones.dto.plataforma.seguridad.AccesoDto;
import mx.com.asp.integral.opciones.entity.plataforma.seguridad.Acceso;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-23T10:57:56-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
@Component
public class GeneralMapperImpl implements GeneralMapper {

    @Override
    public AccesoDto accesoEntityToAccesoDto(Acceso accesoEntity) {
        if ( accesoEntity == null ) {
            return null;
        }

        AccesoDto.AccesoDtoBuilder accesoDto = AccesoDto.builder();

        accesoDto.accesoId( accesoEntity.getAccesoId() );
        accesoDto.computadora( accesoEntity.getComputadora() );
        accesoDto.inicio( accesoEntity.getInicio() );
        accesoDto.terminacion( accesoEntity.getTerminacion() );
        accesoDto.ipEquipo( accesoEntity.getIpEquipo() );

        return accesoDto.build();
    }
}
