package com.firstSpringApplication.springApplication.JavaObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

}
