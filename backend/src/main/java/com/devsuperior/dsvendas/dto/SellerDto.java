package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	public SellerDto() {
	}

	public SellerDto(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<SellerDto> converter(List<Seller> list) {
		return list.stream().map(SellerDto::new).collect(Collectors.toList());

	}

}
