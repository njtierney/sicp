(def sumsq 
  (fn [x y] 
    (+ (* x x)(* y y)))
  )

(sumsq 2 3)

(def two-largest-sumsq
  (fn [x y z]
    (cond
      (and (< x y) (< x z)) (sumsq y z)
      (and (< y z) (< y x)) (sumsq z x)
      (and (< z x) (< z y)) (sumsq x y)
      :else 0)
    )
  )

(two-largest-sumsq 1 2 3)
(two-largest-sumsq 3 2 1)
(two-largest-sumsq 4 7 8)

(+ 1 1)