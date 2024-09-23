package mx.com.asp.integral.opciones.entity.fid.admon.general;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class bancoCliente {

    private int bancoId;
    private String nombreLargo;
    private String cuentaPagos;





    public int hashCode(){
        return System.identityHashCode(bancoId);
    }

    public boolean equals(bancoCliente cc){
        return cc!=null && cc.getBancoId() == this.bancoId;
    }
}
