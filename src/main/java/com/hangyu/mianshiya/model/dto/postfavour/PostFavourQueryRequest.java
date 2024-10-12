package com.hangyu.mianshiya.model.dto.postfavour;

import com.hangyu.mianshiya.model.dto.post.PostQueryRequest;
import com.hangyu.mianshiya.common.PageRequest;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
 * @author <a href="https://github.com/lihangyu">瑞克五代</a>
 * @from <a href="https://hangyu.icu">编程导航知识星球</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}