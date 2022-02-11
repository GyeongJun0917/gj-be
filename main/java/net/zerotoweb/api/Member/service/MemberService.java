package net.zerotoweb.api.Member.service;

import net.zerotoweb.api.Buy.Domian.BuyDTO;
import net.zerotoweb.api.Member.domain.MemberDTO;

/**
 * packageName: net.zerotoweb.api.common.service
 * fileName        : MemberService
 * author           : Junggyeongjun
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         Junggyeongjun       최초 생성
 */
public interface MemberService {
  String memList();

  String memInform();

  String mailList();

  String reserve();

  String reserveList();
}