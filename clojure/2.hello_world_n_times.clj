(defn hello_word_n_times [n]
  (if (> n 0)
    (do
      (println "Hello World")
      (recur (dec n)))))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
