package com.lim.kiosk_1

class Exception {

    fun exceptionHandling(type: String): Any {
        when (type) {
            "category" ->
                while (true) {
                    try {
                        val categoryNum = readln().toInt()
                        if (categoryNum in (0..5)) {
                            return categoryNum
                        } else {
                            println("메뉴판 내에서 골라주세요.")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n 숫자를 입력해주세요.\n")
                    }
                }

            "burgerCategory" ->
                while (true) {
                    try {
                        val menuPick = readln().toInt()
                        if (menuPick in (0..4)) {
                            return menuPick
                        } else {
                            println("메뉴판 내에서 골라주세요.")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n숫자를 입력해주세요.\n")
                    }
                }

            "iceCreamCategory" ->
                while (true) {
                    try {
                        val menuPick = readln().toInt()
                        if (menuPick in (0..4)) {
                            return menuPick
                        } else {
                            println("메뉴판 내에서 골라주세요.")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n숫자를 입력해주세요.\n")
                    }
                }

            "drinkCategory" ->
                while (true) {
                    try {
                        val menuPick = readln().toInt()
                        if (menuPick in (0..4)) {
                            return menuPick
                        } else {
                            println("메뉴판 내에서 골라주세요.")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n숫자를 입력해주세요.\n")
                    }

                }

            "beerCategory" ->
                while (true) {
                    try {
                        val menuPick = readln().toInt()
                        if (menuPick in (0..4)) {
                            return menuPick
                        } else {
                            println("메뉴판 내에서 골라주세요.")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n숫자를 입력해주세요.\n")
                    }

                }


            else -> {
                while (true) {
                    try {
                        val choice = readln().toInt()
                        if (choice == 1 || choice == 2) {
                            return choice
                        } else {
                            println("[1] 장바구니 확인\n[2] 장바구니 정리")
                        }
                    } catch (e: NumberFormatException) {
                        println("잘못된 입력입니다.\n숫자를 입력해주세요.\n")
                    }
                }
            }
        }
    }
}