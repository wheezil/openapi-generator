/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * TypeHolderExample
 */

@XmlRootElement(name = "TypeHolderExample")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "TypeHolderExample")
public class TypeHolderExample {
  @JsonProperty("string_item")
  @JacksonXmlProperty(localName = "string_item")
  @XmlElement(name = "string_item")
  private String stringItem;

  @JsonProperty("number_item")
  @JacksonXmlProperty(localName = "number_item")
  @XmlElement(name = "number_item")
  private BigDecimal numberItem;

  @JsonProperty("integer_item")
  @JacksonXmlProperty(localName = "integer_item")
  @XmlElement(name = "integer_item")
  private Integer integerItem;

  @JsonProperty("bool_item")
  @JacksonXmlProperty(localName = "bool_item")
  @XmlElement(name = "bool_item")
  private Boolean boolItem;

  @JsonProperty("array_item")
  // Is a container wrapped=false
  // items.name=arrayItem items.baseName=arrayItem items.xmlName= items.xmlNamespace=
  // items.example= items.type=Integer
  @XmlElement(name = "arrayItem")
  private List<Integer> arrayItem = new ArrayList<Integer>();

  public TypeHolderExample stringItem(String stringItem) {
    this.stringItem = stringItem;
    return this;
  }

   /**
   * Get stringItem
   * @return stringItem
  **/
  @ApiModelProperty(example = "what", required = true, value = "")
  public String getStringItem() {
    return stringItem;
  }

  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }

  public TypeHolderExample numberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
    return this;
  }

   /**
   * Get numberItem
   * @return numberItem
  **/
  @ApiModelProperty(example = "1.234", required = true, value = "")
  public BigDecimal getNumberItem() {
    return numberItem;
  }

  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }

  public TypeHolderExample integerItem(Integer integerItem) {
    this.integerItem = integerItem;
    return this;
  }

   /**
   * Get integerItem
   * @return integerItem
  **/
  @ApiModelProperty(example = "-2", required = true, value = "")
  public Integer getIntegerItem() {
    return integerItem;
  }

  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }

  public TypeHolderExample boolItem(Boolean boolItem) {
    this.boolItem = boolItem;
    return this;
  }

   /**
   * Get boolItem
   * @return boolItem
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean getBoolItem() {
    return boolItem;
  }

  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }

  public TypeHolderExample arrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderExample addArrayItemItem(Integer arrayItemItem) {
    this.arrayItem.add(arrayItemItem);
    return this;
  }

   /**
   * Get arrayItem
   * @return arrayItem
  **/
  @ApiModelProperty(example = "[0, 1, 2, 3]", required = true, value = "")
  public List<Integer> getArrayItem() {
    return arrayItem;
  }

  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderExample typeHolderExample = (TypeHolderExample) o;
    return Objects.equals(this.stringItem, typeHolderExample.stringItem) &&
        Objects.equals(this.numberItem, typeHolderExample.numberItem) &&
        Objects.equals(this.integerItem, typeHolderExample.integerItem) &&
        Objects.equals(this.boolItem, typeHolderExample.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderExample.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, integerItem, boolItem, arrayItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderExample {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

