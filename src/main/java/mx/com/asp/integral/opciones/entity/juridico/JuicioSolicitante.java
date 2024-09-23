package mx.com.asp.integral.opciones.entity.juridico;

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
@Table(name = "juicios_solicitantes", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="juicioSolicitantesSeq", sequenceName="juicios_solicitantes_seq", allocationSize = 1)
public class JuicioSolicitante {

    @Id
    @Column(name = "juicio_solicitante_id", unique = true, nullable = false, insertable = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="juicioSolicitantesSeq")
    private Long id;
//    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitante.class)
 //   @JoinColumn(name = "solicitante_id", unique = false, nullable = false, insertable = true, updatable = true)
 //   private Solicitante solicitanteId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Juicio.class)
    @JoinColumn(name = "juicio_id", unique = false, nullable = false, insertable = true, updatable = true)
    private Juicio juicioId;
   // @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=ConValores.class)
   // @JoinColumn(name = "responsabilidad_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private ConValores responsabilidadId;
    @Column(name = "seleccionado", unique = false, nullable = false, insertable = true, updatable = true)
    private Long seleccionado;
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = false, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true,  updatable = false, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true,precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;


}
