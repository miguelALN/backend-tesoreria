package mx.com.asp.integral.opciones.entity.plataforma;

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
@Table(name = "layout_estructura", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name = "layoutEstructuraSeq", sequenceName = "layout_estructura_layout_estructura_id_seq", allocationSize = 1)
public class LayoutEstructura
{

    // Property accessors
    @Id
    @Column(name = "layout_estructura_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="layoutEstructuraSeq")
    private Long layoutEstructuraId;
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER, targetEntity = Layout.class)
    @JoinColumn(name = "layout_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Layout layoutPadre;
    @Column(name = "campo", unique = false, nullable = false, insertable = true, updatable = true)
    private String campo;
    @Column(name = "posicion_inicial", unique = false, nullable = false, insertable = true, updatable = true, precision = 50, scale = 0)
    private Long posicionInicial;
    @Column(name = "posicion_final", unique = false, nullable = true, insertable = true, updatable = true, precision = 50, scale = 0)
    private Long posicionFinal;
    @Column(name = "cortar_del", unique = false, nullable = true, insertable = true, updatable = true, precision = 50, scale = 0)
    private Long cortarDel;
    @Column(name = "cortar_al", unique = false, nullable = true, insertable = true, updatable = true, precision = 50, scale = 0)
    private Long cortarAl;
    @Column(name = "formato", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String formato;
    @Column(name = "no_decimales", unique = false, nullable = true, insertable = true, updatable = true, precision = 2, scale = 0)
    private Long noDecimales;
    @Column(name = "tipo", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String tipo;
    @Column(name = "grupo_valor_id", unique = false, nullable = true, insertable = true, updatable = true, precision = 5, scale = 0)
    private Long grupoValorId;
    @Column(name = "orden", unique = false, nullable = true, insertable = true, updatable = true, precision = 5, scale = 0)
    private Long orden;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Date fechaModificacion;
}
