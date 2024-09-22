package mx.com.asp.integral.opciones.entity.juridico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
//Cambio
@Entity
@Table(name = "doctos_digitalizado", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "doctosDigitalizadoSeq" , sequenceName = "doctos_digitalizado_doctos_digitalizado_id_seq", allocationSize = 1)
public class DocumentoRegistroEtapaProcesal
{
    @Id
    @Column(name = "doctos_digitalizado_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctosDigitalizadoSeq")
    private Long doctosDigitalizadoId;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaModificacion;
    @Column(name = "id_lista_docto", unique = false, nullable = false, insertable = true, updatable = true, length = 254)
    private Long listaDocto;
    @Column(name = "id", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long doctoFtp;
    @Column(name = "referencia", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private String referencia;
    @Column(name = "tipo", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private String tipo;
    @Column(name = "observaciones", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private String observaciones;
    @Column(name = "extension", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private String extension;
}
