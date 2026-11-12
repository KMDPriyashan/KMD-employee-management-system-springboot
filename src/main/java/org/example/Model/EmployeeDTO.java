package org.example.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {

    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String department;
    private String position;
    private Double salary;

}
