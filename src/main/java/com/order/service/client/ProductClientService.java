package com.order.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.order.entity.ProductEntity;

@FeignClient("product-service")
public interface ProductClientService {

	@RequestMapping(value ="/products/{pid}", method = RequestMethod.GET,  consumes= MediaType.APPLICATION_JSON_VALUE)
	public ProductEntity getProduct(@PathVariable("pid") Integer pid) ;
}
