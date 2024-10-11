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

/** This is an auto generated class representing the CalibrationBPCIS type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "CalibrationBPCIS", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "owner", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
}, hasLazySupport = true)
public final class CalibrationBPCIS implements Model {
  public static final CalibrationBPCISPath rootPath = new CalibrationBPCISPath("root", false, null);
  public static final QueryField ID = field("CalibrationBPCIS", "id");
  public static final QueryField NUMBER = field("CalibrationBPCIS", "number");
  public static final QueryField HWFW = field("CalibrationBPCIS", "hwfw");
  public static final QueryField GOLDEN = field("CalibrationBPCIS", "golden");
  public static final QueryField DATATIME = field("CalibrationBPCIS", "datatime");
  public static final QueryField DATAVALUE = field("CalibrationBPCIS", "datavalue");
  public static final QueryField TEMPERATURE = field("CalibrationBPCIS", "temperature");
  public static final QueryField GSENSOR = field("CalibrationBPCIS", "gsensor");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String number;
  private final @ModelField(targetType="String") String hwfw;
  private final @ModelField(targetType="Int") Integer golden;
  private final @ModelField(targetType="Int") List<Integer> datatime;
  private final @ModelField(targetType="Int") List<Integer> datavalue;
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
  
  public String getNumber() {
      return number;
  }
  
  public String getHwfw() {
      return hwfw;
  }
  
  public Integer getGolden() {
      return golden;
  }
  
  public List<Integer> getDatatime() {
      return datatime;
  }
  
  public List<Integer> getDatavalue() {
      return datavalue;
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
  
  private CalibrationBPCIS(String id, String number, String hwfw, Integer golden, List<Integer> datatime, List<Integer> datavalue, String temperature, List<Integer> gsensor) {
    this.id = id;
    this.number = number;
    this.hwfw = hwfw;
    this.golden = golden;
    this.datatime = datatime;
    this.datavalue = datavalue;
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
      CalibrationBPCIS calibrationBpcis = (CalibrationBPCIS) obj;
      return ObjectsCompat.equals(getId(), calibrationBpcis.getId()) &&
              ObjectsCompat.equals(getNumber(), calibrationBpcis.getNumber()) &&
              ObjectsCompat.equals(getHwfw(), calibrationBpcis.getHwfw()) &&
              ObjectsCompat.equals(getGolden(), calibrationBpcis.getGolden()) &&
              ObjectsCompat.equals(getDatatime(), calibrationBpcis.getDatatime()) &&
              ObjectsCompat.equals(getDatavalue(), calibrationBpcis.getDatavalue()) &&
              ObjectsCompat.equals(getTemperature(), calibrationBpcis.getTemperature()) &&
              ObjectsCompat.equals(getGsensor(), calibrationBpcis.getGsensor()) &&
              ObjectsCompat.equals(getCreatedAt(), calibrationBpcis.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), calibrationBpcis.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNumber())
      .append(getHwfw())
      .append(getGolden())
      .append(getDatatime())
      .append(getDatavalue())
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
      .append("CalibrationBPCIS {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("number=" + String.valueOf(getNumber()) + ", ")
      .append("hwfw=" + String.valueOf(getHwfw()) + ", ")
      .append("golden=" + String.valueOf(getGolden()) + ", ")
      .append("datatime=" + String.valueOf(getDatatime()) + ", ")
      .append("datavalue=" + String.valueOf(getDatavalue()) + ", ")
      .append("temperature=" + String.valueOf(getTemperature()) + ", ")
      .append("gsensor=" + String.valueOf(getGsensor()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static TemperatureStep builder() {
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
  public static CalibrationBPCIS justId(String id) {
    return new CalibrationBPCIS(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      number,
      hwfw,
      golden,
      datatime,
      datavalue,
      temperature,
      gsensor);
  }
  public interface TemperatureStep {
    BuildStep temperature(String temperature);
  }
  

  public interface BuildStep {
    CalibrationBPCIS build();
    BuildStep id(String id);
    BuildStep number(String number);
    BuildStep hwfw(String hwfw);
    BuildStep golden(Integer golden);
    BuildStep datatime(List<Integer> datatime);
    BuildStep datavalue(List<Integer> datavalue);
    BuildStep gsensor(List<Integer> gsensor);
  }
  

  public static class Builder implements TemperatureStep, BuildStep {
    private String id;
    private String temperature;
    private String number;
    private String hwfw;
    private Integer golden;
    private List<Integer> datatime;
    private List<Integer> datavalue;
    private List<Integer> gsensor;
    public Builder() {
      
    }
    
    private Builder(String id, String number, String hwfw, Integer golden, List<Integer> datatime, List<Integer> datavalue, String temperature, List<Integer> gsensor) {
      this.id = id;
      this.number = number;
      this.hwfw = hwfw;
      this.golden = golden;
      this.datatime = datatime;
      this.datavalue = datavalue;
      this.temperature = temperature;
      this.gsensor = gsensor;
    }
    
    @Override
     public CalibrationBPCIS build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new CalibrationBPCIS(
          id,
          number,
          hwfw,
          golden,
          datatime,
          datavalue,
          temperature,
          gsensor);
    }
    
    @Override
     public BuildStep temperature(String temperature) {
        Objects.requireNonNull(temperature);
        this.temperature = temperature;
        return this;
    }
    
    @Override
     public BuildStep number(String number) {
        this.number = number;
        return this;
    }
    
    @Override
     public BuildStep hwfw(String hwfw) {
        this.hwfw = hwfw;
        return this;
    }
    
    @Override
     public BuildStep golden(Integer golden) {
        this.golden = golden;
        return this;
    }
    
    @Override
     public BuildStep datatime(List<Integer> datatime) {
        this.datatime = datatime;
        return this;
    }
    
    @Override
     public BuildStep datavalue(List<Integer> datavalue) {
        this.datavalue = datavalue;
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
    private CopyOfBuilder(String id, String number, String hwfw, Integer golden, List<Integer> datatime, List<Integer> datavalue, String temperature, List<Integer> gsensor) {
      super(id, number, hwfw, golden, datatime, datavalue, temperature, gsensor);
      Objects.requireNonNull(temperature);
    }
    
    @Override
     public CopyOfBuilder temperature(String temperature) {
      return (CopyOfBuilder) super.temperature(temperature);
    }
    
    @Override
     public CopyOfBuilder number(String number) {
      return (CopyOfBuilder) super.number(number);
    }
    
    @Override
     public CopyOfBuilder hwfw(String hwfw) {
      return (CopyOfBuilder) super.hwfw(hwfw);
    }
    
    @Override
     public CopyOfBuilder golden(Integer golden) {
      return (CopyOfBuilder) super.golden(golden);
    }
    
    @Override
     public CopyOfBuilder datatime(List<Integer> datatime) {
      return (CopyOfBuilder) super.datatime(datatime);
    }
    
    @Override
     public CopyOfBuilder datavalue(List<Integer> datavalue) {
      return (CopyOfBuilder) super.datavalue(datavalue);
    }
    
    @Override
     public CopyOfBuilder gsensor(List<Integer> gsensor) {
      return (CopyOfBuilder) super.gsensor(gsensor);
    }
  }
  

  public static class CalibrationBPCISIdentifier extends ModelIdentifier<CalibrationBPCIS> {
    private static final long serialVersionUID = 1L;
    public CalibrationBPCISIdentifier(String id) {
      super(id);
    }
  }
  
}
