(ns codewar-kata.count-digit-test
  (:require [clojure.test :refer :all]
            [codewar-kata.count-digit :refer :all]))

(deftest test-count-digit
  (testing "count digits"
    (is (= (nb-dig 10 1) 4))
    (is (= (nb-dig 25 1) 11))
    (is (= (nb-dig 5750 0) 4700))
    (is (= (nb-dig 11011 2) 9481))
    (is (= (nb-dig 12224 8) 7733))
    (is (= (nb-dig 11549 1) 11905))
    ))
