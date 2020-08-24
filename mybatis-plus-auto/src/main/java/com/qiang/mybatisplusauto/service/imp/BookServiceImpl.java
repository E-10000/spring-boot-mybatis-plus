package com.qiang.mybatisplusauto.service.imp;

import com.qiang.mybatisplusauto.entity.Book;
import com.qiang.mybatisplusauto.mapper.BookMapper;
import com.qiang.mybatisplusauto.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小强
 * @since 2020-08-20
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {


}
