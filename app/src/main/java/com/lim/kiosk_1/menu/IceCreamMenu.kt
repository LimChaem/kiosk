package com.lim.kiosk_1.menu

import com.lim.kiosk_1.Menu

class IceCreamMenu : Menu() {

    override fun displayInfo() {
        println("\n[ Ice Cream Menu ]\n")
        println("1.Vanila Ice Cream      | W 3.5 | 바닐라맛 아이스크림.")
        println("2.Choco Ice Cream       | W 3.5 | 초코맛 아이스크림.")
        println("3.Strawberry Ice Cream  | W 3.5 | 딸기맛 아이스크림.")
        println("4.Mini Melts            | W 4.5 | 구슬 아이스크림.")
        println("0.Back                  | 뒤로가기")
    }

}

