package com.qiang.mybatisplus.controller;

import com.qiang.mybatisplus.entity.Book;
import com.qiang.mybatisplus.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookMapper bookMapper;

    @GetMapping("/test")
    public List<Book> test(){
        List<Book> books = bookMapper.selectList(null);
        return books;
    }

}
