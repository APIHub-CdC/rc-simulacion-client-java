package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.apihub.client.model.Consulta;
import io.apihub.client.model.Credito;
import io.apihub.client.model.DomicilioRespuesta;
import io.apihub.client.model.Empleo;
import io.apihub.client.model.Mensaje;
import io.apihub.client.model.PersonasRespuesta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("folioConsultaOtorgante")
  private String folioConsultaOtorgante = null;
  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;
  @SerializedName("declaracionesConsumidor")
  private String declaracionesConsumidor = null;
  @SerializedName("persona")
  private PersonasRespuesta persona = null;
  @SerializedName("consultas")
  private List<Consulta> consultas = null;
  @SerializedName("creditos")
  private List<Credito> creditos = null;
  @SerializedName("domicilios")
  private List<DomicilioRespuesta> domicilios = null;
  @SerializedName("empleos")
  private List<Empleo> empleos = null;
  @SerializedName("mensajes")
  private List<Mensaje> mensajes = null;
  public Respuesta folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "386636538", value = "Folio de la consulta")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Respuesta folioConsultaOtorgante(String folioConsultaOtorgante) {
    this.folioConsultaOtorgante = folioConsultaOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "0000001", value = "Folio de la consulta con relación al otorgante")
  public String getFolioConsultaOtorgante() {
    return folioConsultaOtorgante;
  }
  public void setFolioConsultaOtorgante(String folioConsultaOtorgante) {
    this.folioConsultaOtorgante = folioConsultaOtorgante;
  }
  public Respuesta claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "API0000001", value = "Clave del otorgante")
  public String getClaveOtorgante() {
    return claveOtorgante;
  }
  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }
  public Respuesta declaracionesConsumidor(String declaracionesConsumidor) {
    this.declaracionesConsumidor = declaracionesConsumidor;
    return this;
  }
   
  @ApiModelProperty(example = "Inconforme con el Resultado", value = "")
  public String getDeclaracionesConsumidor() {
    return declaracionesConsumidor;
  }
  public void setDeclaracionesConsumidor(String declaracionesConsumidor) {
    this.declaracionesConsumidor = declaracionesConsumidor;
  }
  public Respuesta persona(PersonasRespuesta persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public PersonasRespuesta getPersona() {
    return persona;
  }
  public void setPersona(PersonasRespuesta persona) {
    this.persona = persona;
  }
  public Respuesta consultas(List<Consulta> consultas) {
    this.consultas = consultas;
    return this;
  }
  public Respuesta addConsultasItem(Consulta consultasItem) {
    if (this.consultas == null) {
      this.consultas = new ArrayList<Consulta>();
    }
    this.consultas.add(consultasItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Consulta> getConsultas() {
    return consultas;
  }
  public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
  }
  public Respuesta creditos(List<Credito> creditos) {
    this.creditos = creditos;
    return this;
  }
  public Respuesta addCreditosItem(Credito creditosItem) {
    if (this.creditos == null) {
      this.creditos = new ArrayList<Credito>();
    }
    this.creditos.add(creditosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Credito> getCreditos() {
    return creditos;
  }
  public void setCreditos(List<Credito> creditos) {
    this.creditos = creditos;
  }
  public Respuesta domicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
    return this;
  }
  public Respuesta addDomiciliosItem(DomicilioRespuesta domiciliosItem) {
    if (this.domicilios == null) {
      this.domicilios = new ArrayList<DomicilioRespuesta>();
    }
    this.domicilios.add(domiciliosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<DomicilioRespuesta> getDomicilios() {
    return domicilios;
  }
  public void setDomicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
  }
  public Respuesta empleos(List<Empleo> empleos) {
    this.empleos = empleos;
    return this;
  }
  public Respuesta addEmpleosItem(Empleo empleosItem) {
    if (this.empleos == null) {
      this.empleos = new ArrayList<Empleo>();
    }
    this.empleos.add(empleosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Empleo> getEmpleos() {
    return empleos;
  }
  public void setEmpleos(List<Empleo> empleos) {
    this.empleos = empleos;
  }
  public Respuesta mensajes(List<Mensaje> mensajes) {
    this.mensajes = mensajes;
    return this;
  }
  public Respuesta addMensajesItem(Mensaje mensajesItem) {
    if (this.mensajes == null) {
      this.mensajes = new ArrayList<Mensaje>();
    }
    this.mensajes.add(mensajesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Mensaje> getMensajes() {
    return mensajes;
  }
  public void setMensajes(List<Mensaje> mensajes) {
    this.mensajes = mensajes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.folioConsulta, respuesta.folioConsulta) &&
        Objects.equals(this.folioConsultaOtorgante, respuesta.folioConsultaOtorgante) &&
        Objects.equals(this.claveOtorgante, respuesta.claveOtorgante) &&
        Objects.equals(this.declaracionesConsumidor, respuesta.declaracionesConsumidor) &&
        Objects.equals(this.persona, respuesta.persona) &&
        Objects.equals(this.consultas, respuesta.consultas) &&
        Objects.equals(this.creditos, respuesta.creditos) &&
        Objects.equals(this.domicilios, respuesta.domicilios) &&
        Objects.equals(this.empleos, respuesta.empleos) &&
        Objects.equals(this.mensajes, respuesta.mensajes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioConsulta, folioConsultaOtorgante, claveOtorgante, declaracionesConsumidor, persona, consultas, creditos, domicilios, empleos, mensajes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    folioConsultaOtorgante: ").append(toIndentedString(folioConsultaOtorgante)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    declaracionesConsumidor: ").append(toIndentedString(declaracionesConsumidor)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
    sb.append("    creditos: ").append(toIndentedString(creditos)).append("\n");
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
    sb.append("    mensajes: ").append(toIndentedString(mensajes)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
