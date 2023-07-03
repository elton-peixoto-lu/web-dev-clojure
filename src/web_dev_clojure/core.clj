(ns web-dev-clojure.core
  (:require [ring.adapter.jetty :as jetty]))

(defn -main [port]
  (jetty/run-jetty (fn [req] {:status 200 :body "Hello, World!" :headers {}})
                   {:port (Integer. port)}))