package com.lim.kiosk_1.menu

import com.lim.kiosk_1.Menu

class BurgerMenu : Menu() {

    override fun displayInfo() {
        println("\n[ Burgers Menu ]\n")
        println("1.Cheese Burger       | W 6.9 | 통모짜렐라 치즈가 듬뿍 들어간 치즈 버거")
        println("2.Shrimp Burger       | W 8.9 | 통새우로 만든 패티, 신선한 새우 버거")
        println("3.Double Patty Burger | W 9.4 | 두툼한 패티가 두 장, 맛도 더블 양도 더블, 더블 패티 버거")
        println("4.Hamburger           | W 5.4 | 맛의 근본, 기본 햄버거")
        println("0.Back                | 뒤로가기")
    }

}

