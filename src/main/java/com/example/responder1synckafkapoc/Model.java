package com.example.responder1synckafkapoc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Model {
    private int firstNumber;
    private int secondNumber;
    @JsonIgnore
    public Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
