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
import io.apihub.client.model.Credito;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen créditos, se listarán.")


public class Creditos {
  @SerializedName("creditos")
  private List<Credito> creditos = null;
  public Creditos creditos(List<Credito> creditos) {
    this.creditos = creditos;
    return this;
  }
  public Creditos addCreditosItem(Credito creditosItem) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creditos creditos = (Creditos) o;
    return Objects.equals(this.creditos, creditos.creditos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(creditos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creditos {\n");
    
    sb.append("    creditos: ").append(toIndentedString(creditos)).append("\n");
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
