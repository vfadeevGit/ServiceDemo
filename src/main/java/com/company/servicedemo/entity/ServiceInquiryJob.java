package com.company.servicedemo.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@JmixEntity
@Table(name = "SERVICE_INQUIRY_JOB", indexes = {
        @Index(name = "IDX_SERVICEINQUIRYJOB_JOB_ID", columnList = "JOB_ID")
})
@Entity
public class ServiceInquiryJob {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "JOB_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Job job;

    @Column(name = "QUANTITY", nullable = false, precision = 10, scale = 2)
    @NotNull
    private BigDecimal quantity;

    @JoinColumn(name = "SERVICE_INQUIRY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private ServiceInquiry serviceInquiry;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public ServiceInquiry getServiceInquiry() {
        return serviceInquiry;
    }

    public void setServiceInquiry(ServiceInquiry serviceInquiry) {
        this.serviceInquiry = serviceInquiry;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}