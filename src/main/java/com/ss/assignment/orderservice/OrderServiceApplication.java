package com.ss.assignment.orderservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping(path = "order")
	public @ResponseBody Order placeOrder(@RequestParam Integer customerID, @RequestParam String items) {
		Order order = new Order();
		order.setCustomerid(customerID);
		order.setItems(items);
		return orderRepository.save(order);
	}

	@GetMapping(path= "getorders")
	public @ResponseBody Iterable<Order> getOrders()
	{
		return orderRepository.findAll();
	}

	@GetMapping(path= "getorder")
	public @ResponseBody Optional<Order> getOrderByID(@RequestParam Integer orderID)
	{
		return orderRepository.findById(orderID);
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
}
