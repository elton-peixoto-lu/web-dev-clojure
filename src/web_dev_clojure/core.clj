(ns web-dev-clojure.core
  (:require [ring.adapter.jetty :as jetty]))


(defn greet [req]
  {:status  200
   :body    "Hello, World!"
   :headers {}})

(defn -main [port]
  (jetty/run-jetty greet
                   {:port (Integer. port)}))