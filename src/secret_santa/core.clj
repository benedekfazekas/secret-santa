(ns secret-santa.core)

(defn- rnd-pair-up [participants]
  (let [receivers (shuffle participants)]
    (partition 2 (interleave participants receivers))))

(defn pair-up [participants]
  (let [pairs (rnd-pair-up participants)]
    (if (some (fn [p] (= (first p) (second p))) pairs)
      (pair-up participants)
      pairs)))
