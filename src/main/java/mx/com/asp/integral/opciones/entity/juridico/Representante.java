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
@Table(name = "representantes", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="representanteSeq", sequenceName="representantes_representantes_id_seq", allocationSize = 1)
public class Representante {


    @Id
    @Column(name = "representantes_id", unique = true, nullable = false, insertable = true,updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="representanteSeq")
    private Long id;
  //  @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitante.class)
   // @JoinColumn(name = "id_solicitante", unique = false, nullable = true, insertable = true, updatable = true)
   // private Solicitante solicitante;
   // @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Solicitante.class)
   // @JoinColumn(name = "id_representante", unique = false, nullable = true, insertable = true, updatable = true)
   // private Solicitante representante;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = false, precision = 6)
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
