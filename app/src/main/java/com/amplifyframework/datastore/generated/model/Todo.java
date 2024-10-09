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

/** This is an auto generated class representing the Todo type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Todos", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
}, hasLazySupport = true)
public final class Todo implements Model {
  public static final TodoPath rootPath = new TodoPath("root", false, null);
  public static final QueryField ID = field("Todo", "id");
  public static final QueryField CONTENT = field("Todo", "content");
  public static final QueryField IS_DONE = field("Todo", "isDone");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String content;
  private final @ModelField(targetType="Boolean") Boolean isDone;
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
  
  public String getContent() {
      return content;
  }
  
  public Boolean getIsDone() {
      return isDone;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Todo(String id, String content, Boolean isDone) {
    this.id = id;
    this.content = content;
    this.isDone = isDone;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Todo todo = (Todo) obj;
      return ObjectsCompat.equals(getId(), todo.getId()) &&
              ObjectsCompat.equals(getContent(), todo.getContent()) &&
              ObjectsCompat.equals(getIsDone(), todo.getIsDone()) &&
              ObjectsCompat.equals(getCreatedAt(), todo.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), todo.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getContent())
      .append(getIsDone())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Todo {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("content=" + String.valueOf(getContent()) + ", ")
      .append("isDone=" + String.valueOf(getIsDone()) + ", ")
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
  public static Todo justId(String id) {
    return new Todo(
      id,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      content,
      isDone);
  }
  public interface BuildStep {
    Todo build();
    BuildStep id(String id);
    BuildStep content(String content);
    BuildStep isDone(Boolean isDone);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String content;
    private Boolean isDone;
    public Builder() {
      
    }
    
    private Builder(String id, String content, Boolean isDone) {
      this.id = id;
      this.content = content;
      this.isDone = isDone;
    }
    
    @Override
     public Todo build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Todo(
          id,
          content,
          isDone);
    }
    
    @Override
     public BuildStep content(String content) {
        this.content = content;
        return this;
    }
    
    @Override
     public BuildStep isDone(Boolean isDone) {
        this.isDone = isDone;
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
    private CopyOfBuilder(String id, String content, Boolean isDone) {
      super(id, content, isDone);
      
    }
    
    @Override
     public CopyOfBuilder content(String content) {
      return (CopyOfBuilder) super.content(content);
    }
    
    @Override
     public CopyOfBuilder isDone(Boolean isDone) {
      return (CopyOfBuilder) super.isDone(isDone);
    }
  }
  

  public static class TodoIdentifier extends ModelIdentifier<Todo> {
    private static final long serialVersionUID = 1L;
    public TodoIdentifier(String id) {
      super(id);
    }
  }
  
}
