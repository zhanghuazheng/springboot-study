package com.huazheng.process.flow.dao;


import com.huazheng.process.flow.entity.Article;

import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/27 19:09
 */
public interface ArticleMapper {
    public List<Article> selectAll();
}
