package com.ihrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 公共的返回码
 *    返回码code：
 *      成功：10000
 *      失败：10001
 *      未登录：10002
 *      未授权：10003
 *      抛出异常：99999
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

  SUCCESS(true, 10000, "操作成功"),
  //---系统错误返回码-----
  FAIL(false,10001,"操作失败"),
  UNAUTHENTICATED(false,10002,"您还未登录"),
  UNAUTHORISE(false,10003,"权限不足"),
  SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),

  //---用户操作返回码  2xxxx----
  MOBILEORPASSWORDERROR(false,20001,"用户名或密码错误");


  //---用户操作返回码  3xxxx----
  //---权限操作返回码----
  //---其他操作返回码----

  boolean isSuccess;   // 操作是否成功
  int code;   // 操作代码
  String message;   // 提示信息


}
