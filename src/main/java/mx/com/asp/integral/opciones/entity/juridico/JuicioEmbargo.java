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
@Table(name = "jucios_embargos", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "juciosEmbargosJucioEmbargoSeq" , sequenceName = "jucios_embargos_jucio_embargo_id_seq", allocationSize = 1)
public class JuicioEmbargo {

    @Id
    @Column(name = "jucio_embargo_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "juciosEmbargosJucioEmbargoSeq")
    private Long id;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=Juicio.class)
    @JoinColumn(name = "juicio_id", unique = false, nullable = false, insertable = true, updatable = true)
    private Juicio juicio;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=EtapaProcesal.class)
    @JoinColumn(name = "etapa_procesal_id", unique = false, nullable = false, insertable = true, updatable = true)
    private EtapaProcesal etapaProcesal;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=TipoGarantia.class)
    //@JoinColumn(name = "tipo_garantia_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private TipoGarantia tipoGarantia;
    @Column(name = "garantia", unique = false, nullable = false, insertable = true, updatable = true)
    private String garantia;
    //@ManyToOne(cascade = {}, fetch = FetchType.EAGER , targetEntity=ConValores.class)
    //@JoinColumn(name = "depositario_id", unique = false, nullable = false, insertable = true, updatable = true)
    //private ConValores depositario;

    @Column(name = "observaciones", unique = false, nullable = false, insertable = true, updatable = true)
    private String observaciones;
    @Column(name = "valor", unique = false, nullable = true, insertable = true, updatable = true)
    private BigDecimal valor;
    @Column(name = "baja", unique = false, nullable = true, insertable = true, updatable = true)
    private Long baja;
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


}
