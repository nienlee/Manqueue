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

/** This is an auto generated class representing the TestBPCIS type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "TestBPCIS", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "owner", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
}, hasLazySupport = true)
public final class TestBPCIS implements Model {
  public static final TestBPCISPath rootPath = new TestBPCISPath("root", false, null);
  public static final QueryField ID = field("TestBPCIS", "id");
  public static final QueryField NUMBER = field("TestBPCIS", "number");
  public static final QueryField HWFW = field("TestBPCIS", "hwfw");
  public static final QueryField GOLDEN = field("TestBPCIS", "golden");
  public static final QueryField DATATIME = field("TestBPCIS", "datatime");
  public static final QueryField DATAVALUE = field("TestBPCIS", "datavalue");
  public static final QueryField TEMPERATURE = field("TestBPCIS", "temperature");
  public static final QueryField GSENSOR = field("TestBPCIS", "gsensor");
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
  
  private TestBPCIS(String id, String number, String hwfw, Integer golden, List<Integer> datatime, List<Integer> datavalue, String temperature, List<Integer> gsensor) {
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
      TestBPCIS testBpcis = (TestBPCIS) obj;
      return ObjectsCompat.equals(getId(), testBpcis.getId()) &&
              ObjectsCompat.equals(getNumber(), testBpcis.getNumber()) &&
              ObjectsCompat.equals(getHwfw(), testBpcis.getHwfw()) &&
              ObjectsCompat.equals(getGolden(), testBpcis.getGolden()) &&
              ObjectsCompat.equals(getDatatime(), testBpcis.getDatatime()) &&
              ObjectsCompat.equals(getDatavalue(), testBpcis.getDatavalue()) &&
              ObjectsCompat.equals(getTemperature(), testBpcis.getTemperature()) &&
              ObjectsCompat.equals(getGsensor(), testBpcis.getGsensor()) &&
              ObjectsCompat.equals(getCreatedAt(), testBpcis.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), testBpcis.getUpdatedAt());
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
      .append("TestBPCIS {")
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
  public static TestBPCIS justId(String id) {
    return new TestBPCIS(
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
    TestBPCIS build();
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
     public TestBPCIS build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new TestBPCIS(
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
  

  public static class TestBPCISIdentifier extends ModelIdentifier<TestBPCIS> {
    private static final long serialVersionUID = 1L;
    public TestBPCISIdentifier(String id) {
      super(id);
    }
  }
  
}
