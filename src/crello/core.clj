(ns crello.core
  (:require [clj-http.client :as client])
  (:require [clojure.edn :as edn])
  (:require [clojure.java.io :as jio])
  (:gen-class))

(def secrets (edn/read-string (slurp (jio/resource "secrets.edn"))))

(defn testGet [url]
  (:body (client/get (str url "?key=" (:trelloAppKey secrets)) {:as :json})))

(testGet "https://api.trello.com/1/boards/4d5ea62fd76aa1136000000c")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
