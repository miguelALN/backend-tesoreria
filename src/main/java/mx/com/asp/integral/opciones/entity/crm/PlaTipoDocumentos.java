package mx.com.asp.integral.opciones.entity.crm;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pla_tipo_documentos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="plaTipoDocumentoSec", sequenceName="pla_tipo_documento_tipo_documento_id_seq")
public class PlaTipoDocumentos {
    @Id
    @Column(name = "tipo_documento_id", unique = true, nullable = false, insertable = true, updatable = true)
    private Integer tipoDocumentoId;
    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String nombre;
    @Column(name = "descripcion", unique = false, nullable = true, insertable = true, updatable = true)
    private String descripcion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Integer creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer fechaModificacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date modificadoPor;


}
