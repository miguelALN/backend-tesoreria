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
@Table(name = "pla_envio_documentos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="plaEnvioDocumentoSec", sequenceName="pla_envio_documentos_envio_documento_id_seq", allocationSize = 1)
public class PlaEnvioDocumentos {
    @Id
    @Column(name = "envio_documento_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="plaEnvioDocumentoSec")
    private Integer envioDocumentoId;
    @OneToOne(cascade = {}, targetEntity = PlaClientes.class)
    @JoinColumn(name = "cliente_id", unique = false, nullable = true, insertable = true, updatable = true)
    private PlaClientes plaCliente;
    @OneToOne(cascade = {}, targetEntity = PlaDocumentos.class)
    @JoinColumn(name = "documento_id", unique = false, nullable = true, insertable = true, updatable = true)
    private PlaDocumentos plaDocumento;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_envio", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaEnvio;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

}
