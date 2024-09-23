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
@Table(name = "pla_documentos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="pla_documentos_sec", sequenceName="pla_documentos_documentos_id_seq", allocationSize = 1)
public class PlaDocumentos {

    @Id
    @Column(name = "documentos_id", columnDefinition="integer", unique = true, nullable = false, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pla_documentos_sec")
    private Integer documentosId;
    @ManyToOne(cascade = {}, targetEntity = PlaTipoDocumentos.class)
    @JoinColumn(name = "tipo_documento_id", unique = false, nullable = true, insertable = true, updatable = true)
    private PlaTipoDocumentos plaTipoDocumentos;
    @ManyToOne(cascade = {}, targetEntity = PlaVersiones.class)
    @JoinColumn(name = "version_id", unique = false, nullable = true, insertable = true, updatable = true)
    private PlaVersiones plaVersiones;
    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String nombre;
    @Column(name = "descripcion", unique = false, nullable = true, insertable = true, updatable = true)
    private String descripcion;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;
}
