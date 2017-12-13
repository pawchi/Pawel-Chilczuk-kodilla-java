package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService,
                          final OrderRepository orderRepository,
                          final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrderd = orderService.createOrder(orderRequest.getProduct(),orderRequest.getUser());
        if(isOrderd){
            informationService.sendInfoToUser(orderRequest.getUser());
            orderRepository.sendOrder(orderRequest.getUser(),orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
