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
@Table(name = "fid_lista_doctos")
public class FidListaDocto {

    @ManyToOne(cascade = {}, fetch = FetchType.EAGER,targetEntity = FidRendimiento.class)
    @JoinColumn(name = "rendimiento_id",unique = false, nullable = true, insertable = true, updatable = true)
    private int rendimientoId;
    @Column(name = "id_cat_lista_doctos")
    private Short idCatListaDoctos;
    @Column(name = "obligatorio")
    private String obligatorio;
    @Column(name = "creado_por")
    private Integer creadoPor;
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "modificado_por")
    private Integer modificadoPor;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Column(name = "tipo_persona")
    private String tipoPersona;
    @Id
    @Basic(optional = false)
    @Column(name = "lista_docto_id")
    private Integer listaDoctoId;
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidListaDocto)) {
            return false;
        }
        FidListaDocto other = (FidListaDocto) object;
        if ((this.listaDoctoId == null && other.listaDoctoId != null) || (this.listaDoctoId != null && !this.listaDoctoId.equals(other.listaDoctoId))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "fideicomiso.FidListaDocto[listaDoctoId=" + listaDoctoId + "]";
    }

}
