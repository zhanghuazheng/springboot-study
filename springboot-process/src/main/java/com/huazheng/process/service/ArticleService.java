package com.huazheng.process.service;

import com.huazheng.process.flow.dao.ArticleMapper;
import com.huazheng.process.flow.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/27 19:10
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> selectAll(){
        List<Article> articles = articleMapper.selectAll();
        return articles;
    }
}
