package mr.demonid.service.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Запрос на резервирование товара.
 */
@Data
@AllArgsConstructor
public class ProductReservationRequest {

    private UUID orderId;
    private long userId;
    private long shopId;
    private long productId;
    private int quantity;
    private BigDecimal price;

}
