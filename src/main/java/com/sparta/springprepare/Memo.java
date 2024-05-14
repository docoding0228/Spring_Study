package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @RequestAttribute - final 선언시만 사용
public class Memo {
    private String username;
    private String contents;

/**
 * public void setUsername(String username) {
 *       this.username = username;
 *   }
 * public String getUsername() {
 *       return this.username;
 *   }
 **/
}

class Main
{
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("test");
        System.out.println(memo.getUsername());
    }
}