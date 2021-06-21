package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1RoleBuilder extends io.kubernetes.client.openapi.models.V1alpha1RoleFluentImpl<io.kubernetes.client.openapi.models.V1alpha1RoleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1Role,io.kubernetes.client.openapi.models.V1alpha1RoleBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1RoleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1RoleBuilder() {
        this(true);
    }

    public V1alpha1RoleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1Role(), validationEnabled);
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1RoleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1RoleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1Role(), validationEnabled);
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1RoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Role instance) {
        this(fluent, instance, true);
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1RoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Role instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1Role instance) {
        this(instance,true);
    }

    public V1alpha1RoleBuilder(io.kubernetes.client.openapi.models.V1alpha1Role instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1Role build() {
        V1alpha1Role buildable = new V1alpha1Role();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setRules(fluent.getRules());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1RoleBuilder that = (V1alpha1RoleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
