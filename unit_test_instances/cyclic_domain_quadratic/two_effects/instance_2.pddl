;;This instance is unsolvable. The only way to make b less than 0, is by means of c
;which is undefined. There is no way to make c defined without making b inconsistent
(define 
    (problem instance1)
    (:domain cyclicdomain)
    (:init
        (= (a) 0)
        (= (b) 1)
    )
    (:goal 
        (<= (b) 0)
    )
)
