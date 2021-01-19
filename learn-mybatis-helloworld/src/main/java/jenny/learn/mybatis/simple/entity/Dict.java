package jenny.learn.mybatis.simple.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Dict {
    private String id;
    private String pid;
    private String code;
    private String name;
    private Boolean leaf;
    private String remark;
    private Integer status;
    private Date createTime;
    private Integer orderNo;
}
