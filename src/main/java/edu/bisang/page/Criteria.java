package edu.bisang.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Criteria {

  private int pageNum;
  private int amount;

  //마리아 DB 용
  private int startPage;
  
  private String type;
  private String keyword;

  public Criteria() {
    this(1, 10);
  }

  public Criteria(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }

  public int getstartPage() {
    return (pageNum -1) * amount;
  }

  public String[] getTypeArr() {
    
    return type == null? new String[] {}: type.split("");
  }
}
