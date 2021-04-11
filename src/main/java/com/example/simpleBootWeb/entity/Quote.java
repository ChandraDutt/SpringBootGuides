package com.example.simpleBootWeb.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//This is entity class which is used in Consuming REST services controller
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	//JsonProperty annotation to demonstrate handling the change in variable name and key in JSON doc
  @JsonProperty("type")
  private String status;
  private Value value;

  public Quote() {
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Value getValue() {
    return value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  //However the data returned from Jackson in JSON is same with key annotated i.e., type
  //below method is used in logging the info
  @Override
  public String toString() {
    return "Quote{" +
        "status='" + status + '\'' +
        ", value=" + value +
        '}';
  }
}