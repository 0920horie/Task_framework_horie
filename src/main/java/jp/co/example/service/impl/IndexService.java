package jp.co.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.dao.impl.IndexDao;
import jp.co.example.dao.impl.SelectDao;
import jp.co.example.entity.Admin;
import jp.co.example.entity.UserEntity;

@Service
public class IndexService {


	@Autowired
	private SelectDao search;

	@Autowired
	private IndexDao login;

	//全件表示
	public List<UserEntity> findAll (){
		return search.findAll();
	}


	//IDとPASSを基にadminテーブルに該当するレコードを返す
	public Admin getAdmin (String id, String pass) {
		return login.login(id, pass);
	}

}
