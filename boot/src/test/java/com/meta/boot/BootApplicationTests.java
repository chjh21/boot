package com.meta.boot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meta.boot.board.dao.BoardMapper;
import com.meta.boot.board.dao.UserMapper;
import com.meta.boot.board.dto.BoardDto;
import com.meta.boot.board.dto.UserDto;
import com.meta.boot.board.service.BoardService;
import com.meta.boot.board.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class BootApplicationTests {

	@Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;
    @Autowired
    private UserService uService;
    @Autowired
    private BoardService bService;
    
//	@Test
//	void userTest() {
//        UserDto user = new UserDto();
//        user.setUserId("test");
//        user.setUserPw("test");
//        user.setUserName("테스트");
//        user.setUserGender("남");
//        user.setUserEmail("test@test.test");
//        uMapper.insertUser(user);
//        System.out.println(uMapper.selectOneUser("test"));
//    }
//    
//	@Test
//    public void boardTest() {
//        BoardDto board = new BoardDto();
//        board.setPassword("1234");
//        board.setWriter("test");
//        bMapper.insertBoard(board);
//        
//        System.out.println(bMapper.selectOneBoard(0));
//    }
    
    @Test
    public void boardTest1() {
        BoardDto board = new BoardDto();
        board.setNum(1);
        board.setPassword("test2");
        board.setWriter("test2");
        bService.write(board);
        
        for (BoardDto b : bService.getBoardList())
            System.out.println(b);
    }
    
    @Test
    public void userTest1() {
        UserDto user = new UserDto();
        user.setUserId("test2");
        user.setUserPw("test2");
        user.setUserName("테스트2");
        user.setUserGender("남");
        user.setUserEmail("test@test.test");
        uService.join(user);
        System.out.println(uService.getUser("test2"));
        System.out.println("로그인 결과 : " + uService.login("test2", "test2"));
    }
}
