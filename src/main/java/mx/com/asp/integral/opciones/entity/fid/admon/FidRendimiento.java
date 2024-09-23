package mx.com.asp.integral.opciones.entity.fid.admon;


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
@Table(name = "fid_rendimientos",schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "FidRendimientoSec" , sequenceName = "fid_rendimientos_rendimiento_id_seq", allocationSize = 1 )
public class FidRendimiento {

    @ManyToOne(cascade = {},targetEntity = FidCatFideicomiso.class)
    @JoinColumn(name = "fideicomiso_id", referencedColumnName="fideicomiso_id", unique = false, nullable = true, insertable = true, updatable = true)
    private FidCatFideicomiso fidCatFideicomiso;
    @Column(name = "plazo", unique = false, nullable = true, insertable = true, updatable = true)
    private String plazo;
    @Column(name = "tipo_tasa", unique = false, nullable = true, insertable = true, updatable = true)
    private String tipoTasa;
    @Column(name = "calculo_iva", unique = false, nullable = true, insertable = true, updatable = true)
    private String calculoIva;
    @Column(name = "tasa_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer tasaId;
    @Column(name = "base", unique = false,nullable = true, insertable = true, updatable = true)
    private Integer base;
    @Column(name = "formula", unique = false,nullable = true, insertable = true, updatable = true)
    private String formula;
    @Column(name = "tipo_corte", unique = false,nullable= true, insertable = true, updatable = true)
    private String tipoCorte;
    @Column(name ="num_dias", unique = false,nullable = true, insertable = true, updatable = true)
    private Integer numDias;
    @Column(name = "vigencia_desde", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date vigenciaDesde;
    @Column(name = "vigencia_hasta", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date vigenciaHasta;
    @Column(name = "condiciones_retiro", unique = false, nullable = true, insertable = true, updatable = true)
    private String condicionesRetiro;
    @Column(name = "condiciones_apertura", unique = false, nullable = true, insertable = true, updatable = true)
    private String condicionesApertura;
    @Column(name="creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaModificacion;
    @Id
    @Column(name = "rendimiento_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FidRendimientoSec")
    private int rendimientoId;
    @Column(name = "tasa", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double tasa;


}
