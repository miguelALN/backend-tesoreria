package mx.com.asp.integral.opciones.entity.catalogo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "area", schema = "catalogos")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Area {
    private Integer catAreasId;
    private String descripcion;
    private Short creadoPor;
    private Date fechaCreacion;
    private Short modificadoPor;
    private Date fechaModificacion;
    private Integer responsableId;
    //private Regiones regionId;
    private Integer segmento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_areas_id", nullable = false)
    private Long idArea;
}
