10 

; prints 10

(+ 5 3 4) 

; adds 5, 3, and 4 to give 12

(- 9 1) 

; Subtracts 1 from 9, giving 8

(/ 6 2)

; divides 6 by 2, giving 3

(+ (* 2 4) (- 4 6))

; multiplies 2 by 4 (giving 8)
; subtracts 6 from 4 (giving -2)
; Adds 8 and -2, giving 6

(def a 3) 

; Defines an object, `a`, which has value 3

(def b (+ a 1))

; Adds 1 to `a` (giving 4). Then assigns that value to `b`.

(+ a b (* a b))

; Multiplies `a` by `b` (giving 12)
; Adds `a` and `b`, and 12 (3 + 4 + 12)
; giving 19

(= a b)

; Tests for equality of `a` and `b`
; returning FALSE

(if (and (> b a) (< b (* a b)))
  b 
  a)

; Multiplies `a` and `b` (giving 12)
; Tests if 4 is less than 12 (returns TRUE)
; Tests if 4 is greater than 3 (returns TRUE)
; Asks if both of those logicals are true, returns TRUE
; returns `b`

(cond ((= a 4) 6)
      ((= b 4) (+ 6 7 a))
      (else 25))

; `a` is not equal to 4
; `b` is equal to 4, so it adds 6 + 7 + `a` (3)
; it will return 16

(+ 2 (if (> b a) b a))

; Tests if `b` (4) is greater than `a` (3).
; It is, so it returns the first response, `b`
; It returns 4

(* (cond ((> a b) a)
         ((< a b) b)
         (else -1))
    (+ a 1))

; returns `b`, since `a` is less than `b`
; Then adds 1 to `a`, giving 4.
; Then multiplies `b`, and 4, giving 16