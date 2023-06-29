package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;
import com.mysite.sbb.user.SiteUser;
import com.mysite.sbb.user.UserService;

@SpringBootTest
class SbbApplicationTests {
	
//	@Autowired
//	private QuestionRepository qRepo;
//	@Autowired
//	private AnswerRepository aRepo;

	@Autowired
	private QuestionService qService;
	
	@Autowired
	private UserService uService;
	
	@Test
	void contextLoads() {
		
		SiteUser user = uService.getUser("hong");
		
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.qService.create(subject, content, user);
		}
		
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		qRepo.save(q1);// 첫번째 질문 저장
//		
//		Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.qRepo.save(q2); 
		
//		// 질문을 다 찾을 때
//		List<Question> all = qRepo.findAll();
//		assertEquals(2, all.size());
//		
//		for(Question q : all) {
//			System.out.println(q.getSubject()); //질문 제목
//		}
		
//		Optional<Question> oq = qRepo.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			System.out.println(q.getContent()); //첫번째 질문 내용
//		}
		
		// subject내용이 똑같아야한다
//		Question q = qRepo.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
		
		//데이터 수정하기
//		Optional<Question> oq = this.qRepo.findById(1);
//        assertTrue(oq.isPresent()); //존재하는지 true 체크
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        // save ? update : JPA에선 id가 있다면 update 사용한다, 없다면 save
//        this.qRepo.save(q); 
		
		//삭제하기
//		qRepo.deleteById(1); //첫번째 질문삭제
		
		//답변 테스트
//		Optional<Question> oq = this.qRepo.findById(36);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//        a.setCreateDate(LocalDateTime.now());
//        this.aRepo.save(a);
        
		// 답변을 조회하기
//		Optional<Answer> oa = this.aRepo.findById(1);//첫번째 답변
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(36, a.getQuestion().getId());//답변에해당하는 질문의 객체의 ID찾음
//        
		
	}

}
