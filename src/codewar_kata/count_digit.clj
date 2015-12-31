(ns codewar-kata.count-digit)

(defn count-digits [d]
  (fn [n]
    (let [to-chars #(->> % str seq)
          dc (->> d to-chars first)
          is-dc #(= % dc)]
      (->> n to-chars (filter is-dc) count))))

(defn nb-dig [n d]
  (let [xs (->> n inc (range 0))]
   (->> xs (map #(* % %)) (map (count-digits d)) (apply +))))

(nb-dig 5750 0)
