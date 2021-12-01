package com.mousumi.stockexchange.application.service;

import java.util.List;

import com.mousumi.stockexchange.application.dto.CompanyDto;
import com.mousumi.stockexchange.application.dto.StockExchangeDto;

public interface StockExchangeService 
{
	public List<StockExchangeDto> getStockExchangesList();
	public StockExchangeDto findById(String id);
	public StockExchangeDto addStockExchange(StockExchangeDto stockExchangeDto);
	public StockExchangeDto editStockExchange(StockExchangeDto stockExchangeDto);
	public void deleteStockExchange(String id);
	public List<CompanyDto> getCompanies(String id);
	public StockExchangeDto addCompanyToStockExchange(String stockExchangeName, CompanyDto companyDto);
}
