package com.example.demo.controller;

import com.example.demo.game.DiceGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 결국 Event Handler에 해당한다.
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서의 Event는 무엇인가 ?
    // 사용자가 Web 서버에 URL 요청을 하는 것이다.
    @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해 " +
                "어떤 html 파일이 이를 출력할지 작성한다.");

        return "html_css/success.html";
    }

    @GetMapping("/ul_li")
    public String getUlLi() {
        log.info("Enter getUlLi()");

        return "html_css/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlLi() {
        log.info("Enter getOlLi()");

        return "html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg() {
        log.info("Enter getImg()");

        return "html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag() {
        log.info("Enter getPTag()");

        return "html_css/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote() {
        log.info("Enter getBlockquote()");

        return "html_css/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre() {
        log.info("Enter getPre()");

        return "html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage() {
        log.info("Enter getStylingTestPage()");

        return "html_css/style_page_test.html";
    }

    @GetMapping("/p_options_test")
    public String getPOptionsTest() {
        log.info("Enter getPOptionsTest()");

        return "html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest() {
        log.info("Enter getMarkTest()");

        return "html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest() {
        log.info("Enter getSpanColorTest()");

        return "html_css/span_color_test.html";
    }

    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest() {
        log.info("Enter getUlOlLiTest()");

        return "html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlLiTest() {
        log.info("Enter getUlUlLiTest()");

        return "html_css/ul_ul_li_test.html";
    }

    // 컨트롤러에 새로운 맵핑을 만들어서
    // 사용자가 URL 요청을 하면
    // 주사위 게임이 동작하게 만들어보자!
    // 웹 페이지 출력은 Success로
    // 위에서 만들었던 "html_css/success.html" 를 활용한다.
    // 아직 게임 결과를 출력할 수 없으니
    // 콘솔창에 게임 결과를 출력하도록 한다.
    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }

    @GetMapping("/tableTest")
    public String gettableTest() {
        log.info("Enter tableTest()");

        return "html_css/tableTest.html";
    }

    @GetMapping("/mat3by3Test")
    public String getmat3by3Test(){
        log.info("Enter mat3by3Test");

        return "html_css/mat3by3Test.html";
    }
    
    @GetMapping("/tableTest2")
    public String gettableTest2() {
        log.info("Enter tableTest2");

        return "html_css/tableTest2.html";
    }

    @GetMapping("/captionTest")
    public String getcaptionTest() {
        log.info("Enter captionTest");

        return "html_css/captionTest.html";
    }
    @GetMapping("/tableTest3")
    public String gettableTest3() {
        log.info("Enter tableTest3");

        return "html_css/tableTest3.html";
    }
    @GetMapping("/tableTest4")
    public String getTableTest4() {
        log.info("Enter getTableTest4()");

        return "html_css/tableTest4.html";
    }

    @GetMapping("/tableTest5")
    public String getTableTest5() {
        log.info("Enter getTableTest5()");

        return "html_css/tableTest5.html";
    }

    @GetMapping("/imgAltTest")
    public String getImgAltTest() {
        log.info("Enter getImgAltTest()");

        return "html_css/imgAltTest.html";
    }

    @GetMapping("/imgSizeTest")
    public String getImgTest() {
        log.info("Enter getImgSizeTest()");

        return "html_css/imgSizeTest.html";
    }

    @GetMapping("/imgFigcaptionTest")
    public String getFigcaptionTest() {
        log.info("Enter getFigcaptionTest()");

        return "html_css/imgFigcaptionTest.html";
    }

    @GetMapping("/imgCompanyProfileTest")
    public String getImgCompanyProfileTest() {
        log.info("Enter getImgCompanyProfileTest()");

        return "html_css/imgCompanyProfileTest.html";
    }

    @GetMapping("/aTagTest")
    public String getATagTest() {
        log.info("Enter getATagTest()");

        return "html_css/aTagTest.html";
    }

    @GetMapping("/aTagStyleTest")
    public String getATagStyleTest() {
        log.info("Enter getATagStyleTest()");

        return "html_css/aTagStyleTest.html";
    }

    /* iframe 부분에 예상치 못한 오류가 발생중
       스펙 사항이 바뀌었는지 체크할 필요가 있음 */
    @GetMapping("/iFrameTest")
    public String getIFrameTest() {
        log.info("Enter getIFrameTest()");

        return "html_css/iFrameTest.html";
    }

    @GetMapping("/idCheckTest")
    public String getIdCheckTest() {
        log.info("Enter getIdCheckTest()");

        return "html_css/idCheckTest.html";
    }

    @GetMapping("/visitedTest")
    public String getvisitedTest() {
        log.info("Enter getvisitedTest()");

        return "html_css/visitedTest.html";
    }
    @GetMapping("/roiATagTest")
    public String getRoiATagTest() {
        log.info("Enter getRoiATagTest()");

        return "html_css/roiATagTest.html";
    }

    @GetMapping("/formTest")
    public String getFormTest() {
        log.info("Enter getFormTest()");

        return "html_css/form/formTest.html";
    }

    @GetMapping("/loginFormTest")
    public String getLoginFormTest() {
        log.info("Enter getLoginFormTest()");

        return "html_css/form/loginFormTest.html";
    }

    @GetMapping("/resumeHomework")
    public String getresumeHomework() {
        log.info("Enter getresumeHomework()");

        return "html_css/resume/resumeHomework.html";
    }
}