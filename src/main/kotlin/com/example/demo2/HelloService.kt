package com.example.demo2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HelloService(@Autowired private val repository: HelloRepository) {

    /** 従業員を1人取得する  */
    fun getMember(id: Int): Member {

        //検索
        val map = repository.findById(id)

        //Mapから値を取得
        val memberId = map["id"]
        val name = map["name"]
        val rank = map["rank"]

        //Memberクラスに値をセット
        val member= Member()
        member.memberId= memberId as Int
        member.memberName= name as String
        member.memberRank= rank as String
        return member
    }
}