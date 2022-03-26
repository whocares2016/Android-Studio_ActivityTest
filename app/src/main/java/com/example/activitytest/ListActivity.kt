package com.example.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    val teacher = arrayListOf<Teacher>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        initData()
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = TeacherAdapter(teacher)

    }

    private fun initData() {

        for( i in 0..10) {

            teacher.add(Teacher().apply {
                name = "萧逸"
                description=
                    "萧逸是一位职业的赛车手，曾蝉联四届R1赛车锦标赛冠军，凭借自己的实力早早便成为了体育届的奇迹。在大众眼里，他是个桀骜不驯的赛车手，鲜少有人知晓隐藏的另一种身份则是LONGDAY工会的赏金猎人，而在赏金猎人的世界，不论黑白，只论强弱。"
                avatar = R.mipmap.xy
            })

            teacher.add(Teacher().apply {
                name = "陆沉"
                description =
                    "陆沉是万甄集团CEO，系家族企业。所属的陆氏是一支需要家族血脉来维持的族群，称之为血族。"
                avatar = R.mipmap.lc
            })
            teacher.add(Teacher().apply {
                name = "齐司礼"
                description =
                    "齐司礼，国际顶级设计师。十年前，曾用一场秀改变了整个业界风向，而后隐退。现因某些事接受陆沉邀请，重新在世人眼前出现，担任万甄集团Warson品牌设计中心总监，负责Warson旗下全部的高级定制系列，并接手了副线Pristine品牌。"
                avatar = R.mipmap.qsl
            })
            teacher.add(Teacher().apply {
                name = "夏鸣星"
                description =
                    "夏鸣星十四岁前在光启市生活，后前往法国，并作为音乐剧演员出道。二十一岁回到光启市，并在国内发展。"
                avatar = R.mipmap.xmx
            })
            teacher.add(Teacher().apply {
                name = "查理苏"
                description =
                    "查理苏来自世界四大财阀之一NOVATEN药业集团，既是查家独子也是集团唯一继承人。因家世显赫，有“钻石王老五”之称，经常登上“有钱人迷惑行为大赏”并广为流传。同时在光启第一人民医院就职烧伤整形科医生，医术精湛专业能力强，在工作时会表现出与平日不同的认真一面。"
                avatar = R.mipmap.zls
            })
        }

    }
}