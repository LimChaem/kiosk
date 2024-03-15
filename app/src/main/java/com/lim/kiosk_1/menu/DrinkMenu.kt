package com.lim.kiosk_1.menu

import com.lim.kiosk_1.Exception
import com.lim.kiosk_1.Menu

class DrinkMenu : Menu() {


    override fun displayInfo() {
        println("\n[ Drinks ]\n")
        println("1.Coke         | W 3.5 | 시원한 탄산 음료 콜라")
        println("2.Sprite       | W 3.5 | 깔끔한 탄산 음료 사이다")
        println("3.Orange Juice | W 3.5 | 오렌지 쥬스")
        println("4.Zero Kcal    | W 4.5 | 제로 칼로리 음료")
        println("0.Back         | 뒤로가기")

    }
}

