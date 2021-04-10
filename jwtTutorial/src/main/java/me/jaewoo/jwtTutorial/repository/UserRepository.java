package me.jaewoo.jwtTutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import me.jaewoo.jwtTutorial.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	// 유저 네임을 기준으로 유저정보 + 권한 정보를 같이 가져옴
	@EntityGraph(attributePaths = "authorities") //@EntityGraph 해당 쿼리가 수행될 때 Eager 조회로 authorities 정보를 같이 가져오게한다
	Optional<User> findOneWithAuthoritiesByUsername(String username);

}
