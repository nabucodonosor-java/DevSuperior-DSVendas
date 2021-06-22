package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.domain.Page;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	private SellerDto seller;

	public SaleDto() {
	}

	public SaleDto(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDto(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDto getSeller() {
		return seller;
	}

	public void setSeller(SellerDto seller) {
		this.seller = seller;
	}

	public static Page<SaleDto> converter(Page<Sale> list) {
		// return list.stream().map(SaleDto::new).collect(Collectors.toList());
		return list.map(SaleDto::new);
	}

}
