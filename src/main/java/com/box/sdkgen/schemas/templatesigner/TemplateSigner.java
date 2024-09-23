package com.box.sdkgen.schemas.templatesigner;

import com.box.sdkgen.schemas.templatesignerinput.TemplateSignerInput;
import com.box.sdkgen.serialization.json.EnumWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Objects;

public class TemplateSigner {

  protected List<TemplateSignerInput> inputs;

  protected String email;

  @JsonDeserialize(using = TemplateSignerRoleField.TemplateSignerRoleFieldDeserializer.class)
  @JsonSerialize(using = TemplateSignerRoleField.TemplateSignerRoleFieldSerializer.class)
  protected EnumWrapper<TemplateSignerRoleField> role;

  @JsonProperty("is_in_person")
  protected Boolean isInPerson;

  protected Long order;

  @JsonProperty("signer_group_id")
  protected String signerGroupId;

  protected String label;

  @JsonProperty("public_id")
  protected String publicId;

  public TemplateSigner() {}

  protected TemplateSigner(TemplateSignerBuilder builder) {
    this.inputs = builder.inputs;
    this.email = builder.email;
    this.role = builder.role;
    this.isInPerson = builder.isInPerson;
    this.order = builder.order;
    this.signerGroupId = builder.signerGroupId;
    this.label = builder.label;
    this.publicId = builder.publicId;
  }

  public List<TemplateSignerInput> getInputs() {
    return inputs;
  }

  public String getEmail() {
    return email;
  }

  public EnumWrapper<TemplateSignerRoleField> getRole() {
    return role;
  }

  public Boolean getIsInPerson() {
    return isInPerson;
  }

  public Long getOrder() {
    return order;
  }

  public String getSignerGroupId() {
    return signerGroupId;
  }

  public String getLabel() {
    return label;
  }

  public String getPublicId() {
    return publicId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSigner casted = (TemplateSigner) o;
    return Objects.equals(inputs, casted.inputs)
        && Objects.equals(email, casted.email)
        && Objects.equals(role, casted.role)
        && Objects.equals(isInPerson, casted.isInPerson)
        && Objects.equals(order, casted.order)
        && Objects.equals(signerGroupId, casted.signerGroupId)
        && Objects.equals(label, casted.label)
        && Objects.equals(publicId, casted.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, email, role, isInPerson, order, signerGroupId, label, publicId);
  }

  @Override
  public String toString() {
    return "TemplateSigner{"
        + "inputs='"
        + inputs
        + '\''
        + ", "
        + "email='"
        + email
        + '\''
        + ", "
        + "role='"
        + role
        + '\''
        + ", "
        + "isInPerson='"
        + isInPerson
        + '\''
        + ", "
        + "order='"
        + order
        + '\''
        + ", "
        + "signerGroupId='"
        + signerGroupId
        + '\''
        + ", "
        + "label='"
        + label
        + '\''
        + ", "
        + "publicId='"
        + publicId
        + '\''
        + "}";
  }

  public static class TemplateSignerBuilder {

    protected List<TemplateSignerInput> inputs;

    protected String email;

    protected EnumWrapper<TemplateSignerRoleField> role;

    protected Boolean isInPerson;

    protected Long order;

    protected String signerGroupId;

    protected String label;

    protected String publicId;

    public TemplateSignerBuilder inputs(List<TemplateSignerInput> inputs) {
      this.inputs = inputs;
      return this;
    }

    public TemplateSignerBuilder email(String email) {
      this.email = email;
      return this;
    }

    public TemplateSignerBuilder role(TemplateSignerRoleField role) {
      this.role = new EnumWrapper<TemplateSignerRoleField>(role.getValue(), role);
      return this;
    }

    public TemplateSignerBuilder isInPerson(Boolean isInPerson) {
      this.isInPerson = isInPerson;
      return this;
    }

    public TemplateSignerBuilder order(Long order) {
      this.order = order;
      return this;
    }

    public TemplateSignerBuilder signerGroupId(String signerGroupId) {
      this.signerGroupId = signerGroupId;
      return this;
    }

    public TemplateSignerBuilder label(String label) {
      this.label = label;
      return this;
    }

    public TemplateSignerBuilder publicId(String publicId) {
      this.publicId = publicId;
      return this;
    }

    public TemplateSigner build() {
      return new TemplateSigner(this);
    }
  }
}
