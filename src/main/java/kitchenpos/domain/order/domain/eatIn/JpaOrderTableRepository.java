package kitchenpos.domain.order.domain.eatIn;

import kitchenpos.domain.order.domain.eatIn.OrderTable;
import kitchenpos.domain.order.domain.eatIn.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
