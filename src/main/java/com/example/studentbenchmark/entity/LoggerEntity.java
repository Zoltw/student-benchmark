package com.example.studentbenchmark.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class LoggerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLog;

    private String userLog;

    private Date dateOfLog;

    private String logContext;

    public LoggerEntity(String userLog, Date dateOfLog, String logContext) {
        this.userLog = userLog;
        this.dateOfLog = dateOfLog;
        this.logContext = logContext;
    }

    public LoggerEntity() {

    }


    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    public String getUserLog() {
        return userLog;
    }

    public void setUserLog(String userLog) {
        this.userLog = userLog;
    }


    public Date getDateOfLog() {
        return dateOfLog;
    }

    public void setDateOfLog(Date dateOfLog) {
        this.dateOfLog = dateOfLog;
    }

    public String getLogContext() {
        return logContext;
    }

    public void setLogContext(String logContext) {
        this.logContext = logContext;
    }
}
