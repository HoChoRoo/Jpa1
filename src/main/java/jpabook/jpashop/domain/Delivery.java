package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery",fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;
                                    //ORDINAL, STRING이 있는데 STRING 으로 쓰자
    @Enumerated(EnumType.STRING)   // ORDINAL 은 1, 2, 3 순서로 들어가는데 중간에 추가되면 복잡함
    private DeliveryStatus status ;//READY, COMP


}
