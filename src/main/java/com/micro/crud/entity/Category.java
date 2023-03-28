package com.micro.crud.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Table(name ="_category")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID")
	private long categoryId;
	
	@Column (name = "CategoryCode", columnDefinition = "nvarchar(200)")
	private String categorycode;
	
	@Column (name = "CategoryName", columnDefinition = "nvarchar(200)")
	private String categoryname;
	
	@Column(name ="Images")
	private String images;
	
	@Column(name="Status")
	private boolean status;
}
