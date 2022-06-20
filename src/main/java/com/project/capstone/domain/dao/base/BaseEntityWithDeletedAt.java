package com.project.capstone.domain.dao.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)

public abstract class BaseEntityWithDeletedAt extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    // @JsonIgnore
    // @Builder.Default
    // private Boolean deleted = Boolean.FALSE;

}