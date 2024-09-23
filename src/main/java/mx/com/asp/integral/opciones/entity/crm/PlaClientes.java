package mx.com.asp.integral.opciones.entity.crm;

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
@Table(name = "pla_clientes", schema = "public", uniqueConstraints = {})
@SequenceGenerator(name="plaClienteSec", sequenceName="pla_clientes_seq", allocationSize = 1)
public class PlaClientes {

    @Id
    @Column(name = "cliente_id", unique = true, nullable = false, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="plaClienteSec")
    private int clienteId;
    @Column(name = "asignado_a", unique = false, nullable = true, insertable = true, updatable = true)
    private Long asignadoA;
    @Column(name = "rfc", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
    private String rfc;
    @Column(name = "curp", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String curp;
    @Column(name = "cliente", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String cliente;
    @Column(name = "calle", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String calle;
    @Column(name = "entre_calle", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String entreCalle;
    @Column(name = "y_calle", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String YCalle;
    @Column(name = "telefono_oficina", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String telefonoOficina;
    @Column(name = "no_externo", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String noExterno;
    @Column(name = "no_interno", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String noInterno;
    @Column(name = "colonia", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String colonia;
    @Column(name = "ciudad", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String ciudad;
    @Column(name = "cp", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String cp;
    @Column(name = "correo", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String correo;
    @Column(name = "t_persona", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
    private String TPersona;
    @Column(name = "contacto", unique = false, nullable = true, insertable = true, updatable = true, length = 150)
    private String contacto;
    @Column(name = "domicilio_contacto", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
    private String domicilioContacto;
    @Column(name = "telefono_contacto", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String telefonoContacto;
    @Column(name = "celular_contacto", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String celularContacto;
    @Column(name = "correo_contacto", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String correoContacto;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Long modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;


}
