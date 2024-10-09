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

/** This is an auto generated class representing the Man type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Men", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "owner", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
}, hasLazySupport = true)
public final class Man implements Model {
  public static final ManPath rootPath = new ManPath("root", false, null);
  public static final QueryField ID = field("Man", "id");
  public static final QueryField NUMBER = field("Man", "number");
  public static final QueryField HWVERSION = field("Man", "hwversion");
  public static final QueryField FWVERSION = field("Man", "fwversion");
  public static final QueryField MODE = field("Man", "mode");
  public static final QueryField FUNCTION = field("Man", "function");
  public static final QueryField PREDVALUE = field("Man", "predvalue");
  public static final QueryField DATATIME = field("Man", "datatime");
  public static final QueryField DATAVALUE = field("Man", "datavalue");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String number;
  private final @ModelField(targetType="String") String hwversion;
  private final @ModelField(targetType="String") String fwversion;
  private final @ModelField(targetType="String") String mode;
  private final @ModelField(targetType="String") String function;
  private final @ModelField(targetType="String") String predvalue;
  private final @ModelField(targetType="String") String datatime;
  private final @ModelField(targetType="String") String datavalue;
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
  
  public String getHwversion() {
      return hwversion;
  }
  
  public String getFwversion() {
      return fwversion;
  }
  
  public String getMode() {
      return mode;
  }
  
  public String getFunction() {
      return function;
  }
  
  public String getPredvalue() {
      return predvalue;
  }
  
  public String getDatatime() {
      return datatime;
  }
  
  public String getDatavalue() {
      return datavalue;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Man(String id, String number, String hwversion, String fwversion, String mode, String function, String predvalue, String datatime, String datavalue) {
    this.id = id;
    this.number = number;
    this.hwversion = hwversion;
    this.fwversion = fwversion;
    this.mode = mode;
    this.function = function;
    this.predvalue = predvalue;
    this.datatime = datatime;
    this.datavalue = datavalue;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Man man = (Man) obj;
      return ObjectsCompat.equals(getId(), man.getId()) &&
              ObjectsCompat.equals(getNumber(), man.getNumber()) &&
              ObjectsCompat.equals(getHwversion(), man.getHwversion()) &&
              ObjectsCompat.equals(getFwversion(), man.getFwversion()) &&
              ObjectsCompat.equals(getMode(), man.getMode()) &&
              ObjectsCompat.equals(getFunction(), man.getFunction()) &&
              ObjectsCompat.equals(getPredvalue(), man.getPredvalue()) &&
              ObjectsCompat.equals(getDatatime(), man.getDatatime()) &&
              ObjectsCompat.equals(getDatavalue(), man.getDatavalue()) &&
              ObjectsCompat.equals(getCreatedAt(), man.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), man.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNumber())
      .append(getHwversion())
      .append(getFwversion())
      .append(getMode())
      .append(getFunction())
      .append(getPredvalue())
      .append(getDatatime())
      .append(getDatavalue())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Man {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("number=" + String.valueOf(getNumber()) + ", ")
      .append("hwversion=" + String.valueOf(getHwversion()) + ", ")
      .append("fwversion=" + String.valueOf(getFwversion()) + ", ")
      .append("mode=" + String.valueOf(getMode()) + ", ")
      .append("function=" + String.valueOf(getFunction()) + ", ")
      .append("predvalue=" + String.valueOf(getPredvalue()) + ", ")
      .append("datatime=" + String.valueOf(getDatatime()) + ", ")
      .append("datavalue=" + String.valueOf(getDatavalue()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
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
  public static Man justId(String id) {
    return new Man(
      id,
      null,
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
      hwversion,
      fwversion,
      mode,
      function,
      predvalue,
      datatime,
      datavalue);
  }
  public interface BuildStep {
    Man build();
    BuildStep id(String id);
    BuildStep number(String number);
    BuildStep hwversion(String hwversion);
    BuildStep fwversion(String fwversion);
    BuildStep mode(String mode);
    BuildStep function(String function);
    BuildStep predvalue(String predvalue);
    BuildStep datatime(String datatime);
    BuildStep datavalue(String datavalue);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String number;
    private String hwversion;
    private String fwversion;
    private String mode;
    private String function;
    private String predvalue;
    private String datatime;
    private String datavalue;
    public Builder() {
      
    }
    
    private Builder(String id, String number, String hwversion, String fwversion, String mode, String function, String predvalue, String datatime, String datavalue) {
      this.id = id;
      this.number = number;
      this.hwversion = hwversion;
      this.fwversion = fwversion;
      this.mode = mode;
      this.function = function;
      this.predvalue = predvalue;
      this.datatime = datatime;
      this.datavalue = datavalue;
    }
    
    @Override
     public Man build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Man(
          id,
          number,
          hwversion,
          fwversion,
          mode,
          function,
          predvalue,
          datatime,
          datavalue);
    }
    
    @Override
     public BuildStep number(String number) {
        this.number = number;
        return this;
    }
    
    @Override
     public BuildStep hwversion(String hwversion) {
        this.hwversion = hwversion;
        return this;
    }
    
    @Override
     public BuildStep fwversion(String fwversion) {
        this.fwversion = fwversion;
        return this;
    }
    
    @Override
     public BuildStep mode(String mode) {
        this.mode = mode;
        return this;
    }
    
    @Override
     public BuildStep function(String function) {
        this.function = function;
        return this;
    }
    
    @Override
     public BuildStep predvalue(String predvalue) {
        this.predvalue = predvalue;
        return this;
    }
    
    @Override
     public BuildStep datatime(String datatime) {
        this.datatime = datatime;
        return this;
    }
    
    @Override
     public BuildStep datavalue(String datavalue) {
        this.datavalue = datavalue;
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
    private CopyOfBuilder(String id, String number, String hwversion, String fwversion, String mode, String function, String predvalue, String datatime, String datavalue) {
      super(id, number, hwversion, fwversion, mode, function, predvalue, datatime, datavalue);
      
    }
    
    @Override
     public CopyOfBuilder number(String number) {
      return (CopyOfBuilder) super.number(number);
    }
    
    @Override
     public CopyOfBuilder hwversion(String hwversion) {
      return (CopyOfBuilder) super.hwversion(hwversion);
    }
    
    @Override
     public CopyOfBuilder fwversion(String fwversion) {
      return (CopyOfBuilder) super.fwversion(fwversion);
    }
    
    @Override
     public CopyOfBuilder mode(String mode) {
      return (CopyOfBuilder) super.mode(mode);
    }
    
    @Override
     public CopyOfBuilder function(String function) {
      return (CopyOfBuilder) super.function(function);
    }
    
    @Override
     public CopyOfBuilder predvalue(String predvalue) {
      return (CopyOfBuilder) super.predvalue(predvalue);
    }
    
    @Override
     public CopyOfBuilder datatime(String datatime) {
      return (CopyOfBuilder) super.datatime(datatime);
    }
    
    @Override
     public CopyOfBuilder datavalue(String datavalue) {
      return (CopyOfBuilder) super.datavalue(datavalue);
    }
  }
  

  public static class ManIdentifier extends ModelIdentifier<Man> {
    private static final long serialVersionUID = 1L;
    public ManIdentifier(String id) {
      super(id);
    }
  }
  
}
