package mx.com.asp.integral.opciones.entity.cm.admon;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "empleado", schema = "public", uniqueConstraints = {})
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    @Id
    @Column(name = "num_empleado", unique = true, nullable = false, insertable = true, updatable = true)
    private Integer numEmpleado;

    @Column(name = "puesto_asig", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String puestoAsig;

    @Column(name = "sucursal", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String sucursal;

    @Column(name = "nombres", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String nombres;

    @Column(name = "apellido_pat", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String apellidoPat;

    @Column(name = "apellido_mat", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String apellidoMat;

    @Column(name = "sexo", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String sexo;

    @Column(name = "calle", unique = false, nullable = true, insertable = true, updatable = true, length = 150)
    private String calle;

    @Column(name = "num", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer num;

    @Column(name = "col", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String col;

    @Column(name = "codigo_pos", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
    private String codigoPos;

    @Column(name = "tel_casa", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String telCasa;

    @Column(name = "tel_cel", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String telCel;

    @Column(name = "email", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String email;

    @Column(name = "lugar_nac", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String lugarNac;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_nac", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaNac;

    @Column(name = "nacionalidad", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String nacionalidad;

    @Column(name = "edocivil", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String edocivil;

    @Column(name = "nombre_padre", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String nombrePadre;

    @Column(name = "nombre_madre", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String nombreMadre;

    @Column(name = "nombre_esposo", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String nombreEsposo;

    @Column(name = "titulo", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String titulo;

    @Column(name = "esc_proc", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String escProc;

    @Column(name = "esc_proc", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private Date fechaIng;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_egre", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaEgre;

    @Column(name = "idiomas", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String idiomas;

    @Column(name = "funciones_of", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String funcionesOf;

    @Column(name = "maquinas_of", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String maquinasOf;

    @Column(name = "como_supo", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String comoSupo;

    @Column(name = "parientes", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String parientes;

    @Column(name = "afianzado", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String afianzado;

    @Column(name = "sindicato", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String sindicato;

    @Column(name = "seguro", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String seguro;

    @Column(name = "viajar", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String viajar;

    @Column(name = "cambiar_res", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String cambiarRes;

    @Column(name = "conyuge_trab", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String conyugeTrab;

    @Column(name = "casa_propia", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String casaPropia;

    @Column(name = "paga_renta", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String pagaRenta;

    @Column(name = "tiene_auto", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String tieneAuto;

    @Column(name = "tiene_deudas", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String tieneDeudas;

    @Column(name = "gastos_men", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer gastosMen;

    @Column(name = "rfc", unique = false, nullable = true, insertable = true, updatable = true, length = 13)
    private String rfc;

    @Column(name = "nss", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
    private String nss;

    @Column(name = "curp", unique = false, nullable = true, insertable = true, updatable = true, length = 18)
    private String curp;

    @Column(name = "no_licencia", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
    private String noLicencia;

    @Column(name = "no_afore", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
    private String noAfore;

    @Column(name = "tipo_afore", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private String tipoAfore;

    @Column(name = "num_cred", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
    private String numCred;

    @Column(name = "tipo_desc", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    private String tipoDesc;

    @Column(name = "edo_salud", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String edoSalud;

    @Column(name = "enfermedad_cro", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String enfermedadCro;

    @Column(name = "estado", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String estado;

    @Column(name = "ciudad", unique = false, nullable = true, insertable = true, updatable = true, length = 25)
    private String ciudad;

    @Column(name = "activo", unique = false, nullable = true, insertable = true, updatable = true)
    private Boolean activo;

    @Column(name = "monto_desc", unique = false, nullable = true, insertable = true, updatable = true, precision = 8)
    private Double montoDesc;

    @Column(name = "otros_ing", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer otrosIng;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_ingreso", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaIngreso;

    @Column(name = "nominpaq", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String nominpaq;

    @Column(name = "caso_emer", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String casoEmer;

    @Column(name = "talla", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String talla;

    @Column(name = "tipo_sangre", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
    private String tipoSangre;

    @Column(name = "ruta_foto", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String rutaFoto;

    @Column(name = "ruta_curriculum", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String rutaCurriculum;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_baja", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaBaja;

    @Column(name = "telefono_emerg", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String telefonoEmerg;

    @Column(name = "cuenta_nomina", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String cuentaNomina;

    @Column(name = "banco_nomina", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String bancoNomina;

    @Column(name = "enfermedad_sn", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String enfermedadSn;

    @Column(name = "secundaria", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String secundaria;

    @Column(name = "bachillerato", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String bachillerato;

    @Column(name = "postgrado", unique = false, nullable = true, insertable = true, updatable = true, length = 70)
    private String postgrado;

    @Column(name = "nomina", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String nomina;

    @Column(name = "jefe_directo", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer jefeDirecto;

    @Column(name = "tiene_afore", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String tieneAfore;

    @Column(name = "tiene_credito", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String tieneCredito;

    @Column(name = "creado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short creadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaCreacion;

    @Column(name = "modificado_por", unique = false, nullable = true, insertable = true, updatable = true)
    private Short modificadoPor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private Date fechaModificacion;

    @Column(name = "empresa", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String empresa;

    @Column(name = "unidad_med", unique = false, nullable = true, insertable = true, updatable = true)
    private Short unidadMed;

    @Column(name = "beneficiario", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
    private String beneficiario;

    @Column(name = "parentesco_ben", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String parentescoBen;

    @Column(name = "recibe_vale", unique = false, nullable = true, insertable = true, updatable = true)
    private Integer recibeVale;

    @Column(name = "t_padres", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TPadres;

    @Column(name = "t_abuelos", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TAbuelos;

    @Column(name = "t_hijos", unique = false, nullable = true, insertable = true, updatable = true)
    private Short THijos;

    @Column(name = "t_hermanos", unique = false, nullable = true, insertable = true, updatable = true)
    private Short THermanos;

    @Column(name = "t_esposa", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TEsposa;

    @Column(name = "t_cunados", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TCunados;

    @Column(name = "t_suegros", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TSuegros;

    @Column(name = "t_yerno_nuera", unique = false, nullable = true, insertable = true, updatable = true)
    private Short TYernoNuera;

    @Column(name = "motivo_baja", unique = false, nullable = true, insertable = true, updatable = true)
    private Short motivoBaja;

    @Column(name = "ingreso_nomina", unique = false, nullable = true, insertable = true, updatable = true)
    private Short ingresoNomina;

    //private CatAreas areaId;
    private Short externo;
    //private PuestosCategorias categoriaId;
    private String tarjetavales;



    /*//@JsonIgnore
    @ManyToOne(cascade = {},fetch = FetchType.LAZY,targetEntity = CatAreas.class)
    @JoinColumn(name = "area_id", referencedColumnName="cat_areas_id", unique = false, nullable = true, insertable = true, updatable = true)
    public CatAreas getAreaId() {
        return this.areaId;
    }

    public void setAreaId(CatAreas areaId) {
        this.areaId = areaId;
    }

    @Column(name = "externo", unique = false, nullable = true, insertable = true, updatable = true)
    public Short getExterno() {
        return this.externo;
    }

    public void setExterno(Short externo) {
        this.externo = externo;
    }

    //@Column(name = "categoria_id", unique = false, nullable = true, insertable = true, updatable = true)
    //@JsonIgnore
    @ManyToOne(cascade = {}, fetch = FetchType.LAZY, targetEntity = PuestosCategorias.class)
    @JoinColumn(name = "categoria_id",unique = false,nullable = true, insertable = true, updatable = true)
    public PuestosCategorias getCategoriaId() {
        return this.categoriaId;
    }

    public void setCategoriaId(PuestosCategorias categoriaId) {
        this.categoriaId = categoriaId;
    }

    @Column(name = "tarjetavales", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    public String getTarjetavales() {
        return this.tarjetavales;
    }*/
}
