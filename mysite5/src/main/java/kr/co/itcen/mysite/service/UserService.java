package kr.co.itcen.mysite.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.itcen.mysite.repository.UserDao;
import kr.co.itcen.mysite.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	@Transactional
	public void join(UserVo vo) {
		userDao.insert(vo);
	}

	public UserVo getUser(UserVo vo) {
		return userDao.get(vo);
	}

	public Boolean existUser(String email) {
		return userDao.get(email) != null;
	}

	public UserVo getUser(Long no) {
		return null;
	}
}
