(ns crello.core
  (:require [clj-http.client :as client])
  (:require [clojure.edn :as edn])
  (:require [clojure.java.io :as jio])
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))

(def secrets (edn/read-string (slurp (jio/resource "secrets.edn"))))

(defn testGet [url]
  (:body (client/get (str url "?key=" (:trelloAppKey secrets)) {:as :json})))

(defn userGet [url & params]
  (:body (client/get (str url "?key=" (:trelloAppKey secrets) "&"
                          (clojure.string/join "&" (conj params (str "token=" (:userToken secrets)))))
                     {:as :json})))

(testGet "https://api.trello.com/1/boards/4d5ea62fd76aa1136000000c")

(userGet "https://api.trello.com/1/members/my/boards")

(userGet "https://api.trello.com/1/boards/vemYchOt")

(pprint (userGet "https://api.trello.com/1/boards/vemYchOt" "lists=open"))

(pprint (userGet "https://api.trello.com/1/lists/52d19741fcb401c056b27eb7" "cards=open"))

(pprint (map :name (:cards (userGet "https://api.trello.com/1/lists/52d19741fcb401c056b27eb7" "cards=open"))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
