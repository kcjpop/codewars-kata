(ns codewar-kata.human-readable-test
  (:require [clojure.test :refer :all]
            [codewar-kata.human-readable :refer :all]))

(deftest test-diff-for-human
  (testing "pluralize"
    (is (= (pluralize 1 "second") "1 second") "single")
    (is (= (pluralize 2 "second") "2 seconds") "plural"))
  (testing "format"
    (is (= (format-time-map {:value 0 :unit "year"}) "") "value is zero")
    (is (= (format-time-map {:value 1 :unit "year"}) "1 year") "value is 1")
    (is (= (format-time-map {:value 2 :unit "year"}) "2 years") "value is 2"))
  (testing "concat result"
    (is (= (concat-result ["1 second"]) "1 second") "1 item")
    (is (= (concat-result ["2 minutes" "1 second"]) "2 minutes and 1 second") "2 items")
    (is (= (concat-result ["3 days" "2 minutes" "1 second"]) "3 days, 2 minutes and 1 second") "3 items"))
  (testing "duration"
    (is (= (formatDuration 0) "now") "now")
    (is (= (formatDuration 1) "1 second") "1 second")
    (is (= (formatDuration 2) "2 seconds") "2 seconds")
    (is (= (formatDuration 60) "1 minute") "1 minute")
    (is (= (formatDuration 120) "2 minutes") "2 minutes")
    (is (= (formatDuration 122) "2 minutes and 2 seconds") "2 minutes and 2 seconds")
    (is (= (formatDuration 3722) "1 hour, 2 minutes and 2 seconds") "1 hour, 2 minutes and 2 seconds")
    (is (= (formatDuration 827209) "9 days, 13 hours, 46 minutes and 49 seconds") "9 days, 13 hours, 46 minutes and 49 seconds")
    ))
