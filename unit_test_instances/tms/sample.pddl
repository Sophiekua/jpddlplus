(define (problem prob1)
(:domain domain-tms-2-3-light)
(:requirements :strips :typing)
(:objects
   kiln0 - kiln8
   pone0 - piecetype1
   pone1 - piecetype1
   pone2 - piecetype1
   pone3 - piecetype1
   pone4 - piecetype1
   pone5 - piecetype1
   pone6 - piecetype1
   pone7 - piecetype1
   pone8 - piecetype1
   pone9 - piecetype1
   pone10 - piecetype1
   pone11 - piecetype1
   pone12 - piecetype1
   pone13 - piecetype1
   pone14 - piecetype1
   pone15 - piecetype1
   pone16 - piecetype1
   pone17 - piecetype1
   pone18 - piecetype1
   pone19 - piecetype1
   ptwo0 - piecetype2
   ptwo1 - piecetype2
   ptwo2 - piecetype2
   ptwo3 - piecetype2
   ptwo4 - piecetype2
   ptwo5 - piecetype2
   ptwo6 - piecetype2
   ptwo7 - piecetype2
   ptwo8 - piecetype2
   ptwo9 - piecetype2
   ptwo10 - piecetype2
   ptwo11 - piecetype2
   ptwo12 - piecetype2
   ptwo13 - piecetype2
   ptwo14 - piecetype2
   ptwo15 - piecetype2
   ptwo16 - piecetype2
   ptwo17 - piecetype2
   ptwo18 - piecetype2
   ptwo19 - piecetype2
   ptwo20 - piecetype2
   ptwo21 - piecetype2
   ptwo22 - piecetype2
   ptwo23 - piecetype2
   ptwo24 - piecetype2
   ptwo25 - piecetype2
   ptwo26 - piecetype2
   ptwo27 - piecetype2
   ptwo28 - piecetype2
   ptwo29 - piecetype2
   pthree0 - piecetype3
   pthree1 - piecetype3
   pthree2 - piecetype3
   pthree3 - piecetype3
   pthree4 - piecetype3
   pthree5 - piecetype3
   pthree6 - piecetype3
   pthree7 - piecetype3
   pthree8 - piecetype3
   pthree9 - piecetype3
   pthree10 - piecetype3
   pthree11 - piecetype3
   pthree12 - piecetype3
   pthree13 - piecetype3
   pthree14 - piecetype3
   pthree15 - piecetype3
   pthree16 - piecetype3
   pthree17 - piecetype3
   pthree18 - piecetype3
   pthree19 - piecetype3
   pthree20 - piecetype3
   pthree21 - piecetype3
   pthree22 - piecetype3
   pthree23 - piecetype3
   pthree24 - piecetype3
   pthree25 - piecetype3
   pthree26 - piecetype3
   pthree27 - piecetype3
   pthree28 - piecetype3
   pthree29 - piecetype3
   pthree30 - piecetype3
   pthree31 - piecetype3
   pthree32 - piecetype3
   pthree33 - piecetype3
   pthree34 - piecetype3
   pthree35 - piecetype3
   pthree36 - piecetype3
   pthree37 - piecetype3
   pthree38 - piecetype3
   pthree39 - piecetype3
   pthree40 - piecetype3
   pthree41 - piecetype3
   pthree42 - piecetype3
   pthree43 - piecetype3
   pthree44 - piecetype3
   pthree45 - piecetype3
   pthree46 - piecetype3
   pthree47 - piecetype3
   pthree48 - piecetype3
   pthree49 - piecetype3)
(:init
   (energy))
(:goal 
   (and (baked-structure pthree17 ptwo24) (baked-structure pone4 ptwo0) (baked-structure pthree18 ptwo17) (baked-structure pthree43 pone7) (baked-structure ptwo27 pthree27) (baked-structure pone10 pthree25) (baked-structure ptwo11 ptwo12) (baked-structure ptwo9 pthree29) (baked-structure pthree42 pthree1) (baked-structure pthree12 ptwo29) (baked-structure ptwo7 pone6) (baked-structure pone13 pone8) (baked-structure ptwo13 pone9) (baked-structure pthree28 ptwo3) (baked-structure ptwo1 pthree11) (baked-structure pthree15 pthree9) (baked-structure pthree35 pthree34) (baked-structure pone18 ptwo2) (baked-structure pthree24 ptwo8) (baked-structure pthree20 ptwo4) (baked-structure pthree30 pthree48) (baked-structure pone16 pthree0) (baked-structure pthree21 pone14) (baked-structure ptwo26 pthree3) (baked-structure pthree32 pthree31) (baked-structure ptwo18 pthree4) (baked-structure pthree36 pthree6) (baked-structure pthree8 ptwo10) (baked-structure pone1 pone2) (baked-structure pthree22 pone0) (baked-structure pthree14 ptwo21) (baked-structure ptwo22 pone19) (baked-structure pone17 pthree44) (baked-structure pone15 pthree26) (baked-structure pone3 pthree23) (baked-structure pthree39 pthree10) (baked-structure pone11 ptwo25) (baked-structure pthree41 pthree5) (baked-structure pthree7 ptwo14) (baked-structure ptwo28 ptwo15) (baked-structure pone12 pthree19) (baked-structure pthree47 pthree16) (baked-structure ptwo19 pthree40) (baked-structure pthree49 pthree38) (baked-structure pthree13 pthree33) (baked-structure ptwo5 ptwo23) (baked-structure pthree45 pthree2) (baked-structure ptwo20 ptwo6) (baked-structure pthree37 pone5) (baked-structure pthree46 ptwo16)))
)
