package com.lim.kiosk_1

import com.lim.kiosk_1.menu.BeerMenu
import com.lim.kiosk_1.menu.BurgerMenu
import com.lim.kiosk_1.menu.DrinkMenu
import com.lim.kiosk_1.menu.IceCreamMenu
import com.lim.kiosk_1.menu.MenuDetail


fun main() {
    val menu = MenuDetail()
    val exception = Exception()
    var choice = 0
    val oder = mutableListOf<String>()
    var totalPrice = 0



    while (true) {

        Menu().displayInfo()
        when (exception.exceptionHandling("category").toString().toInt()) {
            0 -> {
                println("주문을 종료합니다.")
                break
            }

            1 -> {
                while (true) {
                    BurgerMenu().displayInfo()
                    val burgerCategory =
                        exception.exceptionHandling("burgerCategory").toString().toInt()
                    if (burgerCategory == 0) {
                        break
                    }
                    val i = burgerCategory
                    oder += menu.burgerMenu.get(i - 1)
                    totalPrice += menu.bergerPrice.get(i - 1)
                    println("${menu.burgerMenu.get(i - 1)}가 장바구니에 추가되었습니다.")
                }

            }

            2 -> {
                while (true) {
                    IceCreamMenu().displayInfo()
                    val iceCreamCategory =
                        exception.exceptionHandling("iceCreamCategory").toString().toInt()
                    if (iceCreamCategory == 0) {
                        break
                    }
                    val i = iceCreamCategory
                    oder += menu.iceCreamMenu.get(i - 1)
                    totalPrice += menu.iceCreamPrice.get((i - 1))
                    println("${menu.iceCreamMenu.get(i - 1)}가 장바구니에 추가되었습니다.")

                }

            }

            3 -> {

                DrinkMenu().displayInfo()
                val drinkCategory =
                    exception.exceptionHandling("drinkCategory").toString().toInt()
                if (drinkCategory == 0) {
                    break
                }
                val i = drinkCategory
                oder += menu.drinkMenu.get(i - 1)
                totalPrice += menu.drinkPrice.get((i - 1))
                println("${menu.drinkMenu.get(i - 1)}가 장바구니에 추가되었습니다.")

            }

            4 -> {

                BeerMenu().displayInfo()
                val beerCategory =
                    exception.exceptionHandling("beerCategory").toString().toInt()
                if (beerCategory == 0) {
                    break
                }
                val i = beerCategory
                oder += menu.beerMenu.get(i - 1)
                totalPrice += menu.beerPrice.get((i - 1))
                println("${menu.beerMenu.get(i - 1)}가 장바구니에 추가되었습니다.")

            }

            5 -> {

                println("[1] 장바구니 확인\n[2] 장바구니 정리")
                choice = exception.exceptionHandling("oder").toString().toInt()
                if (choice == 1) {
                    println("현재 ${oder.joinToString(",")}\n총 ${oder.size}개 상품이 담겨있습니다.")
                    println("총 결제 금액은 ${totalPrice}원 입니다.\n돌아가시려면 아무 키나 입력해주세요.")

                    //계산 미구현, 장바구니 내역 확인하기 위해 데이터 input 전까지 화면 고정할 수 있도록 readln() 해놓음
                    val pick = readln()

                } else {
                    oder.clear()
                    totalPrice = 0
                    println("상품 목록을 비웠습니다.")
                }
            }

        }
    }

}




