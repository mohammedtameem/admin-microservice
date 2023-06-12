package com.dell.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_assignment")
public class UserAssignment implements Serializable {


    @Id
    private int id;
    private String emailId;
    private String assisgnment;
    private Date assesment_date;
    private String type;

}