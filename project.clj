(defproject crello "0.1.0-SNAPSHOT"
  :description "Experiments with Clojure and Trello"
  :url "https://github.com/Bargs/crello"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "0.9.0"]]
  :main ^:skip-aot crello.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
