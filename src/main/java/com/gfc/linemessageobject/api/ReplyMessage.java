package com.gfc.linemessageobject.api;

import java.util.Arrays;
import com.gfc.linemessageobject.BaseMessage;

public class ReplyMessage {
  private String replyToken;
  private BaseMessage[] messages;
  
  public ReplyMessage(String replyToken, BaseMessage[] messages) {
      this.replyToken = replyToken;
      this.messages = messages;
  }

  public String getReplyToken() {
      return replyToken;
  }
  
  public void setReplyToken(String replyToken) {
      this.replyToken = replyToken;
  }

  public BaseMessage[] getMessages() {
      return messages;
  }

  public void setMessages(BaseMessage[] messages) {
      this.messages = messages;
  }

  @Override
  public String toString() {
      return "{\"replyToken\":\""+replyToken+"\", \"messages\":"+Arrays.toString(messages)+"}";
  }

}
