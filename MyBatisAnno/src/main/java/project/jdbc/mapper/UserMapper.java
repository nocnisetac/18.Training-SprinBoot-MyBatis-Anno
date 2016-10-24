package project.jdbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import project.jdbc.domain.User;

@Mapper
public interface UserMapper {
	//@Select("select * from city where state = #{state}")
	//City findByState(@Param("state") String state);
	
	@Select("select * from users")
	public List<User> findAll();

	@Select("select * from users where id = #{id}")
	public User findUserById(@Param("id") Integer id);
	
	
	
}
