package me.jaewoo.jwtTutorial.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {//토큰 정보를 response할 때 사용

	private String token;
}
