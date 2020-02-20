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
import io.apihub.client.model.Empleo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen empleos, se listarán.")


public class Empleos {
  @SerializedName("empleos")
  private List<Empleo> empleos = null;
  public Empleos empleos(List<Empleo> empleos) {
    this.empleos = empleos;
    return this;
  }
  public Empleos addEmpleosItem(Empleo empleosItem) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empleos empleos = (Empleos) o;
    return Objects.equals(this.empleos, empleos.empleos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(empleos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empleos {\n");
    
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
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
