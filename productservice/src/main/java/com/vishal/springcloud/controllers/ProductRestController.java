package com.vishal.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vishal.springcloud.dto.Coupon;
import com.vishal.springcloud.model.Product;
import com.vishal.springcloud.repos.productRepo;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@Autowired
	private productRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${couponService.url}")
	private String couponServiceUrl;
	
	@RequestMapping(value = "/products" , method = RequestMethod.POST)
	public Product create(@RequestBody Product product)
	{
		//Coupon coupon = restTemplate.getForObject("http://localhost:8080/coupanapi/coupon/"+product.getCouponCode(), Coupon.class);  // when we get response from coupon service we deserialize that info in this coupon class 
		Coupon coupon = restTemplate.getForObject(couponServiceUrl+product.getCouponCode(), Coupon.class);
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);
	}
}
