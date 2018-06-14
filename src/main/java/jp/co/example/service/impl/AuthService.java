package jp.co.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import jp.co.example.dao.impl.AuthDao;
import jp.co.example.dao.impl.SelectDao;
import jp.co.example.entity.UserEntity;

public class AuthService {



	@Autowired
	private SelectDao select;

	@Autowired
	private AuthDao login;

	//全件表示
	public List<UserEntity> findAll (){
		return select.findAll();
	}


	//IDとPASSを基にadminテーブルに該当するレコードを返す
	public Admin getAdmin (String id, String pass) {
		return login.login(id, pass);
	}


}
