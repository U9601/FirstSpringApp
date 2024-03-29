package com.firstSpringApplication.springApplication.JavaObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

}
