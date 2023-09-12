package kitchenpos.eatinorder.eatintable.application.port.in;

import java.util.List;
import java.util.UUID;

import kitchenpos.eatinorder.eatintable.domain.EatInTable;

public interface EatinTableUseCase {
	EatInTable create(final EatInTable request);

	EatInTable sit(final UUID orderTableId);

	EatInTable clear(final UUID orderTableId);

	EatInTable changeNumberOfGuests(final UUID orderTableId, final EatInTable request);

	List<EatInTable> findAll();
}