package kr.co.lotteon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MyController {
    @Autowired
    private BuildProperties buildProperties; // 빌드 정보를 갖는 객체 주입

    @ModelAttribute("appInfo")
    public String appversion(){
        String appName = buildProperties.getName(); // settings.gradle 파일에서 앱이름 가져옴
        String version = buildProperties.getVersion(); // build.gradle 파일에서 버전값 가져옴
        return appName+version;
    }

    @GetMapping("/my/home")
    public String home(Model model){
        return "/my/home";
    }
    @GetMapping("/my/coupon")
    public String coupon(Model model){
        return "/my/coupon";
    }
    @GetMapping("/my/info")
    public String info(Model model){
        return "/my/info";
    }
    @GetMapping("/my/order")
    public String order(Model model){
        return "/my/order";
    }
    @GetMapping("/my/point")
    public String point(Model model){
        return "/my/point";
    }
    @GetMapping("/my/qna")
    public String qna(Model model){
        return "/my/qna";
    }
    @GetMapping("/my/review")
    public String review(Model model){
        return "/my/review";
    }
}