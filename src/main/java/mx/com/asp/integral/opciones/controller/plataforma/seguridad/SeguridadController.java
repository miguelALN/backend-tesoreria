package mx.com.asp.integral.opciones.controller.plataforma.seguridad;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.com.asp.integral.opciones.dto.plataforma.seguridad.AccesoDto;
import mx.com.asp.integral.opciones.service.plataforma.seguridad.SeguridadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@CrossOrigin(
        origins = "*",
        allowedHeaders = "*",
        methods = {RequestMethod.GET},
        maxAge = -1
)
@RestController
@RequestMapping("/plataforma/seguridad")
public class SeguridadController {

    private final SeguridadService seguridadService;

    public ResponseEntity<List<AccesoDto>> consultar() {
        return new ResponseEntity<>(seguridadService.consultarAllAccesos(), HttpStatus.OK);
    }
}
