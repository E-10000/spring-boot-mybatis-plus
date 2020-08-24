package com.qiang.mybatisplusauto.controller;


import com.qiang.mybatisplusauto.entity.Book;
import com.qiang.mybatisplusauto.service.BookService;
import com.qiang.mybatisplusauto.service.imp.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小强
 * @since 2020-08-20
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("index")
    public List<Book> index(){
        List<Book> list = bookService.list();
        return list;
    }


}

