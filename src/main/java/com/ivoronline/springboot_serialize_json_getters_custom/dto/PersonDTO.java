package com.ivoronline.springboot_serialize_json_getters_custom.dto;

public class PersonDTO {

  //PROPERTIES                                                //Names should match Getters
  public String name;
  public Float  height;

  //GETTERS (Used for Serialization)
  public String  getName  () { return "Getter " + name; }
  public String  getHeight() { return convert(height);  }     //Return String instead of Float

  //CONVERTERS
  public String convert(Float height) {
    String heightString    = Float.toString(height);          //Height for  DTO:  Parse String into Float
    String heightFormatted = heightString.replace(".", ",");  //Height from JSON: Replace dot with comma
    return heightFormatted;                                   //Return converted height
  }

}
