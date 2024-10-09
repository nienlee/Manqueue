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
  public static final QueryField NAME = field("Man", "name");
  public static final QueryField AGE = field("Man", "age");
  public static final QueryField HEIGHT = field("Man", "height");
  public static final QueryField HR = field("Man", "hr");
  public static final QueryField SLEEP = field("Man", "sleep");
  public static final QueryField HRV = field("Man", "hrv");
  public static final QueryField SPO2 = field("Man", "spo2");
  public static final QueryField PRESSURE = field("Man", "pressure");
  public static final QueryField PERIOD = field("Man", "period");
  public static final QueryField ACTIVITY = field("Man", "activity");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String number;
  private final @ModelField(targetType="String") String name;
  private final @ModelField(targetType="String") String age;
  private final @ModelField(targetType="String") String height;
  private final @ModelField(targetType="String") String hr;
  private final @ModelField(targetType="String") String sleep;
  private final @ModelField(targetType="String") String hrv;
  private final @ModelField(targetType="String") String spo2;
  private final @ModelField(targetType="String") String pressure;
  private final @ModelField(targetType="String") String period;
  private final @ModelField(targetType="String") String activity;
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
  
  public String getName() {
      return name;
  }
  
  public String getAge() {
      return age;
  }
  
  public String getHeight() {
      return height;
  }
  
  public String getHr() {
      return hr;
  }
  
  public String getSleep() {
      return sleep;
  }
  
  public String getHrv() {
      return hrv;
  }
  
  public String getSpo2() {
      return spo2;
  }
  
  public String getPressure() {
      return pressure;
  }
  
  public String getPeriod() {
      return period;
  }
  
  public String getActivity() {
      return activity;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Man(String id, String number, String name, String age, String height, String hr, String sleep, String hrv, String spo2, String pressure, String period, String activity) {
    this.id = id;
    this.number = number;
    this.name = name;
    this.age = age;
    this.height = height;
    this.hr = hr;
    this.sleep = sleep;
    this.hrv = hrv;
    this.spo2 = spo2;
    this.pressure = pressure;
    this.period = period;
    this.activity = activity;
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
              ObjectsCompat.equals(getName(), man.getName()) &&
              ObjectsCompat.equals(getAge(), man.getAge()) &&
              ObjectsCompat.equals(getHeight(), man.getHeight()) &&
              ObjectsCompat.equals(getHr(), man.getHr()) &&
              ObjectsCompat.equals(getSleep(), man.getSleep()) &&
              ObjectsCompat.equals(getHrv(), man.getHrv()) &&
              ObjectsCompat.equals(getSpo2(), man.getSpo2()) &&
              ObjectsCompat.equals(getPressure(), man.getPressure()) &&
              ObjectsCompat.equals(getPeriod(), man.getPeriod()) &&
              ObjectsCompat.equals(getActivity(), man.getActivity()) &&
              ObjectsCompat.equals(getCreatedAt(), man.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), man.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNumber())
      .append(getName())
      .append(getAge())
      .append(getHeight())
      .append(getHr())
      .append(getSleep())
      .append(getHrv())
      .append(getSpo2())
      .append(getPressure())
      .append(getPeriod())
      .append(getActivity())
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
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("age=" + String.valueOf(getAge()) + ", ")
      .append("height=" + String.valueOf(getHeight()) + ", ")
      .append("hr=" + String.valueOf(getHr()) + ", ")
      .append("sleep=" + String.valueOf(getSleep()) + ", ")
      .append("hrv=" + String.valueOf(getHrv()) + ", ")
      .append("spo2=" + String.valueOf(getSpo2()) + ", ")
      .append("pressure=" + String.valueOf(getPressure()) + ", ")
      .append("period=" + String.valueOf(getPeriod()) + ", ")
      .append("activity=" + String.valueOf(getActivity()) + ", ")
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
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      number,
      name,
      age,
      height,
      hr,
      sleep,
      hrv,
      spo2,
      pressure,
      period,
      activity);
  }
  public interface BuildStep {
    Man build();
    BuildStep id(String id);
    BuildStep number(String number);
    BuildStep name(String name);
    BuildStep age(String age);
    BuildStep height(String height);
    BuildStep hr(String hr);
    BuildStep sleep(String sleep);
    BuildStep hrv(String hrv);
    BuildStep spo2(String spo2);
    BuildStep pressure(String pressure);
    BuildStep period(String period);
    BuildStep activity(String activity);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String number;
    private String name;
    private String age;
    private String height;
    private String hr;
    private String sleep;
    private String hrv;
    private String spo2;
    private String pressure;
    private String period;
    private String activity;
    public Builder() {
      
    }
    
    private Builder(String id, String number, String name, String age, String height, String hr, String sleep, String hrv, String spo2, String pressure, String period, String activity) {
      this.id = id;
      this.number = number;
      this.name = name;
      this.age = age;
      this.height = height;
      this.hr = hr;
      this.sleep = sleep;
      this.hrv = hrv;
      this.spo2 = spo2;
      this.pressure = pressure;
      this.period = period;
      this.activity = activity;
    }
    
    @Override
     public Man build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Man(
          id,
          number,
          name,
          age,
          height,
          hr,
          sleep,
          hrv,
          spo2,
          pressure,
          period,
          activity);
    }
    
    @Override
     public BuildStep number(String number) {
        this.number = number;
        return this;
    }
    
    @Override
     public BuildStep name(String name) {
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep age(String age) {
        this.age = age;
        return this;
    }
    
    @Override
     public BuildStep height(String height) {
        this.height = height;
        return this;
    }
    
    @Override
     public BuildStep hr(String hr) {
        this.hr = hr;
        return this;
    }
    
    @Override
     public BuildStep sleep(String sleep) {
        this.sleep = sleep;
        return this;
    }
    
    @Override
     public BuildStep hrv(String hrv) {
        this.hrv = hrv;
        return this;
    }
    
    @Override
     public BuildStep spo2(String spo2) {
        this.spo2 = spo2;
        return this;
    }
    
    @Override
     public BuildStep pressure(String pressure) {
        this.pressure = pressure;
        return this;
    }
    
    @Override
     public BuildStep period(String period) {
        this.period = period;
        return this;
    }
    
    @Override
     public BuildStep activity(String activity) {
        this.activity = activity;
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
    private CopyOfBuilder(String id, String number, String name, String age, String height, String hr, String sleep, String hrv, String spo2, String pressure, String period, String activity) {
      super(id, number, name, age, height, hr, sleep, hrv, spo2, pressure, period, activity);
      
    }
    
    @Override
     public CopyOfBuilder number(String number) {
      return (CopyOfBuilder) super.number(number);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder age(String age) {
      return (CopyOfBuilder) super.age(age);
    }
    
    @Override
     public CopyOfBuilder height(String height) {
      return (CopyOfBuilder) super.height(height);
    }
    
    @Override
     public CopyOfBuilder hr(String hr) {
      return (CopyOfBuilder) super.hr(hr);
    }
    
    @Override
     public CopyOfBuilder sleep(String sleep) {
      return (CopyOfBuilder) super.sleep(sleep);
    }
    
    @Override
     public CopyOfBuilder hrv(String hrv) {
      return (CopyOfBuilder) super.hrv(hrv);
    }
    
    @Override
     public CopyOfBuilder spo2(String spo2) {
      return (CopyOfBuilder) super.spo2(spo2);
    }
    
    @Override
     public CopyOfBuilder pressure(String pressure) {
      return (CopyOfBuilder) super.pressure(pressure);
    }
    
    @Override
     public CopyOfBuilder period(String period) {
      return (CopyOfBuilder) super.period(period);
    }
    
    @Override
     public CopyOfBuilder activity(String activity) {
      return (CopyOfBuilder) super.activity(activity);
    }
  }
  

  public static class ManIdentifier extends ModelIdentifier<Man> {
    private static final long serialVersionUID = 1L;
    public ManIdentifier(String id) {
      super(id);
    }
  }
  
}
