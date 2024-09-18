package com.box.sdkgen.schemas.rolevariable;

import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class RoleVariable {

  @JsonDeserialize(using = RoleVariableTypeField.RoleVariableTypeFieldDeserializer.class)
  @JsonSerialize(using = RoleVariableTypeField.RoleVariableTypeFieldSerializer.class)
  protected EnumWrapper<RoleVariableTypeField> type;

  @JsonDeserialize(using = RoleVariableVariableTypeField.RoleVariableVariableTypeFieldDeserializer.class)
  @JsonSerialize(using = RoleVariableVariableTypeField.RoleVariableVariableTypeFieldSerializer.class)
  @JsonProperty("variable_type")
  protected EnumWrapper<RoleVariableVariableTypeField> variableType;

  @JsonDeserialize(using = RoleVariableVariableValueField.RoleVariableVariableValueFieldDeserializer.class)
  @JsonSerialize(using = RoleVariableVariableValueField.RoleVariableVariableValueFieldSerializer.class)
  @JsonProperty("variable_value")
  protected final EnumWrapper<RoleVariableVariableValueField> variableValue;

  public RoleVariable(@JsonProperty("variable_value") EnumWrapper<RoleVariableVariableValueField> variableValue) {
    this.variableValue = variableValue;
    this.type = new EnumWrapper<RoleVariableTypeField>(RoleVariableTypeField.VARIABLE.getValue(), RoleVariableTypeField.VARIABLE);
    this.variableType = new EnumWrapper<RoleVariableVariableTypeField>(RoleVariableVariableTypeField.COLLABORATOR_ROLE.getValue(), RoleVariableVariableTypeField.COLLABORATOR_ROLE);
  }

  public RoleVariable(RoleVariableVariableValueField variableValue) {
    this.variableValue = new EnumWrapper<RoleVariableVariableValueField>(variableValue.getValue(), variableValue);
    this.type = new EnumWrapper<RoleVariableTypeField>(RoleVariableTypeField.VARIABLE.getValue(), RoleVariableTypeField.VARIABLE);
    this.variableType = new EnumWrapper<RoleVariableVariableTypeField>(RoleVariableVariableTypeField.COLLABORATOR_ROLE.getValue(), RoleVariableVariableTypeField.COLLABORATOR_ROLE);
  }

  protected RoleVariable(RoleVariableBuilder builder) {
    this.type = builder.type;
    this.variableType = builder.variableType;
    this.variableValue = builder.variableValue;
  }

  public EnumWrapper<RoleVariableTypeField> getType() {
    return type;
  }

  public EnumWrapper<RoleVariableVariableTypeField> getVariableType() {
    return variableType;
  }

  public EnumWrapper<RoleVariableVariableValueField> getVariableValue() {
    return variableValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleVariable casted = (RoleVariable) o;
    return Objects.equals(type, casted.type) &&
      Objects.equals(variableType, casted.variableType) &&
      Objects.equals(variableValue, casted.variableValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      type, variableType, variableValue
    );
  }

  @Override
  public String toString() {
    return "RoleVariable{" + "type='" + type + '\'' + ", " + "variableType='" + variableType + '\'' + ", " + "variableValue='" + variableValue + '\'' + "}";
  }

  public static class RoleVariableBuilder {

    protected EnumWrapper<RoleVariableTypeField> type;

    protected EnumWrapper<RoleVariableVariableTypeField> variableType;

    protected final EnumWrapper<RoleVariableVariableValueField> variableValue;

    public RoleVariableBuilder(RoleVariableVariableValueField variableValue) {
      this.variableValue = new EnumWrapper<RoleVariableVariableValueField>(variableValue.getValue(), variableValue);
      this.type = new EnumWrapper<RoleVariableTypeField>(RoleVariableTypeField.VARIABLE.getValue(), RoleVariableTypeField.VARIABLE);
      this.variableType = new EnumWrapper<RoleVariableVariableTypeField>(RoleVariableVariableTypeField.COLLABORATOR_ROLE.getValue(), RoleVariableVariableTypeField.COLLABORATOR_ROLE);
    }

    public RoleVariableBuilder type(RoleVariableTypeField type) {
      this.type = new EnumWrapper<RoleVariableTypeField>(type.getValue(), type);
      return this;
    }

    public RoleVariableBuilder variableType(RoleVariableVariableTypeField variableType) {
      this.variableType = new EnumWrapper<RoleVariableVariableTypeField>(variableType.getValue(), variableType);
      return this;
    }

    public RoleVariable build() {
      return new RoleVariable(this);
    }

  }

}
