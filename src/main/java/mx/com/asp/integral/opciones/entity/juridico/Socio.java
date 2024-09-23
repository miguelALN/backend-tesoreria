package mx.com.asp.integral.opciones.entity.juridico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "socios", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="sociosSeq", sequenceName="socios_socios_id_seq", allocationSize = 1)
public class Socio {

    @Id
    @Column(name = "socios_id", unique = true, nullable = false, insertable = true,updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="sociosSeq")
    private Long id;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitante.class)
    //@JoinColumn(name = "idsolicitante", unique = false, nullable = false, insertable = true, updatable = true)
    //private Solicitante solicitante;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Contrato.class)
    //@JoinColumn(name = "control", unique = false, nullable = false, insertable = true, updatable = true)
    //private Contrato control;
    @JoinColumn(name = "rfc", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc;
    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombre;
    @Column(name = "tipo", unique = false, nullable = true, insertable = true, updatable = true)
    private Long tipo;
    @Column(name = "monto", unique = false, nullable = true, insertable = true, updatable = true)
    private BigDecimal monto;
    @Column(name = "genero", unique = false, nullable = true, insertable = true, updatable = true)
    private String genero;
    @Column(name = "garante", unique = false, nullable = true, insertable = true, updatable = true)
    private String garante;
    @Column(name = "control_interno", unique = false, nullable = true, insertable = true, updatable = true)
    private String controlInterno;
    @Column(name = "subsidio", unique = false, nullable = true, insertable = true, updatable = true)
    private BigDecimal subsidio;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = false, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = false, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

}
