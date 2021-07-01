package com.moneyheistviktorvranar.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moneyheistviktorvranar.springboot.model.HeistMember;

@Repository
public interface HeistMemberRepository extends JpaRepository<HeistMember, Long>{

}
