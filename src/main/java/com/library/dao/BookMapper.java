package com.library.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.library.bean.Book;
import com.library.bean.BookState;

@Mapper
public interface BookMapper {
	@Select("select * from library_book")
	public List<Book> getBook() throws Exception;
	
	//public void updateBook(Book book) throws Exception;
	@Select("select * from library_book where name like '%#{name}%'")
	public List<Book> getBookName(String name) throws Exception;
	@Insert("insert into book_state(id,name,date,state)values(#{id},#{name},#{date},#{state})")
	public void insertState(Book book) throws Exception;
	
	@Select("select * from book_state")
	public List<BookState> getState() throws Exception;
	@Update("update book_state set state = #{state} where id = #{id}")
	public void updateState(BookState bookstate) throws Exception;
	@Select("select * from book_state order by date Desc")
	public List<Book> getStateDate() throws Exception;
	
	
}
