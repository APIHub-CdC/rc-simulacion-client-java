package com.cdc.apihub.mx.RC.simulacion.client.model;

import java.util.Objects;
import java.util.Arrays;


public class PersonasRespuesta {
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }
  @Override
  public int hashCode() {
    return Objects.hash();
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonasRespuesta {\n");
    
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
