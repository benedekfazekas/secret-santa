(ns secret-santa.core)

(defn- rnd-pairs [participants]
  (let [receivers (shuffle participants)]
    (partition 2 (interleave participants receivers))))

(defn dearenged-pairs [participants]
  (let [pairs (rnd-pairs participants)]
    (if (some (fn [p] (= (first p) (second p))) pairs)
      (dearenged-pairs participants)
      pairs)))
