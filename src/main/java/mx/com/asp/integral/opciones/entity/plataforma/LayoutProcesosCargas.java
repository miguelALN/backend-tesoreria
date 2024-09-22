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
    @Column(name = "campo2", length = 256)
    private String campo2;
    @Column(name = "campo3", length = 256)
    private String campo3;
    @Column(name = "campo4", length = 256)
    private String campo4;
    @Column(name = "campo5", length = 256)
    private String campo5;
    @Column(name = "campo6", length = 256)
    private String campo6;
    @Column(name = "campo7", length = 256)
    private String campo7;
    @Column(name = "campo8", length = 256)
    private String campo8;
    @Column(name = "campo9", length = 256)
    private String campo9;
    @Column(name = "campo10", length = 256)
    private String campo10;
    @Column(name = "campo11", length = 256)
    private String campo11;
    @Column(name = "campo12", length = 256)
    private String campo12;
    @Column(name = "campo13", length = 256)
    private String campo13;
    @Column(name = "campo14", length = 256)
    private String campo14;
    @Column(name = "campo15", length = 256)
    private String campo15;
    @Column(name = "campo16", length = 256)
    private String campo16;
    @Column(name = "campo17", length = 256)
    private String campo17;
    @Column(name = "campo18", length = 256)
    private String campo18;
    @Column(name = "campo19", length = 256)
    private String campo19;
    @Column(name = "campo20", length = 256)
    private String campo20;
    @Column(name = "campo21", length = 256)
    private String campo21;
    @Column(name = "campo22", length = 256)
    private String campo22;
    @Column(name = "campo23", length = 256)
    private String campo23;
    @Column(name = "campo24", length = 256)
    private String campo24;
    @Column(name = "campo25", length = 256)
    private String campo25;
    @Column(name = "campo26", length = 256)
    private String campo26;
    @Column(name = "campo27", length = 256)
    private String campo27;
    @Column(name = "campo28", length = 256)
    private String campo28;
    @Column(name = "campo29", length = 256)
    private String campo29;
    @Column(name = "campo30", length = 256)
    private String campo30;
    @Column(name = "campo31", length = 256)
    private String campo31;
    @Column(name = "campo32", length = 256)
    private String campo32;
    @Column(name = "campo33", length = 256)
    private String campo33;
    @Column(name = "campo34", length = 256)
    private String campo34;
    @Column(name = "campo35", length = 256)
    private String campo35;
    @Column(name = "campo36", length = 256)
    private String campo36;
    @Column(name = "campo37", length = 256)
    private String campo37;
    @Column(name = "campo38", length = 256)
    private String campo38;
    @Column(name = "campo39", length = 256)
    private String campo39;
    @Column(name = "campo40", length = 256)
    private String campo40;
    @Column(name = "campo41", length = 256)
    private String campo41;
    @Column(name = "campo42", length = 256)
    private String campo42;
    @Column(name = "campo43", length = 256)
    private String campo43;
    @Column(name = "campo44", length = 256)
    private String campo44;
    @Column(name = "campo45", length = 256)
    private String campo45;
    @Column(name = "campo46", length = 256)
    private String campo46;
    @Column(name = "campo47", length = 256)
    private String campo47;
    @Column(name = "campo48", length = 256)
    private String campo48;
    @Column(name = "campo49", length = 256)
    private String campo49;
    @Column(name = "campo50", length = 256)
    private String campo50;
}
