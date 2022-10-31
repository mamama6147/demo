package com.example.demo2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
class MainController(@Autowired private val service:HelloService) {

    @GetMapping("/hello")
    fun getHello(model: Model): String {
        //hello.htmlに画面遷移
        return "hello"
        //相対パスを指定
    }

    @PostMapping("/hello")
    fun postRequest(@RequestParam text1: String, model: Model):String{

        //画面から受け取った文字列をModelに登録
        model.addAttribute("sample",text1)

        //response.htmlに画面遷移
        return "hello/response"
    }

    @PostMapping("/hello/db")
    fun postDbRequest(@RequestParam text2: Int, model: Model): String {

        // 1件検索
        val member: Member = service.getMember(text2)

        // 検索結果をModelに登録
        model.addAttribute("member", member)

        // db.htmlに画面遷移
        return "hello/db"
    }
}