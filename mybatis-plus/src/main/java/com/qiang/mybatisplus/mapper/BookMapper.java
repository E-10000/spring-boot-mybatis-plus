package com.qiang.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiang.mybatisplus.entity.Book;
import com.qiang.mybatisplus.entity.ShopVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

    @Select("select s.*,b.name book_name FROM book b ,shop s where b.id=s.book_id and b.id = #{id}")
    List<ShopVO> shopList(Integer id);
}
