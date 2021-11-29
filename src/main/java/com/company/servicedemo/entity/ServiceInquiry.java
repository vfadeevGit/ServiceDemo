package com.company.servicedemo.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "SERVICE_INQUIRY", indexes = {
        @Index(name = "IDX_SERVICEINQUIRY", columnList = "CUSTOMER_ID"),
        @Index(name = "IDX_SERVICEINQUIRY", columnList = "INITIATOR_ID"),
        @Index(name = "IDX_SERVICEINQUIRY", columnList = "RESPONSIBLE_ID")
})
@Entity
public class ServiceInquiry {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_REGISTER", nullable = false)
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateRegister;

    @InstanceName
    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    @NotNull
    private String description;

    @Composition
    @OneToMany(mappedBy = "serviceInquiry")
    private List<ServiceInquiryJob> jobList;

    @Column(name = "INQUIRY_ID", length = 10)
    private String inquiryID;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CUSTOMER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "INITIATOR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User initiator;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "RESPONSIBLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User responsible;

    public List<ServiceInquiryJob> getJobList() {
        return jobList;
    }

    public void setJobList(List<ServiceInquiryJob> jobList) {
        this.jobList = jobList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    public User getInitiator() {
        return initiator;
    }

    public void setInitiator(User initiator) {
        this.initiator = initiator;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getInquiryID() {
        return inquiryID;
    }

    public void setInquiryID(String inquiryID) {
        this.inquiryID = inquiryID;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}