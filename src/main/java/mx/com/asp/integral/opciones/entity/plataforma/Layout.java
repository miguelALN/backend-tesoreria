package mx.com.asp.integral.opciones.entity.plataforma;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "layout", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "layoutLayoutIdSeq", sequenceName = "layout_layout_id_seq", allocationSize = 1)
public class Layout {
    @Id
    @Column(name = "layout_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="layoutLayoutIdSeq")
    private Integer layoutId;
    @Column(name = "layout", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String layout;
    @Column(name = "tipo", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String tipo;
    @Column(name = "separador", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String separador;
    @Column(name = "adm_ejecutable_id", unique = false, nullable = true, insertable = true, updatable = true, precision = 10, scale = 0)
    private Long admEjecutableId;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
    private Date fechaModificacion;
    @Column(name = "num_omitir_cab", unique = false, nullable = true, insertable = true, updatable = true)
    private Long numOmitirCab;
    @Column(name = "num_omitir_pie", unique = false, nullable = true, insertable = true, updatable = true)
    private Long numOmitirPie;




}
