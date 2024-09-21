package mx.com.asp.integral.opciones.entity.plataforma.seguridad;

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
@Table(name = "menus", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name ="menuSeq", sequenceName="menu_seq", allocationSize = 1)
public class Menu {

    @Id
    @Column(name = "menu_id", unique = true, nullable = false, insertable = true, updatable = true)
    private Short menuId;

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER, targetEntity=Aplicacion.class)
    @JoinColumn(name = "aplicacion_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Aplicacion aplicaciones;

    @Column(name = "menu", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String menu;

    @Column(name = "descripcion", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    private String descripcion;

    @Column(name = "creado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Short creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = false, insertable = true, updatable = true, length = 29)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = false, insertable = true, updatable = true)
    private Short modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = false, insertable = true, updatable = true, length = 29)
    private Date fechaModificacion;

    public Menu(Short menuId, String menu, String descripcion,
                Short creadoPor, Date fechaCreacion, Short modificadoPor,
                Date fechaModificacion) {
        this.menuId = menuId;
        this.menu = menu;
        this.descripcion = descripcion;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.modificadoPor = modificadoPor;
        this.fechaModificacion = fechaModificacion;
    }

}
