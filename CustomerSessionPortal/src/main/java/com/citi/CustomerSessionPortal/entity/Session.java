package com.citi.CustomerSessionPortal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="session")
public class Session {
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
    private LocalDateTime createdOn;

    @Column(name = "updatedOn")
    private Date updatedOn;

    @Column(name = "status")
    private String status;

    @Column(name = "customerName")
    private String customerName;

}
