package mx.com.asp.integral.opciones.service.plataforma.seguridad.impl;

import lombok.AllArgsConstructor;
import mx.com.asp.integral.opciones.dto.plataforma.seguridad.AccesoDto;
import mx.com.asp.integral.opciones.repository.plataforma.seguridad.AccesoRepository;
import mx.com.asp.integral.opciones.service.plataforma.seguridad.SeguridadService;
import mx.com.asp.integral.opciones.util.GeneralMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
@Transactional
public class SeguridadServiceImpl implements SeguridadService {

    private final AccesoRepository accesoRepository;
    private final GeneralMapper mapper;

    @Override
    public List<AccesoDto> consultarAllAccesos() {
         return StreamSupport.stream(accesoRepository.findAll().spliterator(), false)
                .map(mapper::accesoEntityToAccesoDto)
                .toList();
    }
}
