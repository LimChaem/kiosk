package com.lim.kiosk_1.menu

import com.lim.kiosk_1.Menu

class BeerMenu : Menu() {

    override fun displayInfo() {
        println("\n[ Beers ]\n")
        println("1.Ale           | W 3.5 | 단 맛과 풀 바디감! 기본적인 에일 맥주")
        println("2.Porter        | W 3.5 | 영국의 대표적인 흑맥주")
        println("3.Stout         | W 3.5 | 아일랜드의 대표적인 흑맥주")
        println("4.Hefe Weissbier| W 4.5 | 독일 바이에른주의 유명 회사의 대표적인 맥주")
        println("0.Back          | 뒤로가기")
    }
}
