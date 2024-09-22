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
public class Juicio {

    @Id
    @Column(name = "juicio_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "juicioSeq")
    private Long id;
    // @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Contrato.class)
    //@JoinColumn(name = "control", unique = false, nullable = false, insertable = true, updatable = true)
    //private Contrato contrato;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Juzgado.class)
    //@JoinColumn(name = "juzgado_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private Juzgado juzgado;
    @Column(name = "expediente", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String expediente;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=ConValores.class)
    //@JoinColumn(name = "tipo_juicio", unique = false, nullable = false, insertable = true, updatable = true)
    //private ConValores tipoJuicio;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Localidades.class)
    //@JoinColumn(name = "localidad_demanda_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private Localidades localidad;

    @Column(name = "fecha_demanda", unique = false, nullable = false, insertable = true, updatable = true)
    private Date fechaDemanda;
    @Column(name = "monto_demanda", unique = false, nullable = false, insertable = true, updatable = true)
    private BigDecimal montoDemanda;
    @Column(name = "estatus", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String estatus;
    @Column(name = "observaciones", unique = false, nullable = true, insertable = true, updatable = true)
    private String observaciones;
    @Column(name = "sentencia", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String sentencia;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=JuicioCuatrimestre.class)
    //@JoinColumn(name = "juicios_cuatrimestre_id", unique = false, nullable = true, insertable = true, updatable = true)
    //private JuicioCuatrimestre juicioCuatrimestreId;

    private Long creadoPor;
    private Date fechaCreacion;
    private Long modificadoPor;
    private Date fechaModificacion;
   // private TipoGarantia tipoGarantiaAplicada;
    private Date fechaAplicacionGarantia;
    //private JuicioCuatrimestre juicioCuatrimestreGarantia;

}
