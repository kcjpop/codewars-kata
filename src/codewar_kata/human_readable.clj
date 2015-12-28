(ns codewar-kata.human-readable)

(defn pluralize [n unit ]
  (if (> n 1)
    (str n " " unit "s")
    (str n " " unit))
  )

(defn make-time-list [s]
  (let [years (quot s 31536000)
        year-rem (rem s 31536000)
        days (quot year-rem 86400)
        day-rem (rem year-rem 86400)
        hours (quot day-rem 3600)
        hour-rem (rem day-rem 3600)
        minutes (quot hour-rem 60)
        seconds (rem hour-rem 60)
       ]
       [{:unit "year" :value years}
        {:unit "day" :value days}
        {:unit "hour" :value hours}
        {:unit "minute" :value minutes}
        {:unit "second" :value seconds}]))
       
(defn format-time-map [rec]
  (if (== 0 (:value rec))
    ""
    (pluralize (:value rec) (:unit rec))))
    
(defn concat-result [result]
  (if (= 1 (count result))
    (apply str result)
    (let [init (drop-last result)
        last-item (last result)]
        (str (clojure.string/join ", " init) " and " last-item))))
  
(defn formatDuration [secs]
  (if (= secs 0)
    "now"
    ; Contruct a list as [years days hours minutes seconds]
    ; Map the list above into a result string
    ; Filter out empty values
    ; Concat with commas and "and" if nessearry
    (let [time-list (make-time-list secs)]
      (->> time-list (map format-time-map) (filter not-empty) concat-result))))
