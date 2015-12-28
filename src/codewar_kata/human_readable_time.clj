(ns codewar-kata.human-readable-time)

(defn zero-padding [n]
  (if (< n 10)
    (str "0" n)
    (str n)))

(defn make-time-list [s]
  (let [hours (quot s 3600)
        hour-rem (rem s 3600)
        minutes (quot hour-rem 60)
        seconds (rem hour-rem 60)]
    [hours minutes seconds]))

(defn human-readable [s]
  (->> s make-time-list (map zero-padding) (clojure.string/join ":")))

y
