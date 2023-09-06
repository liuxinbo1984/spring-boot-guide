package com.example.jpa.quick.entity;

import com.example.jpa.quick.core.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

/**
 * @author jack
 */
@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Production extends BaseEntity {
    private String title;
}
