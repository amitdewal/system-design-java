/**
 * 
 */
package com.system.ad.microservices.pattern.strangler;


/**
 * 
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private LegacyOrderService legacyOrderService;

    @Autowired
    private NewOrderService newOrderService;

    // Already migrated to new system
    @GetMapping("/{id}")
    public OrderResponse getOrder(@PathVariable Long id) {
        return newOrderService.getOrder(id);
    }

    // Not migrated yet — still using old code
    @PostMapping
    public OrderResponse createOrder(@RequestBody OrderRequest request) {
        return legacyOrderService.createOrder(request);
    }
}
