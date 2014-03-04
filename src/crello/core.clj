(ns crello.core
  (:require [clj-http.client :as client])
  (:gen-class))

(defn testGet [url]
  (:body (client/get url {:as :json})))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
