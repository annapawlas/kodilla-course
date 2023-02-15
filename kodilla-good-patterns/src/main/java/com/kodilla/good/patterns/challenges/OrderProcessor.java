package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate(),
                orderRequest.getProduct());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderDate(),
                    orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrderDate(),orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getOrderDate(),orderRequest.getProduct(), false);
        }
    }
}
