package com.box.sdkgen.schemas.integrationmappingsteams;

import com.box.sdkgen.internal.SerializableObject;
import com.box.sdkgen.schemas.integrationmappingteams.IntegrationMappingTeams;
import java.util.List;
import java.util.Objects;

public class IntegrationMappingsTeams extends SerializableObject {

  protected List<IntegrationMappingTeams> entries;

  public IntegrationMappingsTeams() {
    super();
  }

  protected IntegrationMappingsTeams(IntegrationMappingsTeamsBuilder builder) {
    super();
    this.entries = builder.entries;
  }

  public List<IntegrationMappingTeams> getEntries() {
    return entries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMappingsTeams casted = (IntegrationMappingsTeams) o;
    return Objects.equals(entries, casted.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries);
  }

  @Override
  public String toString() {
    return "IntegrationMappingsTeams{" + "entries='" + entries + '\'' + "}";
  }

  public static class IntegrationMappingsTeamsBuilder {

    protected List<IntegrationMappingTeams> entries;

    public IntegrationMappingsTeamsBuilder entries(List<IntegrationMappingTeams> entries) {
      this.entries = entries;
      return this;
    }

    public IntegrationMappingsTeams build() {
      return new IntegrationMappingsTeams(this);
    }
  }
}
