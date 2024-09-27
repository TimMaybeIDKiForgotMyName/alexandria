package com.example.alexandria;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {
    private String available;
    private String unavailable;
}
