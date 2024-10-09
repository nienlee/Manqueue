package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.ModelIdentifier;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the ManRequired type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "ManRequireds", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "owner", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
}, hasLazySupport = true)
public final class ManRequired implements Model {
  public static final ManRequiredPath rootPath = new ManRequiredPath("root", false, null);
  public static final QueryField ID = field("ManRequired", "id");
  public static final QueryField TIME = field("ManRequired", "time");
  public static final QueryField GOLDEN = field("ManRequired", "golden");
  public static final QueryField TEMPERATURE = field("ManRequired", "temperature");
  public static final QueryField GSENSOR = field("ManRequired", "gsensor");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String time;
  private final @ModelField(targetType="String", isRequired = true) String golden;
  private final @ModelField(targetType="String", isRequired = true) String temperature;
  private final @ModelField(targetType="Int") List<Integer> gsensor;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  /** @deprecated This API is internal to Amplify and should not be used. */
  @Deprecated
   public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public String getTime() {
      return time;
  }
  
  public String getGolden() {
      return golden;
  }
  
  public String getTemperature() {
      return temperature;
  }
  
  public List<Integer> getGsensor() {
      return gsensor;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private ManRequired(String id, String time, String golden, String temperature, List<Integer> gsensor) {
    this.id = id;
    this.time = time;
    this.golden = golden;
    this.temperature = temperature;
    this.gsensor = gsensor;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      ManRequired manRequired = (ManRequired) obj;
      return ObjectsCompat.equals(getId(), manRequired.getId()) &&
              ObjectsCompat.equals(getTime(), manRequired.getTime()) &&
              ObjectsCompat.equals(getGolden(), manRequired.getGolden()) &&
              ObjectsCompat.equals(getTemperature(), manRequired.getTemperature()) &&
              ObjectsCompat.equals(getGsensor(), manRequired.getGsensor()) &&
              ObjectsCompat.equals(getCreatedAt(), manRequired.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), manRequired.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getTime())
      .append(getGolden())
      .append(getTemperature())
      .append(getGsensor())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("ManRequired {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("time=" + String.valueOf(getTime()) + ", ")
      .append("golden=" + String.valueOf(getGolden()) + ", ")
      .append("temperature=" + String.valueOf(getTemperature()) + ", ")
      .append("gsensor=" + String.valueOf(getGsensor()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static TimeStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static ManRequired justId(String id) {
    return new ManRequired(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      time,
      golden,
      temperature,
      gsensor);
  }
  public interface TimeStep {
    GoldenStep time(String time);
  }
  

  public interface GoldenStep {
    TemperatureStep golden(String golden);
  }
  

  public interface TemperatureStep {
    BuildStep temperature(String temperature);
  }
  

  public interface BuildStep {
    ManRequired build();
    BuildStep id(String id);
    BuildStep gsensor(List<Integer> gsensor);
  }
  

  public static class Builder implements TimeStep, GoldenStep, TemperatureStep, BuildStep {
    private String id;
    private String time;
    private String golden;
    private String temperature;
    private List<Integer> gsensor;
    public Builder() {
      
    }
    
    private Builder(String id, String time, String golden, String temperature, List<Integer> gsensor) {
      this.id = id;
      this.time = time;
      this.golden = golden;
      this.temperature = temperature;
      this.gsensor = gsensor;
    }
    
    @Override
     public ManRequired build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new ManRequired(
          id,
          time,
          golden,
          temperature,
          gsensor);
    }
    
    @Override
     public GoldenStep time(String time) {
        Objects.requireNonNull(time);
        this.time = time;
        return this;
    }
    
    @Override
     public TemperatureStep golden(String golden) {
        Objects.requireNonNull(golden);
        this.golden = golden;
        return this;
    }
    
    @Override
     public BuildStep temperature(String temperature) {
        Objects.requireNonNull(temperature);
        this.temperature = temperature;
        return this;
    }
    
    @Override
     public BuildStep gsensor(List<Integer> gsensor) {
        this.gsensor = gsensor;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String time, String golden, String temperature, List<Integer> gsensor) {
      super(id, time, golden, temperature, gsensor);
      Objects.requireNonNull(time);
      Objects.requireNonNull(golden);
      Objects.requireNonNull(temperature);
    }
    
    @Override
     public CopyOfBuilder time(String time) {
      return (CopyOfBuilder) super.time(time);
    }
    
    @Override
     public CopyOfBuilder golden(String golden) {
      return (CopyOfBuilder) super.golden(golden);
    }
    
    @Override
     public CopyOfBuilder temperature(String temperature) {
      return (CopyOfBuilder) super.temperature(temperature);
    }
    
    @Override
     public CopyOfBuilder gsensor(List<Integer> gsensor) {
      return (CopyOfBuilder) super.gsensor(gsensor);
    }
  }
  

  public static class ManRequiredIdentifier extends ModelIdentifier<ManRequired> {
    private static final long serialVersionUID = 1L;
    public ManRequiredIdentifier(String id) {
      super(id);
    }
  }
  
}
