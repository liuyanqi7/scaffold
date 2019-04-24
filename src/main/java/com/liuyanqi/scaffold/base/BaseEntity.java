package com.liuyanqi.scaffold.base;


import lombok.Data;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
    @MappedSuperclass
    @EntityListeners({AuditingEntityListener.class})
    public class BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, length = 22, unique = true)
        protected Long id;



        @Version
        @Column(name = "type", nullable = false)
        protected Integer type;

}
