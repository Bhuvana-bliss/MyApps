package com.studentinfo.model.request;


import java.math.BigDecimal;

import lombok.Data;

@Data
public class CreateStudentRequest {

    private String name;
    private String registerNo;
    private String mail;
    private BigDecimal fees;
}
