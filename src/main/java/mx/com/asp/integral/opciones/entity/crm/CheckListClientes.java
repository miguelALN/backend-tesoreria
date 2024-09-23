package mx.com.asp.integral.opciones.entity.crm;

public class CheckListClientes extends PlaClientes {
    private boolean seleccion;
    private boolean modificado;
    public CheckListClientes(){
        super();
    }
    public CheckListClientes(PlaClientes pc){
        super(pc.getClienteId(), pc.getAsignadoA(), pc.getRfc(), pc.getCurp(), pc.getCliente(), pc.getCalle(), pc.getEntreCalle(),
                pc.getYCalle(), pc.getTelefonoOficina(), pc.getNoExterno(), pc.getNoInterno(), pc.getColonia(), pc.getCiudad(), pc.getCp(),
                pc.getCorreo(), pc.getTPersona(), pc.getContacto(), pc.getDomicilioContacto(), pc.getTelefonoContacto(),
                pc.getCelularContacto(), pc.getCorreoContacto(), pc.getCreadoPor(),pc.getFechaCreacion(), pc.getModificadoPor(), pc.getFechaModificacion());
        this.seleccion = false;
        this.modificado = false;
    }

    public void setSeleccion(boolean seleccion){
        this.seleccion = seleccion;
    }
    public boolean isSeleccion() {
        return seleccion;
    }

    public void setModificado(boolean mod) {
        this.modificado = mod;
    }

    public boolean isModificado() {
        return modificado;
    }
    public void valCambio(){
        this.modificado = true;
    }
}
