package com.mysite.sbb.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passEncoder;
	
	// 새로운 유저 생성하고 비밀번호 암호화하여 리턴
	public SiteUser create(String username, String email, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setEmail(email);
        // 암호화된 패스워드가 입력된다
        user.setPassword(passEncoder.encode(password));
        this.userRepo.save(user);
        return user;
    }
	
	//유저이름으로 유저객체를 리턴
    public SiteUser getUser(String username) {
        Optional<SiteUser> siteUser = this.userRepo.findByUsername(username);
        if (siteUser.isPresent()) {
            return siteUser.get();
        } else {
            throw new DataNotFoundException("siteuser not found");
        }
    }
	
}
