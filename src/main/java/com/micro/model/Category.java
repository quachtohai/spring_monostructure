package com.micro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class Category {
private Long categoryId;
private String categorycode;
private String categoryname;
private String images;
private boolean status;

}
