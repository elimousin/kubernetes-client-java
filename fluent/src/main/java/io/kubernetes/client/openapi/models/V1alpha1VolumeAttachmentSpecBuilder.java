package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1VolumeAttachmentSpecBuilder extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluentImpl<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1VolumeAttachmentSpecBuilder() {
        this(true);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1VolumeAttachmentSpec(), validationEnabled);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1VolumeAttachmentSpec(), validationEnabled);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec instance) {
        this(fluent, instance, true);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAttacher(instance.getAttacher());
        
        fluent.withNodeName(instance.getNodeName());
        
        fluent.withSource(instance.getSource());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec instance) {
        this(instance,true);
    }

    public V1alpha1VolumeAttachmentSpecBuilder(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAttacher(instance.getAttacher());
        
        this.withNodeName(instance.getNodeName());
        
        this.withSource(instance.getSource());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec build() {
        V1alpha1VolumeAttachmentSpec buildable = new V1alpha1VolumeAttachmentSpec();
        buildable.setAttacher(fluent.getAttacher());
        buildable.setNodeName(fluent.getNodeName());
        buildable.setSource(fluent.getSource());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1VolumeAttachmentSpecBuilder that = (V1alpha1VolumeAttachmentSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
