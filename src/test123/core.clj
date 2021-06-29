(ns test123.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn merge-two-lists
  [x y]
  (into x y))
