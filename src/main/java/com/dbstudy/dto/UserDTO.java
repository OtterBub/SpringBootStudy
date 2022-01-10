package com.dbstudy.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("user")
@Getter
@Setter
@ToString
public class UserDTO {
    int id;
    String name;
    String gender;
    String city;

    public UserDTO() {}

    public UserDTO(int id, String name, String gender, String city) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.city = city;
    }

    public UserDTO(String name) {
        super();
        this.name = name;
    }
}
