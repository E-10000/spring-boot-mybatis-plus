package com.qiang.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiang.mybatisplus.entity.Book;
import com.qiang.mybatisplus.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
       Book book1 =bookMapper.selectById(31);
       book1.setName("一号");

        Book book2 =bookMapper.selectById(31);
        book2.setName("二号");

        bookMapper.updateById(book1);
        bookMapper.updateById(book2);
    }

//    @Test
//    void select(){
//        List<Book> books = bookMapper.selectList(null);
//        for (Book book:books ) {
//            System.out.println(book);
//        }
//    }
    @Test
    void insert(){
        Book book=new Book();
        book.setAuthor("作者");
        book.setName("名字");
        bookMapper.insert(book);
    }


    @Test
    void save(){
        Book book=new Book();
        book.setName("这是一本书");
        book.setAuthor("我是作者");
        bookMapper.insert(book);
        System.out.println(book);
    }

    @Test
    void update(){
        Book book=bookMapper.selectById(31);
        book.setName("这是另外一本书的名字");
        bookMapper.updateById(book);
    }

    @Test
    void delete(){
        bookMapper.deleteById(1);
    }

    @Test
    void select(){
        QueryWrapper wrapper = new QueryWrapper();
//        Map<String,Object> map = new HashMap<>();

        Page<Book> page = new Page<>(3,2);
        Page<Book> result = bookMapper.selectPage(page, null);
        System.out.println(result.getSize());
        System.out.println(result.getTotal());

        List<Book> books = result.getRecords();
        for (Book book:books) {
            System.out.println(book);
        }


//        List<Book> books = bookMapper.selectList(wrapper);
//        for (Book book:books) {
//            System.out.println(book);
//        }
    }

    @Test
    public void myQuery(){
        System.out.println(bookMapper.shopList(1));
    }

}
