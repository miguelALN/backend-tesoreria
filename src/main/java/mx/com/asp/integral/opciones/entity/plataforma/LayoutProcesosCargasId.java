package mx.com.asp.integral.opciones.entity.plataforma;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class LayoutProcesosCargasId {

    @Column(name = "no_linea", nullable = false, precision = 10, scale = 0)
    private Long noLinea;
    @Column(name = "layout_proceso_id", nullable = false, precision = 10, scale = 0)
    private Long layoutProcesoId;

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof LayoutProcesosCargasId))
            return false;
        LayoutProcesosCargasId castOther = (LayoutProcesosCargasId) other;

        return ((this.getNoLinea() == castOther.getNoLinea()) || (this
                .getNoLinea() != null
                && castOther.getNoLinea() != null && this.getNoLinea().equals(
                castOther.getNoLinea())))
                && ((this.getLayoutProcesoId() == castOther
                .getLayoutProcesoId()) || (this.getLayoutProcesoId() != null
                && castOther.getLayoutProcesoId() != null && this
                .getLayoutProcesoId().equals(
                        castOther.getLayoutProcesoId())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result
                + (getNoLinea() == null ? 0 : this.getNoLinea().hashCode());
        result = 37
                * result
                + (getLayoutProcesoId() == null ? 0 : this.getLayoutProcesoId()
                .hashCode());
        return result;
    }


}
