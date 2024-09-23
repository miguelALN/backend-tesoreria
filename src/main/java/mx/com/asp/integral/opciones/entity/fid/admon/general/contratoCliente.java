package mx.com.asp.integral.opciones.entity.fid.admon.general;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class contratoCliente {

    private String numControl;
    private String nomAcreditado;
    private Date fecVen;
    private double montoVen;
    private Date fecApertura;
    private Date fecDescuento;
    private Date fecFideicomiso;
    private double monto;
    private double montoGl;
    private boolean selecionado;
    private String numContrato;
    private String fidContrato;
    private String idSolicitante;
    private String sucursal;
    private String parametro1;
    private String parametro2;
    private String parametro3;
    private String parametro4;
    private String parametro5;
    private String parametro6;
    private String parametro7;
    private String parametro8;



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numControl == null) ? 0 : numControl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        contratoCliente otro = (contratoCliente) obj;
        if (numControl == null) {
            if (otro.numControl != null)
                return false;
        } else if (!numControl.equals(otro.numControl))
            return false;
        return true;
    }

    public String toString(){
        return this.numControl;
    }


}
