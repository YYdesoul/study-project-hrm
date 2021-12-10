package com.ihrm.common.entity;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据响应对象
 *    {
 *      success ：是否成功
 *      code    ：返回码
 *      message ：返回信息
 *      //返回数据
 *      data：  ：{
 *
 *      }
 *    }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {

  private boolean isSuccess;
  private Integer code;
  private String message;
  private Object data;

  public Result(ResultCode resultCode) {
    this.isSuccess = resultCode.isSuccess;
    this.code = resultCode.code;
    this.message = resultCode.message;
  }

  public static Result SUCCESS(){
    return new Result(ResultCode.SUCCESS);
  }

  public static Result ERROR(){
    return new Result(ResultCode.SERVER_ERROR);
  }

  public static Result FAIL(){
    return new Result(ResultCode.FAIL);
  }

}
