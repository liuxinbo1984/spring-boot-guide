package com.example.jpa.quick.entity;

import com.example.jpa.quick.core.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room extends BaseEntity {
	private String title;
	private Long userId;
}
