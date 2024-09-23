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
@Table(name = "solicitante")
@SequenceGenerator(name = "fidSolicitanteNumeroFirmaSec", sequenceName = "solicitante_numero_firma_s", allocationSize = 1)
public class FidSolicitante {

    @Column(name = "control", unique = false, nullable = true, insertable = true, updatable = true)
    private String control;
    @Column(name = "nombre", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombre;
    @Column(name = "rfc1", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc1;
    @Column(name = "rfc2", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc2;
    @Column(name = "rfc3", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc3;
    @Column(name = "edo_civil", unique = false, nullable = true, insertable = true, updatable = true)
    private String edoCivil;
    @Column(name = "sexo", unique = false, nullable = true, insertable = true, updatable = true)
    private String sexo;
    @Column(name = "domicilio", unique = false, nullable = true, insertable = true, updatable = true)
    private String domicilio;
    @Column(name = "colonia", unique = false, nullable = true, insertable = true, updatable = true)
    private Short colonia;
    @Column(name = "celular", unique = false, nullable = true, insertable = true, updatable = true)
    private String celular;
    @Column(name = "telefono", unique = false, nullable = true, insertable = true, updatable = true)
    private String telefono;
    @Column(name = "originario", unique = false, nullable = true, insertable = true, updatable = true)
    private String originario;
    @Column(name = "nombre_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombreC;
    @Column(name = "rfc1_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc1C;
    @Column(name = "rfc2_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc2C;
    @Column(name = "rfc3_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String rfc3C;
    @Column(name = "domicilio_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String domicilioC;
    @Column(name = "sexo_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String sexoC;
    @Column(name = "colonia_c", unique = false, nullable = true, insertable = true, updatable = true)
    private Short coloniaC;
    @Column(name = "estudios", unique = false, nullable = true, insertable = true, updatable = true)
    private String estudios;
    @Column(name = "aestudios", unique = false, nullable = true, insertable = true, updatable = true)
    private Short aestudios;
    @Column(name = "testudios", unique = false, nullable = true, insertable = true, updatable = true)
    private String testudios;
    @Column(name = "nombre_p", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombreP;
    @Column(name = "apellidos", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidos;
    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short creadoPor;
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short modificadoPor;
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Id
    @Column(name = "numero", unique = true, nullable = false, insertable = true, updatable = true)
    private String numero;
    @Column(name = "numero_casa", unique = false, nullable = true, insertable = true, updatable = true)
    private String numeroCasa;
    @Column(name = "apellido_m", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidoM;
    @Column(name = "curp", unique = false, nullable = true, insertable = true, updatable = true)
    private String curp;
    @Column(name = "credencial_ife", unique = false, nullable = true, insertable = true, updatable = true)
    private String credencialIfe;
    @Column(name = "cve_nacionalidad", unique = false, nullable = true, insertable = true, updatable = true)
    private Short cveNacionalidad;
    @Column(name = "cve_ocupacion", unique = false, nullable = true, insertable = true, updatable = true)
    private Short cveOcupacion;
    @Column(name = "cve_nacionalidad_c", unique = false, nullable = true, insertable = true, updatable = true)
    private Short cveNacionalidadC;
    @Column(name = "numero_casa_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String numeroCasaC;
    @Column(name = "numero_hijos", unique = false, nullable = true, insertable = true, updatable = true)
    private Short numeroHijos;
    @Column(name = "apellido_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidoC;
    @Column(name = "apellido_m_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidoMC;
    @Column(name = "num_sec", unique = false, nullable = true, insertable = true, updatable = true)
    private Short numSec;
    @Column(name = "cve_ocupacion_c", unique = false, nullable = true, insertable = true, updatable = true)
    private Short cveOcupacionC;
    @Column(name = "credencial_ife_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String credencialIfeC;
    @Column(name = "originario_c", unique = false, nullable = true, insertable = true, updatable = true)
    private String originarioC;
    @Column(name = "referencia", unique = false, nullable = true, insertable = true, updatable = true)
    private String referencia;
    @Column(name = "grupo_id", unique = false, nullable = true, insertable = true, updatable = true)
    private String grupoId;
    @Column(name = "monto_inicial", unique = false, nullable = true, insertable = true, updatable = true)
    private Double montoInicial;
    @Column(name = "responsab", unique = false, nullable = true, insertable = true, updatable = true)
    private String responsab;
    @Column(name = "puesto", unique = false, nullable = true, insertable = true, updatable = true)
    private String puesto;
    @Column(name = "agente_id", unique = false, nullable = true, insertable = true, updatable = true)
    private String agenteId;
    @Column(name = "empresa", unique = false, nullable = true, insertable = true, updatable = true)
    private String empresa;
    @Column(name = "patrimonio", unique = false, nullable = true, insertable = true, updatable = true)
    private Double patrimonio;
    @Column(name = "id_conyuge", unique = false, nullable = true, insertable = true, updatable = true)
    private String idConyuge;
    @Column(name = "t_persona", unique = false, nullable = true, insertable = true, updatable = true)
    private String tPersona;
    @Column(name = "personalidad", unique = false, nullable = true, insertable = true, updatable = true)
    private String personalidad;
    @Column(name = "estudios_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Short estudiosId;
    @Column(name = "edo_nac_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Short edoNacId;
    @Column(name = "numero_firma", unique = false, nullable = true, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fidSolicitanteNumeroFirmaSec")
    private Integer numeroFirma;
    @Column(name = "domicilio_em", unique = false, nullable = true, insertable = true, updatable = true)
    private String domicilioEm;
    @Column(name = "numero_casa_em", unique = false, nullable = true, insertable = true, updatable = true)
    private String numeroCasaEm;
    @Column(name = "colonia_em", unique = false, nullable = true, insertable = true, updatable = true)
    private Short coloniaEm;
    @Column(name = "telefono_em", unique = false, nullable = true, insertable = true, updatable = true)
    private String telefonoEm;
    @Column(name = "lineacredito", unique = false, nullable = true, insertable = true, updatable = true)
    private Double lineacredito;
    @Column(name = "t_proveedor", unique = false, nullable = true, insertable = true, updatable = true)
    private Boolean tProveedor;
    @Column(name = "desc_proveedor", unique = false, nullable = true, insertable = true, updatable = true)
    private String descProveedor;
    @Column(name = "folio_fiscal", unique = false, nullable = true, insertable = true, updatable = true)
    private String folioFiscal;
    @Column(name = "tipo_lugar_emp", unique = false, nullable = true, insertable = true, updatable = true)
    private Short tipoLugarEmp;
    @Column(name = "giro", unique = false, nullable = true, insertable = true, updatable = true)
    private Short giro;
    @Column(name = "atencion_haa", unique = false, nullable = true, insertable = true, updatable = true)
    private String atencionHaa;
    @Column(name = "atencion_hd", unique = false, nullable = true, insertable = true, updatable = true)
    private String atencionHd;
    @Column(name = "atencion_semana", unique = false, nullable = true, insertable = true, updatable = true)
    private String atencionSemana;
    @Column(name = "compras", unique = false, nullable = true, insertable = true, updatable = true)
    private Double compras;
    @Column(name = "fecha_ingreso", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "giro_ant", unique = false, nullable = true, insertable = true, updatable = true)
    private Short giroAnt;
    @Column(name = "hijos_edades", unique = false, nullable = true, insertable = true, updatable = true)
    private String hijosEdades;
    @Column(name = "ingreso_mensual", unique = false, nullable = true, insertable = true, updatable = true)
    private Double ingresoMensual;
    @Column(name = "lugar_trabajo", unique = false, nullable = true, insertable = true, updatable = true)
    private String lugarTrabajo;
    @Column(name = "parentesco", unique = false, nullable = true, insertable = true, updatable = true)
    private Short parentesco;
    @Column(name = "propietario_casa", unique = false, nullable = true, insertable = true, updatable = true)
    private String propietarioCasa;
    @Column(name = "propietario_emp", unique = false, nullable = true, insertable = true, updatable = true)
    private String propietarioEmp;
    @Column(name = "renta_casa", unique = false, nullable = true, insertable = true, updatable = true)
    private Double rentaCasa;
    @Column(name = "renta_emp", unique = false, nullable = true, insertable = true, updatable = true)
    private Double rentaEmp;
    @Column(name = "tel_prop_emp", unique = false, nullable = true, insertable = true, updatable = true)
    private String telPropEmp;
    @Column(name = "tiempo_casa", unique = false, nullable = true, insertable = true, updatable = true)
    private Short tiempoCasa;
    @Column(name = "vivienda_id", unique = false, nullable = true, insertable = true, updatable = true)
    private Short viviendaId;
    @Column(name = "actividad", unique = false, nullable = true, insertable = true, updatable = true)
    private Short actividad;
    @Column(name = "nombre_alt", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombreAlt;
    @Column(name = "nombrep_alt", unique = false, nullable = true, insertable = true, updatable = true)
    private String nombrepAlt;
    @Column(name = "apellidop_alt", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidopAlt;
    @Column(name = "apellidom_alt", unique = false, nullable = true, insertable = true, updatable = true)
    private String apellidomAlt;
    @Column(name = "bloqueado", unique = false, nullable = true, insertable = true, updatable = true)
    private Short bloqueado;
    @Column(name = "correo", unique = false, nullable = true, insertable = true, updatable = true)
    private String correo;
    @Column(name = "fax", unique = false, nullable = true, insertable = true, updatable = true)
    private String fax;
    @Column(name = "fecha_cliente_desde", unique = false, nullable = true, insertable = true, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaClienteDesde;
    @Column(name = "tenencia_tierra", unique = false, nullable = true, insertable = true, updatable = true)
    private String tenenciaTierra;
    @Column(name = "clave_distrito_des_rural", unique = false, nullable = true, insertable = true, updatable = true)
    private String claveDistritoDesRural;


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof FidSolicitante)) {
            return false;
        }
        FidSolicitante other = (FidSolicitante) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fideicomiso.Solicitante[numero=" + numero + "]";
    }

}
