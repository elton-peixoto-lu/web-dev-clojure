(ns web-dev-clojure.core
  (:require [ring.adapter.jetty :as jetty]))


(defn greet [req]
  (if (= "/" (:uri req))
  {:status  200
   :body  "Hello, World!"
   :headers {}}
  {:status 404
   :body "Page not Found"
   :headers {}}))



(defn -main [port]
  (jetty/run-jetty greet
                   {:port (Integer. port)}))