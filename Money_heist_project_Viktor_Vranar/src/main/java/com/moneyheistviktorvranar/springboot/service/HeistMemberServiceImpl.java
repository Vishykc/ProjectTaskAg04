package com.moneyheistviktorvranar.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyheistviktorvranar.springboot.model.HeistMember;
import com.moneyheistviktorvranar.springboot.repository.HeistMemberRepository;

@Service
public class HeistMemberServiceImpl implements HeistMemberService {

	@Autowired
	private HeistMemberRepository heistMemberRepository;
	
	@Override
	public List<HeistMember> getAllHeistMembers() {
		return heistMemberRepository.findAll();
	}

}
