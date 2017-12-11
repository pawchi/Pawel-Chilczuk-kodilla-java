package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    @Override
    public boolean createOrder(Product product, User user) {
        System.out.println("Ordered product by user :"+user.getNick()+" is : "+product.getItemName()+ "; Quantity :"+product.getQuantity());
        return true;
    }
}
