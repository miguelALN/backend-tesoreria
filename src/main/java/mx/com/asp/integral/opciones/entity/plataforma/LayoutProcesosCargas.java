package mx.com.asp.integral.opciones.entity.plataforma;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "layout_procesos_cargas", schema = "public")
public class LayoutProcesosCargas {
    @EmbeddedId
    @AttributeOverrides( {
            @AttributeOverride(name = "noLinea", column = @Column(name = "no_linea", nullable = false, precision = 10, scale = 0)),
            @AttributeOverride(name = "layoutProcesoId", column = @Column(name = "layout_proceso_id", nullable = false, precision = 10, scale = 0)) })
    private LayoutProcesosCargasId id;
    @ManyToOne(cascade={}, fetch = FetchType.EAGER, targetEntity = LayoutProcesos.class)
    @JoinColumn(name = "layout_proceso_id", columnDefinition="layout_proceso_id", nullable = false, insertable = false, updatable = false)
    private LayoutProcesos layoutProcesos;
    @Column(name = "campo1", length = 256)
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    private String campo6;
    private String campo7;
    private String campo8;
    private String campo9;
    private String campo10;
    private String campo11;
    private String campo12;
    private String campo13;
    private String campo14;
    private String campo15;
    private String campo16;
    private String campo17;
    private String campo18;
    private String campo19;
    private String campo20;
    private String campo21;
    private String campo22;
    private String campo23;
    private String campo24;
    private String campo25;
    private String campo26;
    private String campo27;
    private String campo28;
    private String campo29;
    private String campo30;
    private String campo31;
    private String campo32;
    private String campo33;
    private String campo34;
    private String campo35;
    private String campo36;
    private String campo37;
    private String campo38;
    private String campo39;
    private String campo40;
    private String campo41;
    private String campo42;
    private String campo43;
    private String campo44;
    private String campo45;
    private String campo46;
    private String campo47;
    private String campo48;
    private String campo49;
    private String campo50;

}
