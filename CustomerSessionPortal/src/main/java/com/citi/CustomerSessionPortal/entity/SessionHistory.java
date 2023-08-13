package com.citi.CustomerSessionPortal.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="session_History")
public class SessionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sessionID")
    private Long sessionId;

    @Column(name = "sessionName")
    private String sessionName;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "updatedBy")
    private String updatedBy;

    @Column(name = "createdOn")
    private Date createdOn;

    @Column(name = "updatedOn")
    private Date updatedOn;

    @Column(name = "status")
    private String status;

    @Column(name = "customerName")
    private String customerName;

}
