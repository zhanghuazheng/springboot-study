package com.huazheng.process.flow.service;

import com.huazheng.process.flow.entity.Article;
import com.huazheng.process.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author zhanghuazheng
 * @date 2021/4/27 19:15
 */
@SpringBootTest
class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @Test
    void selectAll() {
        List<Article> articles = articleService.selectAll();
        articles.stream().forEach(System.out::print);
    }
}