package com.example.spring0205.controller;

import com.game.DiceGame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Controller는 결국 Event Handler에 해당한다
// 몰컴하다 부모님이 뜨면 자는척 하다가 다시 게임하기 등등
@Controller
public class Html5Css3PageController {
    public static Logger log =
            LoggerFactory.getLogger(Html5Css3PageController.class);

    // 결국 Controller 입장에서 Event는 무엇인가?
    // 사용자가 Web 서버에 URL 요청을 하는 것이다.
            @GetMapping("/first")
    public String getFirst() {
        log.info("Enter getFirst()");

        log.info("여기에 서비스 요청하는 코드를 작성한다.");

        log.info("요청을 처리하고 받아온 결과에 대해 " +
                "어떤 html 파일이 이를 출력할지 작성한다.");

        return "html_css/success.html";
        // 리턴 하면 Spring은 이 파일을 랜더링(뷰)를 한다.
    }

    @GetMapping("/ul_li")
    public String getUlli(){
        log.info("Enter getUlli()");

        return"html_css/ul_li.html";
    }

    @GetMapping("/ol_li")
    public String getOlli(){
        log.info("Enter getOlli()");

        return"html_css/ol_li.html";
    }

    @GetMapping("/img_test")
    public String getImg(){
        log.info("Enter getImg()");

        return"html_css/img_test.html";
    }

    @GetMapping("/p_test")
    public String getPTag(){
        log.info("Enter getPTag()");

        return"html_css/p_test.html";
    }

    @GetMapping("/blockquote_test")
    public String getBlockquote(){
        log.info("Enter getBlockquote()");

        return"html_css/blockquote_test.html";
    }

    @GetMapping("/pre_test")
    public String getPre(){
        log.info("Enter getPre()");

        return"html_css/pre_test.html";
    }

    @GetMapping("/style_page_test")
    public String getStylingTestPage(){
        log.info("Enter getStylingTestPage()");

        return"html_css/style_page_test.html";
    }


    @GetMapping("/p_options_test")
    public String getPOptionsTest(){
        log.info("Enter getPOptionsTest()");

        return"html_css/p_options_test.html";
    }

    @GetMapping("/mark_test")
    public String getMarkTest(){
        log.info("Enter getMarkTest()");

        return"html_css/mark_test.html";
    }

    @GetMapping("/span_color_test")
    public String getSpanColorTest(){
        log.info("Enter getSpanColorTest()");

        return"html_css/span_color_test.html";
    }
    @GetMapping("/ul_ol_li_test")
    public String getUlOlLiTest(){
        log.info("Enter getUlOlLiTest()");

        return"html_css/ul_ol_li_test.html";
    }

    @GetMapping("/ul_ul_li_test")
    public String getUlUlLiTest(){
        log.info("Enter getUlUlLiTest()");

        return"html_css/ul_ul_li_test.html";
    }
    @GetMapping("/diceGame")
    public String getDiceGame() {
        log.info("Enter getDiceGame()");

        DiceGame dg = new DiceGame();
        dg.printWinner();

        return "html_css/success.html";
    }
    @GetMapping("/tableTest")
    public String getTableTest() {
        log.info("Enter getTableTest()");


        return "html_css/tableTest.html";
    }
    @GetMapping("/mat3by3Test")
    public String getMat3by3Test() {
        log.info("Enter getMat3by3Test()");


        return "html_css/mat3by3Test.html";
    }
    @GetMapping("/tableTest2")
    public String getTableTest2() {
        log.info("Enter getTableTest2()");


        return "html_css/tableTest2.html";
    }
    @GetMapping("/captionTest")
    public String getCaptionTest() {
        log.info("Enter getCaptionTest()");


        return "html_css/captionTest.html";
    }
    @GetMapping("/tableTest3")
    public String getTableTest3() {
        log.info("Enter getTableTest3()");


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
    public String getImgSizeTest() {
        log.info("Enter getImgSizeTest()");


        return "html_css/imgSizeTest.html";
    }
    @GetMapping("/imgFigcaptionTest")
    public String getImgFigcaptionTest() {
        log.info("Enter getImgFigcaptionTest()");


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
    public String getVisitedTest() {
        log.info("Enter getVisitedTest()");


        return "html_css/visitedTest.html";
    }
    @GetMapping("/roiATagTest")
    public String getroiATagTest() {
        log.info("Enter getroiATagTest()");


        return "html_css/roiATagTest.html";
    }
    @GetMapping("/formTest")
    public String getformTest() {
        log.info("Enter getformTest()");


        return "html_css/formTest.html";
    }
    @GetMapping("/loginFormTest")
    public String getloginformTest() {
        log.info("Enter getloginformTest()");


        return "html_css/loginFormTest.html";
    }
}

