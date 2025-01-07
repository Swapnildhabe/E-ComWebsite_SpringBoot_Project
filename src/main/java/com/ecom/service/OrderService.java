package com.ecom.service;

import java.util.List;

import org.hibernate.query.Page;

import com.ecom.model.OrderRequest;
import com.ecom.model.ProductOrder;

public interface OrderService {

	public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;

	public List<ProductOrder> getOrdersByUser(Integer userId);

	public ProductOrder updateOrderStatus(Integer id, String status);

	public List<ProductOrder> getAllOrders();

	public ProductOrder getOrdersByOrderId(String orderId);

	public org.springframework.data.domain.Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);

}
