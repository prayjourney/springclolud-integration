package com.zgy.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/13 16:55
 * @Modified by:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Police implements Serializable {
    @TableId
    private Integer id;
    private String name;
    private String dbName;
}
