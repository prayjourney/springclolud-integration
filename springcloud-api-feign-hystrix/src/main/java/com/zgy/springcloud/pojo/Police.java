package com.zgy.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: renjiaxin
 * @Despcription:
 * @Date: Created in 2020/9/13 16:55
 * @Modified by:
 */
@Getter
@Setter
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
