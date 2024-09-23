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
@Table(name = "juzgado", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="juzgadoSeq", sequenceName="juzgado_seq", allocationSize = 1)
public class Juzgado {

    @Id
    @Column(name = "id", unique = true, nullable = false, insertable = true,updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="juzgadoSeq")
    private Long id;
    @Column(name = "nombre", unique = false, nullable = false, insertable = true, updatable = true, length = 150)
    private String nombre;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=ConValores.class)
    //@JoinColumn(name = "tipo_juzgado_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private ConValores tipoJuzgado;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Estatal.class)
    //@JoinColumn(name = "estado_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private Estatal estadoId;
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
