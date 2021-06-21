package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class VersionInfoBuilder extends io.kubernetes.client.openapi.models.VersionInfoFluentImpl<io.kubernetes.client.openapi.models.VersionInfoBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.VersionInfo,io.kubernetes.client.openapi.models.VersionInfoBuilder> {

    io.kubernetes.client.openapi.models.VersionInfoFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public VersionInfoBuilder() {
        this(true);
    }

    public VersionInfoBuilder(java.lang.Boolean validationEnabled) {
        this(new VersionInfo(), validationEnabled);
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfoFluent<?> fluent) {
        this(fluent, true);
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfoFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new VersionInfo(), validationEnabled);
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfoFluent<?> fluent,io.kubernetes.client.openapi.models.VersionInfo instance) {
        this(fluent, instance, true);
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfoFluent<?> fluent,io.kubernetes.client.openapi.models.VersionInfo instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withBuildDate(instance.getBuildDate());
        
        fluent.withCompiler(instance.getCompiler());
        
        fluent.withGitCommit(instance.getGitCommit());
        
        fluent.withGitTreeState(instance.getGitTreeState());
        
        fluent.withGitVersion(instance.getGitVersion());
        
        fluent.withGoVersion(instance.getGoVersion());
        
        fluent.withMajor(instance.getMajor());
        
        fluent.withMinor(instance.getMinor());
        
        fluent.withPlatform(instance.getPlatform());
        
        this.validationEnabled = validationEnabled; 
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfo instance) {
        this(instance,true);
    }

    public VersionInfoBuilder(io.kubernetes.client.openapi.models.VersionInfo instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withBuildDate(instance.getBuildDate());
        
        this.withCompiler(instance.getCompiler());
        
        this.withGitCommit(instance.getGitCommit());
        
        this.withGitTreeState(instance.getGitTreeState());
        
        this.withGitVersion(instance.getGitVersion());
        
        this.withGoVersion(instance.getGoVersion());
        
        this.withMajor(instance.getMajor());
        
        this.withMinor(instance.getMinor());
        
        this.withPlatform(instance.getPlatform());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.VersionInfo build() {
        VersionInfo buildable = new VersionInfo();
        buildable.setBuildDate(fluent.getBuildDate());
        buildable.setCompiler(fluent.getCompiler());
        buildable.setGitCommit(fluent.getGitCommit());
        buildable.setGitTreeState(fluent.getGitTreeState());
        buildable.setGitVersion(fluent.getGitVersion());
        buildable.setGoVersion(fluent.getGoVersion());
        buildable.setMajor(fluent.getMajor());
        buildable.setMinor(fluent.getMinor());
        buildable.setPlatform(fluent.getPlatform());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VersionInfoBuilder that = (VersionInfoBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
