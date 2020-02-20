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
import java.io.IOException;
@ApiModel(description = "El elemento de Mensaje contiene información acerca de los mensajes emitidos por Círculo de Crédito, este elemento se repite dependiendo del número de mensajes.")


public class Mensaje {
  @SerializedName("tipoMensaje")
  private Integer tipoMensaje = null;
  @SerializedName("leyenda")
  private String leyenda = null;
  public Mensaje tipoMensaje(Integer tipoMensaje) {
    this.tipoMensaje = tipoMensaje;
    return this;
  }
   
  @ApiModelProperty(example = "2", value = "Descripción del contenido en este campo: <br>1 = Expediente Bloqueado <br>2 = Respuesta otras SIC's")
  public Integer getTipoMensaje() {
    return tipoMensaje;
  }
  public void setTipoMensaje(Integer tipoMensaje) {
    this.tipoMensaje = tipoMensaje;
  }
  public Mensaje leyenda(String leyenda) {
    this.leyenda = leyenda;
    return this;
  }
   
  @ApiModelProperty(example = "No se obtuvo respuesta de otras SIC's", value = "Contiene la descripción del mensaje. Para la respuesta de otras SIC’s ver descripciones en Tabla: Respuestas SIC <table><thead><tr><th>Código</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>Respuesta exitosa de otras SIC's</td></tr><tr><td>2</td><td>No se obtuvo respuesta de otras SIC's</td></tr><tr><td>3</td><td>Sistema no disponible en otras SIC's</td></tr><tr><td>4</td><td>Error en los datos de la persona proporcionados</td></tr><tr><td>5</td><td>Error en los datos de domicilio proporcionados</td></tr><tr><td>6</td><td>No hit de otras SIC’s</td></tr></tbody></table>")
  public String getLeyenda() {
    return leyenda;
  }
  public void setLeyenda(String leyenda) {
    this.leyenda = leyenda;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mensaje mensaje = (Mensaje) o;
    return Objects.equals(this.tipoMensaje, mensaje.tipoMensaje) &&
        Objects.equals(this.leyenda, mensaje.leyenda);
  }
  @Override
  public int hashCode() {
    return Objects.hash(tipoMensaje, leyenda);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mensaje {\n");
    
    sb.append("    tipoMensaje: ").append(toIndentedString(tipoMensaje)).append("\n");
    sb.append("    leyenda: ").append(toIndentedString(leyenda)).append("\n");
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
