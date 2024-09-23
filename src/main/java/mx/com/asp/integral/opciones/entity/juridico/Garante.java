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
@Table(name = "sol_garantes", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="garantesSeq", sequenceName="sol_garantes_sec_seq", allocationSize = 1)
public class Garante {

    @Id
    @Column(name = "sec", unique = true, nullable = false, insertable = true,updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="garantesSeq")
    private Long id;
   // @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitante.class)
    //@JoinColumn(name = "id_solicitante", unique = false, nullable = false, insertable = true, updatable = true)
    //private Solicitante solicitante;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Contrato.class)
    //@JoinColumn(name = "control", unique = false, nullable = false, insertable = true, updatable = true)
    //private Contrato control;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitudes.class)
    //@JoinColumn(name = "id_solicitud", unique = false, nullable = false, insertable = true, updatable = true)
    //private Solicitudes solicitud;
    @Column(name = "garantia", unique = false, nullable = false, insertable = true, updatable = true)
    private String garantia;
    @Column(name = "tipo_garantia_id", unique = false, nullable = false, insertable = true, updatable = true)
    private Long tipoGarantiaId;
    @Column(name = "valor", unique = false, nullable = false, insertable = true, updatable = true)
    private BigDecimal valor;
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
