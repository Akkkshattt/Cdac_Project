package com.pcbuilder.dto;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;

import com.pcbuilder.entity.Address;
import com.pcbuilder.entity.User;

import lombok.Data;

@Data
public class UserDto {
	
	private int id;

	private String firstName;

	private String lastName;
	
	private String shopName;

	private String emailId;

	private String phoneNo;

	private String role;

	private Address address;

	private String status;
	
	private BigDecimal walletAmount;
	
	public static UserDto toUserDtoEntity(User user) {
		UserDto userDto =new UserDto();
		BeanUtils.copyProperties(user, userDto);		
		return userDto;
	}

}
