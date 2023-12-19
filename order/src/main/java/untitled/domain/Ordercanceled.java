package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Ordercanceled extends AbstractEvent {

    private Long id;

    public Ordercanceled(Order aggregate) {
        super(aggregate);
    }

    public Ordercanceled() {
        super();
    }
}
//>>> DDD / Domain Event
