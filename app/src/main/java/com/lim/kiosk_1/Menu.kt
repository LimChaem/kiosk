package com.lim.kiosk_1

open class Menu {

    open fun displayInfo() {
        println("\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n")
        println("[Lim's Burger MENU]  ")
        println("1.Burger          | 직접 구운 패티로 만든 햄버거.")
        println("2.IceCream        | 없는 맛 빼곤 다있는 아이스 크림.")
        println("3.Drink           | 시원한 음료수")
        println("4.Beer            | 가지각색의 맥주")
        println("0.Close           | 종료")
        println("5.Oder's          | 주문 확인")
    }
}

