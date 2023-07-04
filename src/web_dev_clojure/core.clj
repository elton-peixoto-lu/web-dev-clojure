(ns web-dev-clojure.core
  (:require [ring.adapter.jetty :as jetty]))


(defn greet [req]
  (if (= "/" (:uri req))
  {:status  200
   :body  "Hello, World!"
   :headers {}}
  (if (= "/about" (:uri req))
    {:status  200
     :body    "My name is Elton, and i love Clojure s2"
     :headers {}}
    {:status  404
     :body    "Page not Found"
     :headers {}})))



(defn -main [port]
  (jetty/run-jetty greet
                   {:port (Integer. port)}))