package com.gfc.linemessageobject;

public class BaseMessage {
  private String type;
  public BaseMessage(String type) {
      this.type = type;
  }
  
  public void setType(String type) {
      this.type = type;
  }
  public String getType() {
      return type;
  }

}
