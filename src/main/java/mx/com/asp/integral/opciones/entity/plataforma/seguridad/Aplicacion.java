package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aplicaciones", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="aplicacionesS", sequenceName="aplicaciones_s", allocationSize = 1)
public class Aplicacion {

    @Id
    @Column(name = "aplicacion_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aplicacionesS")
    private Integer aplicacionId;

    @Column(name = "aplicacion", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String aplicacion;

    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 29)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 29)
    private Date fechaModificacion;

    @Column(name = "ruta", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String ruta;

    @Column(name = "reportes", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String reportes;

    @Column(name = "binarios", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String binarios;

    @Column(name = "sql", unique = false, nullable = true, insertable = true, updatable = true)
    private String sql;

    @Column(name = "imagenes", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String imagenes;


    public Aplicacion(Integer aplicacionId) {
        this.aplicacionId = aplicacionId;
    }

    public Aplicacion(Integer aplicacionId, String aplicacion,
                      Integer creadoPor, Date fechaCreacion, Integer modificadoPor,
                      Date fechaModificacion, String ruta, String reportes,
                      String binarios, String sql) {
        this.aplicacionId = aplicacionId;
        this.aplicacion = aplicacion;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.modificadoPor = modificadoPor;
        this.fechaModificacion = fechaModificacion;
        this.ruta = ruta;
        this.reportes = reportes;
        this.binarios = binarios;
        this.sql = sql;
    }

    @Override
    public String toString(){
        return this.aplicacion;
    }
}
