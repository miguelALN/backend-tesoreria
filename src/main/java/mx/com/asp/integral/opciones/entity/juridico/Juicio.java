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
@Table(name = "juicios", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="juicioSeq", sequenceName="juicios_juicio_id_seq", allocationSize = 1)
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
    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true, precision = 6)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

    /*
    public Juicio clone(){
        Juicio tmp = new Juicio();
        tmp.setId(this.id);
        tmp.setContrato(this.contrato);
        tmp.setJuzgado(this.juzgado);
        tmp.setExpediente(this.expediente);
        tmp.setTipoJuicio(this.tipoJuicio);
        tmp.setLocalidad(this.localidad);
        tmp.setFechaDemanda(this.fechaDemanda);
        tmp.setMontoDemanda(this.montoDemanda);
        tmp.setEstatus(this.estatus);
        tmp.setObservaciones(this.observaciones);
        tmp.setSentencia(this.sentencia);
        tmp.setJuicioCuatrimestreId(this.juicioCuatrimestreId);
        tmp.setCreadoPor(this.creadoPor);
        tmp.setFechaCreacion(this.fechaCreacion);
        tmp.setModificadoPor(this.modificadoPor);
        tmp.setFechaModificacion(this.fechaModificacion);

        return tmp;
    }
    */
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=TipoGarantia.class)
    //@JoinColumn(name = "tipo_garantia_aplicada_id", unique = false, nullable = true, insertable = true, updatable = true)
   // private TipoGarantia tipoGarantiaAplicada;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_aplicacion_garantia", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaAplicacionGarantia;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=JuicioCuatrimestre.class)
    //@JoinColumn(name = "juicios_cuatrimestre_garantia_id", unique = false, nullable = true, insertable = true, updatable = true)
    //private JuicioCuatrimestre juicioCuatrimestreGarantia;

}
