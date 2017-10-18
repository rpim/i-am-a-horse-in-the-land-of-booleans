(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
   (if(= x false) false
     (if(= x nil) false true))
  )

(defn abs [x]
  (if(< x 0) (- x) x )
  )

(defn divides? [divisor n]
  (if(= (mod n divisor) 0) true false)
  )

(defn fizzbuzz [n]
  (if (= (mod n 15) 0) "gotcha!"
    (if(= (mod n 5) 0) "buzz"
     (if(= (mod n 3) 0) "fizz"
       "")))
  
  
  )

(defn teen? [age]
  (if(<= 13 age 19) true false)
  )

(defn not-teen? [age]
  (if(not (teen? age)) true false)
  
  )

(defn generic-doublificate [x]
  (if(number? x) (* x 2)
    (if(empty? x) nil
      (if(list? x) (* (count x) 2)
        (if(vector? x) (* (count x) 2)
          true))))
  
  
  )

(defn leap-year? [year]
  (if(= (mod year 400) 0) true
    (if(= (mod year 100) 0) false
      (if(= (mod year 4) 0) true
        false)))
  
  
  )

; '_______'
